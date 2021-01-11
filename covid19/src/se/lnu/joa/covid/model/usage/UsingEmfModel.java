package se.lnu.joa.covid.model.usage;

import Covid19Acceleo.main.Generate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.*;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.config.Animation;
import se.lnu.joa.covid.model.config.Axes;
import se.lnu.joa.covid.model.config.Axis;
import se.lnu.joa.covid.model.config.Config;
import se.lnu.joa.covid.model.config.ConfigFactory;
import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;
import se.lnu.joa.covid.model.config.Filter;
import se.lnu.joa.covid.model.config.Regression;
import se.lnu.joa.covid.model.config.RegressionType;
import se.lnu.joa.covid.model.config.Scale;
import se.lnu.joa.covid.model.config.ScaleType;
import se.lnu.joa.covid.model.config.Visualization;
import se.lnu.joa.covid.model.config.VisualizationInfo;
import se.lnu.joa.covid.model.config.VisualizationType;
import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.DataPackage;
import se.lnu.joa.covid.model.data.DataPool;
import se.lnu.joa.covid.model.data.DataSet;
import se.lnu.joa.covid.model.data.DataSource;
import se.lnu.joa.covid.model.data.DateSet;
import se.lnu.joa.covid.model.data.DoubleSet;
import se.lnu.joa.covid.model.data.IntSet;
import se.lnu.joa.covid.model.data.StringSet;


public class UsingEmfModel {
    public static void main(String[] args) {
    	
    	final String configFile = "config.yaml";
    	final String dataPoolSrc = "./data_pool";
    	final File folder = new File(dataPoolSrc);
    
    	System.out.println("Configuration: "+configFile);
    	System.out.println("Data Pool: "+dataPoolSrc);
    	
		try {
			System.out.print("\nInitialing Meta Models ");
			EcorePackage.eINSTANCE.eClass();    // Makes sure EMF is up and running
			System.out.print(".");
			DataPackage.eINSTANCE.eClass(); 
			System.out.print(".");
			ConfigPackage.eINSTANCE.eClass();
			System.out.print(".");
			AnalysisPackage.eINSTANCE.eClass();
			System.out.print(".");
			
			// Read input files
			System.out.print("\nCreating Data Model Intance ...");
			DataPool pool = readCsvData(folder);
			System.out.print("\nCreating Config Model Intance ...");
	        Config config = readConfig(configFile);
	        
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			
			m.put("model", new XMIResourceFactoryImpl());			
			
			// Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();
	        
	        // Create resources
	        Resource dataResource = resSet.createResource(URI.createURI("generatedModels/data.model"));
	        Resource configResource = resSet.createResource(URI.createURI("generatedModels/config.model"));
	        
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        dataResource.getContents().add(pool);
	        configResource.getContents().add(config);
	        
	        System.out.println("\n");
	        	        
	        // Save the content.
	        try {
	        	dataResource.save(Collections.EMPTY_MAP);
	        	System.out.println("Data model instance has saved at ./generatedModels/data.model");
	            configResource.save(Collections.EMPTY_MAP);
	            System.out.println("Config model instance has saved at ./generatedModels/config.model");
	        } catch (IOException e) {
	        	System.err.println("Error in saving model intances");
	            e.printStackTrace();
	        }
	        
	        System.out.println("\nModel to Model Transformation from DataModel+ConfigModel to AnalysisModel");
	        
	        // create executor for the QVT transformation	        
	        TransformationExecutor executor = new TransformationExecutor(
	        		URI.createURI("../Covid19QVT/transforms/DataAndConfigToAnalytic.qvto"));
	        			
			// Define the transformation input and create the input extent with its initial contents
			ModelExtent input1 = new BasicModelExtent(dataResource.getContents());
			ModelExtent input2 = new BasicModelExtent(configResource.getContents());

			
			// Create an empty extent to catch the output
			ModelExtent output = new BasicModelExtent();
			
			
			// Setup the execution environment details -> configuration properties, logger, monitor object etc.
			ExecutionContextImpl context = new ExecutionContextImpl();
			OutputStreamWriter outStream = new OutputStreamWriter(System.out);
		    Log log = new WriterLog(outStream);
		    context.setLog(log);
		    
			
		    
			// Run the transformation assigned to the executor with the given 
			// input and output and execution context -> ChangeTheWorld(in, out)
			// Remark: variable arguments count is supported
			ExecutionDiagnostic result = executor.execute(context, input1, input2, output);
			

			if (result.getSeverity() == Diagnostic.OK) {
				System.out.println("\nM2M Transformation has been compeleted");
		        List<EObject> outObjects = output.getContents();
		        
		        URI outUri = URI.createURI("generatedModels/analysis.model");
		        
		        Resource res = resSet.createResource(outUri);
		        res.getContents().addAll(outObjects);
		        
		        try {
		            res.save(Collections.emptyMap());
		            System.out.println("Generated Analysis Model has saved at ./generatedModels/analysis.model");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		        try {
		        	System.out.println("\nModel to Text Transformation from AnalysisModel to .CSV data file and .R source code");
					final File outputDir = new File("outputDir/");
					List<String> arguments = new ArrayList<String>();
					/*fc is an instance of a EMF Compare Comparison object
					 * the nsURI for it is http://www.eclipse.org/emf/compare
					 */
					System.out.println("M2T Trasformation has been Startet");
					Generate generator = new Generate(outUri, outputDir, arguments);                                 
					            generator.doGenerate(new BasicMonitor());
					
					System.out.println("M2T Transformation has been completed");
					System.out.println("M2T Transformation result saved at ./outputDir");
				} catch (IOException e) {
					System.err.println("Error in M2T Transformation");
					e.printStackTrace();
				}
				
		        
		    } else {
		        IStatus status = BasicDiagnostic.toIStatus(result);
		        System.err.println("Error status " + status);
		    }
						
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		System.out.println("\nTransformation Completed");
        
    }
    
    private static Config readConfig(String configSource) {
        ConfigFactory configFactory = ConfigFactory.eINSTANCE;
    	Config config = configFactory.createConfig();
    	
    	Yaml yaml = new Yaml(new Constructor(AnalyticConfig.class));
    	try {
			InputStream inputStream = new FileInputStream(configSource);
			
			// Load YAML file to the proper POJO class
			AnalyticConfig aConfig = yaml.load(inputStream);
		
						
			// Create a DataModel from config file
			DataModel dm = configFactory.createDataModel();
			dm.setDataSource(aConfig.getDataModel().getDataSource());
			dm.setDatasetName(aConfig.getDataModel().getDatasetName());
			dm.getColumns().addAll(aConfig.getDataModel().getColumns());
			for (DataFilter filter : aConfig.getDataModel().getFilters()) {
				Filter f = configFactory.createFilter();
				f.setKey(filter.getKey());
				f.setValue(filter.getValue());
				dm.getFilters().add(f);
			}
			dm.setDateFormat(aConfig.getDataModel().getDateformat());
			config.setSource(dm);
			
			
			// Create a Visualization from config file
			Visualization vlz = configFactory.createVisualization();
			vlz.setType(VisualizationType.get(aConfig.getVisualization().getType()));
			
			// Setup Axes
			if(aConfig.getVisualization().getAxes()!=null) {
				Axes axes = configFactory.createAxes();
				
				if(aConfig.getVisualization().getAxes().getX()!=null) {
					Axis ax = configFactory.createAxis();
					ax.setColumn(aConfig.getVisualization().getAxes().getX().getColumn());
					ax.setLabel(aConfig.getVisualization().getAxes().getX().getLabel());
					
					if(aConfig.getVisualization().getAxes().getX().getScale()!=null) {
						Scale xScale = configFactory.createScale();
						xScale.setType(ScaleType.get(aConfig.getVisualization().getAxes().getX().getScale().getType()));
						xScale.setFormat(aConfig.getVisualization().getAxes().getX().getScale().getFormat());
						xScale.setBreaks(aConfig.getVisualization().getAxes().getX().getScale().getBreaks());
						ax.setScale(xScale);
					}
					
					axes.setX(ax);
				}
				
				if(aConfig.getVisualization().getAxes().getY()!=null) {
					Axis ay = configFactory.createAxis();
					ay.setColumn(aConfig.getVisualization().getAxes().getY().getColumn());
					ay.setLabel(aConfig.getVisualization().getAxes().getY().getLabel());
					
					if(aConfig.getVisualization().getAxes().getY().getScale()!=null) {
						Scale yScale = configFactory.createScale();
						yScale.setType(ScaleType.get(aConfig.getVisualization().getAxes().getY().getScale().getType()));
						yScale.setFormat(aConfig.getVisualization().getAxes().getY().getScale().getFormat());
						yScale.setBreaks(aConfig.getVisualization().getAxes().getY().getScale().getBreaks());
						ay.setScale(yScale);
					}
					
					axes.setY(ay);
				}

				if(aConfig.getVisualization().getAxes().getZ()!=null) {
					Axis az = configFactory.createAxis();
					az.setColumn(aConfig.getVisualization().getAxes().getZ().getColumn());
					az.setLabel(aConfig.getVisualization().getAxes().getZ().getLabel());
					
					if(aConfig.getVisualization().getAxes().getZ().getScale()!=null) {
						Scale zScale = configFactory.createScale();
						zScale.setType(ScaleType.get(aConfig.getVisualization().getAxes().getZ().getScale().getType()));
						zScale.setFormat(aConfig.getVisualization().getAxes().getZ().getScale().getFormat());
						zScale.setBreaks(aConfig.getVisualization().getAxes().getZ().getScale().getBreaks());
						az.setScale(zScale);
					}
					
					axes.setZ(az);
				}
				
				vlz.setAxes(axes);
			}
			
			if(aConfig.getVisualization().getInfo()!=null) {
				VisualizationInfo vInfo = configFactory.createVisualizationInfo();
				vInfo.setTitle(aConfig.getVisualization().getInfo().getTitle());
				vInfo.setSubTitle(aConfig.getVisualization().getInfo().getSubTitle());
				vInfo.setCaption(aConfig.getVisualization().getInfo().getCaption());
				vlz.setInfo(vInfo);
				
			}
			
			if(aConfig.getVisualization().getSize()!=null) {
				vlz.setSize(aConfig.getVisualization().getSize());
			}
			config.setVisualization(vlz);
			 
			// create a Animation from config file
			if(aConfig.getAnimation()!=null) {
				Animation ani = configFactory.createAnimation();
				ani.setLabel(aConfig.getAnimation().getLabel());
				ani.setTransitionTime(aConfig.getAnimation().getTransitionTime());
				ani.setWidth(aConfig.getAnimation().getWidth());
				ani.setHeight(aConfig.getAnimation().getHeight());
				ani.setDuration(aConfig.getAnimation().getDuration());
				ani.setOutputName(aConfig.getAnimation().getOutputName());
				ani.setOutputPath(aConfig.getAnimation().getOutputPath());
				//ani.validate(diagnostic, context);
				config.setAnimation(ani);
				
				//validation of Animation height
		        BasicDiagnostic chain = new BasicDiagnostic();
		        config.getAnimation().validate(chain, new HashMap<Object, Object>());
		        if(!chain.getChildren().isEmpty())
		        {
		        	if(chain.getChildren().get(0).getSeverity() != Diagnostic.OK)
			        {
		        		System.out.println(chain.getChildren().get(0).getMessage());
			        }
		        }
			}
			
			// create Regression from config file
			if(aConfig.getRegression()!=null){
				Regression reg = configFactory.createRegression();
				reg.setType(RegressionType.get(aConfig.getRegression().getType()));
				reg.setDependentValue(aConfig.getRegression().getDependentValue());
				reg.setIndependentValue(aConfig.getRegression().getIndependentValue());
				config.setRegression(reg);
			}
			
			return config;
			
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return null;
    }
    
    private static DataPool readCsvData(File folder) throws IOException, ParseException {

        // Retrieve the default factory singleton
        DataFactory factory = DataFactory.eINSTANCE;
        
        // Create an instance of DataPool
        DataPool pool = factory.createDataPool();
        
        // create a file reader object
        Reader in;
        
        List<File> dataFiles = listFilesForFolder(folder);
        
        for(int i=0; i<dataFiles.size(); i++) {
        	        	
        	if(dataFiles.get(i).exists()) {
        		in = new FileReader(dataFiles.get(i).toString());
           
            	DataSource source = factory.createDataSource();
            	source.setName(dataFiles.get(i).getName().replace(".csv", ""));
            	source.setPath(dataFiles.get(i).getAbsolutePath());
            	
            	
            	Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            	
            	if(records.iterator().hasNext()) {
            		CSVRecord headers = records.iterator().next();
            		List<String> titles = new ArrayList<>();
            		
            		for(String title : headers) {
            			titles.add(title);
            		}
            		
            		int k = 0;
            		for (CSVRecord record : records) {
        				int c = 0;
            			for(String data : record) {
            				if(k==0) {
            					switch (getDataType(data)) {
								case INT:
									IntSet iSet = factory.createIntSet();
									iSet.getValues().add(Integer.parseInt(data));
									iSet.setTitle(titles.get(c));
									source.getData().add(iSet);
									break;
								case DOUBLE:
									DoubleSet dSet = factory.createDoubleSet();
									dSet.getValues().add(Double.parseDouble(data));
									dSet.setTitle(titles.get(c));
									source.getData().add(dSet);
									break;
								case DATE:
									DateSet tSet = factory.createDateSet();
									tSet.getValues().add(data.replace('/', '-'));
									tSet.setTitle(titles.get(c));
									source.getData().add(tSet);
									break;
								case STRING:
									StringSet sSet = factory.createStringSet();
									sSet.getValues().add(data);
									sSet.setTitle(titles.get(c));
									source.getData().add(sSet);
									break;
								}
            				}else {
            					DataSet ds = source.getData().get(c);
            					if(ds instanceof StringSet) {
            						((StringSet) ds).getValues().add(data);
            					}else if(ds instanceof IntSet) {
            						try {
            							((IntSet) ds).getValues().add(Integer.parseInt(data));
            						}catch (Exception e) {
            							((IntSet) ds).getValues().add(null);
									}
            					}else if(ds instanceof DoubleSet) {
            						try {
            							((DoubleSet) ds).getValues().add(Double.parseDouble(data));
            						}catch (Exception e) {
            							((DoubleSet) ds).getValues().add(null);
									}
            					}else if(ds instanceof DateSet) {
            						((DateSet) ds).getValues().add(data.replace('/', '-'));
            					}
            				}
            				c++;
            			}
            		
            			k++;
            		}
            	} 
            	
            	// Add the new data source to the data pool 
            	pool.getSources().add(source);
        	}
        }
	
		return pool;
    }
    
	static DataTypes getDataType(String value) {
    	try {
	    	Integer.parseInt(value);
	    	return DataTypes.INT;
    	}catch (Exception e) {
			// TODO: handle exception
		}try {
	    	Double.parseDouble(value);
	    	return DataTypes.DOUBLE;
    	}catch (Exception e) {
			// TODO: handle exception
		}try {
			if(value.matches("\\d{1,4}(-|\\/)\\d{1,2}(-|\\/)\\d{1,4}"))
				return DataTypes.DATE;
    	}catch (Exception e) {
			// TODO: handle exception
    		
		}
		return DataTypes.STRING;
    }
	
	public static List<File> listFilesForFolder(final File folder) {
		List<File> files = new ArrayList<>();
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            files.addAll(listFilesForFolder(fileEntry));
	        } else {
	            files.add(fileEntry);
	        }
	    }
	    
	    return files;
	}

}
