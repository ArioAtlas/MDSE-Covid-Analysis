package se.lnu.joa.covid.model.usage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
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
import se.lnu.joa.covid.model.config.Config;
import se.lnu.joa.covid.model.config.ConfigFactory;
import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;
import se.lnu.joa.covid.model.config.Regression;
import se.lnu.joa.covid.model.config.RegressionType;
import se.lnu.joa.covid.model.config.Visualization;
import se.lnu.joa.covid.model.config.VisualizationType;
import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.DataPackage;
import se.lnu.joa.covid.model.data.DataPool;
import se.lnu.joa.covid.model.data.Epidemiology;
import se.lnu.joa.covid.model.data.Health;
import se.lnu.joa.covid.model.data.Index;


public class UsingEmfModel {
    public static void main(String[] args) {
    	
    	final String configFile = "config.yaml";
    	final String indexFile = "index.csv";
    	final String epidemiologyFile = "epidemiology.csv";
    	final String healthFile = "health.csv";
    
    	
		try {
			EcorePackage.eINSTANCE.eClass();    // Makes sure EMF is up and running
			DataPackage.eINSTANCE.eClass(); 
			ConfigPackage.eINSTANCE.eClass();
			AnalysisPackage.eINSTANCE.eClass();
			
			// Read input files
			DataPool pool = readCsvData(indexFile, epidemiologyFile, healthFile);
	        Config config = readConfig(configFile);
	        
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
	        

	        
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			
			m.put("dataModel", new XMIResourceFactoryImpl());
			m.put("configModel", new XMIResourceFactoryImpl());
			
			
			// Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();
	        
	        // Create resources
	        Resource dataResource = resSet.createResource(URI.createURI("dataModel/My2.dataModel"));
	        Resource configResource = resSet.createResource(URI.createURI("configModel/My2.configModel"));
	        
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        dataResource.getContents().add(pool);
	        configResource.getContents().add(config);
	        	        
	        // Save the content.
	        try {
	        	dataResource.save(Collections.EMPTY_MAP);
	            configResource.save(Collections.EMPTY_MAP);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
	        // create executor for the QVT transformation	        
	        TransformationExecutor executor = new TransformationExecutor(
	        		URI.createURI("../Covid19QVT/transforms/CsvToCsvTransformation.qvto"));
	        			
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
		        List<EObject> outObjects = output.getContents();
		        
		        URI outUri = URI.createURI("outM/ttt.configModel");
		        
		        Resource res = resSet.createResource(outUri);
		        res.getContents().addAll(outObjects);
		        
		        try {
		            res.save(Collections.emptyMap());
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    } else {
		        IStatus status = BasicDiagnostic.toIStatus(result);
		        System.err.println("Error status " + status);
		    }
								        
			/* Temporarily commented out
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("Covid19", new XMIResourceFactoryImpl());
			
			URI uri = URI.createURI("platform:/resource/covid19/model/DataPool.xmi");
				        			
			resourceSet.createResource(uri).getContents().add(pool);
						
			URI transformationURI = URI.createURI("platform:/resource/Covid19QVT/transforms/DataAndConfigToAnalytic.qvto"); 
			
			// Define the transformation input
			Resource inResource = resourceSet.getResource(uri, false);
			EList<EObject> inObjects = inResource.getContents(); 
						
			// Create the Input and Output Models
			ModelExtent dataModel = new BasicModelExtent(inObjects);
			ModelExtent configModel = new BasicModelExtent(inObjects); // create new basic model for configuration model (MM2), but the argument must be changed!
			ModelExtent outModel = new BasicModelExtent();
						
			// Set up execution environment and configuration properties
			TransformationExecutor executor = new TransformationExecutor(transformationURI);
			ExecutionContextImpl context = new ExecutionContextImpl();
	
			ExecutionDiagnostic result = executor.execute(context, dataModel, configModel, outModel); // update to a transformation with 2 input and 1 output
			System.out.println(executor.loadTransformation());
			
			if (result.getSeverity() == Diagnostic.OK) {
				// The objects got captured in outModel => save into resource
				List<EObject> outObjects = outModel.getContents();
				ResourceSet resourceSet2 = new ResourceSetImpl();
				Resource outResource = resourceSet2.getResource(
						URI.createURI("HealthData.Covid19.New"), false); // TODO: Change the URI!!
				outResource.getContents().addAll(outObjects);
				outResource.save(Collections.emptyMap());
			} else {
				System.err.println("Error in running transformation\n"+result.getMessage()); // Check if there was any issue in transformation
				
			}
			
			*/
						
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
    	
        
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
			dm.getColumns().addAll(Arrays.asList(aConfig.getDataModel().getColumns()));
			
			
			// Create a Visualization from config file
			Visualization vlz = configFactory.createVisualization();
			vlz.setType(VisualizationType.get(aConfig.getVisualization().getType()));
			vlz.setXAxis(aConfig.getVisualization().getxAxis());
			vlz.setYAxis(aConfig.getVisualization().getyAxis());
			vlz.setColor(aConfig.getVisualization().getColor());
			vlz.setTitle(aConfig.getVisualization().getTitle());
			vlz.setSubTitle(aConfig.getVisualization().getSubTitle());
			vlz.setXAxisLabel(aConfig.getVisualization().getxAxisLabel());
			vlz.setYAxisLabel(aConfig.getVisualization().getyAxisLabel());
			vlz.setCaption(aConfig.getVisualization().getCaption());
			 
			// create a Animation from config file
			Animation ani = configFactory.createAnimation();
			ani.setLabel(aConfig.getAnimation().getLabel());
			ani.setTransitionTime(aConfig.getAnimation().getTransitionTime());
			ani.setWidth(aConfig.getAnimation().getWidth());
			ani.setHeight(aConfig.getAnimation().getHeight());
			ani.setDuration(aConfig.getAnimation().getDuration());
			ani.setOutputName(aConfig.getAnimation().getOutputName());
			ani.setOutputPath(aConfig.getAnimation().getOutputPath());
			//ani.validate(diagnostic, context);
			
			
			// create Regression from config file
			Regression reg = configFactory.createRegression();
			reg.setType(RegressionType.get(aConfig.getRegression().getType()));
			reg.setDependentValue(aConfig.getRegression().getDependentValue());
			reg.setIndependentValue(aConfig.getRegression().getIndependentValue());
			
			config.setSource(dm);
			config.setVisualization(vlz);
			config.setAnimation(ani);
			config.setRegression(reg);
			
			return config;
			
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return null;
    }
    
    private static DataPool readCsvData(String indexFile,String epidemiologyFile,String healthFile) throws IOException {
    	Path indexPath = FileSystems.getDefault().getPath(indexFile);
        Path epidemiologyPath = FileSystems.getDefault().getPath(epidemiologyFile);
        Path healthPath = FileSystems.getDefault().getPath(healthFile);
        
        // Retrieve the default factory singleton
        DataFactory factory = DataFactory.eINSTANCE;
        
        // Create an instance of DataPool
        DataPool pool = factory.createDataPool();
		
        // Index
        Reader in = new FileReader(indexPath.toString());
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		int i = 0;
		for (CSVRecord record : records) {
			if (i > 0) {
				// Create a record
			    Index id = factory.createIndex();
			    
			    // Fill record with data
		        id.setKey(record.get(0));
		        id.setWikidata(record.get(1));
		        id.setDatacommons(record.get(2));
		        id.setCountry_code(record.get(3));
		        id.setCountry_name(record.get(4));
		        id.setSubregion1_code(record.get(5));
		        id.setSubregion1_name(record.get(6));
		        id.setSubregion2_code(record.get(7));
		        id.setSubregion2_name(record.get(8));
		        id.setLocality_code(record.get(9));
		        id.setLocality_name(record.get(10));
		        id.setAlpha_2(record.get(11));
		        id.setAlpha_3(record.get(12));
		        id.setAggregation_level(Integer.parseInt(record.get(13)));
		        
		        // Add record to Index data
		        pool.getIndexData().add(id);
			}
			
			i = i + 1;
		}
		
		// Epidemiology
		in = new FileReader(epidemiologyPath.toString());
		records = CSVFormat.EXCEL.parse(in);
		i = 0;
		for (CSVRecord record : records) {
			if (i > 0) {
				// Create a record
			    Epidemiology ed = factory.createEpidemiology();
			    
			    // Fill record with data
			    ed.setDate(record.get(0));
		        ed.setKey(record.get(1));
		        
		        if (record.get(2).equals("")) {
		        	ed.setNew_confirmed(0);
		        } else {
		        	ed.setNew_confirmed(Integer.parseInt(record.get(2)));
		        }
		        
		        if (record.get(3).equals("")) {
		        	ed.setNew_deceased(0);
		        } else {
		        	ed.setNew_deceased(Integer.parseInt(record.get(3)));
		        }
		        
		        if (record.get(4).equals("")) {
		        	ed.setNew_recovered(0);
		        } else {
		        	ed.setNew_recovered(Integer.parseInt(record.get(4)));
		        }
		        
		        if (record.get(5).equals("")) {
		        	ed.setNew_tested(0);
		        } else {
		        	ed.setNew_tested(Integer.parseInt(record.get(5)));
		        }
		        
		        if (record.get(6).equals("")) {
		        	ed.setTotal_confirmed(0);
		        } else {
		        	ed.setTotal_confirmed(Integer.parseInt(record.get(6)));
		        }
		        
		        if (record.get(7).equals("")) {
		        	ed.setTotal_deceased(0);
		        } else {
		        	ed.setTotal_deceased(Integer.parseInt(record.get(7)));
		        }
		        
		        if (record.get(8).equals("")) {
		        	ed.setTotal_recovered(0);
		        } else {
		        	ed.setTotal_recovered(Integer.parseInt(record.get(8)));
		        }
		        
		        if (record.get(9).equals("")) {
		        	ed.setTotal_tested(0);
		        } else {
		        	ed.setTotal_tested(Integer.parseInt(record.get(9)));
		        }
		        		        
		        // Add record to Epidemiology data
		        pool.getEpidemiologyData().add(ed);
			}
			
			i = i + 1;
		}
		
		// Health
		in = new FileReader(healthPath.toString());
		records = CSVFormat.EXCEL.parse(in);
		i = 0;
		for (CSVRecord record : records) {
			if (i > 0) {
				// Create a record
			    Health hd = factory.createHealth();
			    
			    // Fill record with data
		        hd.setKey(record.get(0));
		       
		        if (record.get(1).equals("")) {
		        	hd.setLife_expectancy(Double.NaN);
		        } else {
		        	hd.setLife_expectancy(Double.parseDouble(record.get(1)));
		        }
		        
		        if (record.get(2).equals("")) {
		        	hd.setSmoking_prevalence(Double.NaN);
		        } else {
		        	hd.setSmoking_prevalence(Double.parseDouble(record.get(2)));
		        }
		        
		        if (record.get(3).equals("")) {
		        	hd.setDiabetes_prevalence(Double.NaN);
		        } else {
		        	hd.setDiabetes_prevalence(Double.parseDouble(record.get(3)));
		        }
		        
		        if (record.get(4).equals("")) {
		        	hd.setInfant_mortality_rate(Double.NaN);
		        } else {
		        	hd.setInfant_mortality_rate(Double.parseDouble(record.get(4)));
		        }
		        
		        if (record.get(5).equals("")) {
		        	hd.setAdult_male_mortality_rate(Double.NaN);
		        } else {
		        	hd.setAdult_male_mortality_rate(Double.parseDouble(record.get(5)));
		        }
		        
		        if (record.get(6).equals("")) {
		        	hd.setAdult_female_mortality_rate(Double.NaN);
		        } else {
		        	hd.setAdult_female_mortality_rate(Double.parseDouble(record.get(6)));
		        }
		        
		        if (record.get(7).equals("")) {
		        	hd.setPollution_mortality_rate(Double.NaN);
		        } else {
		        	hd.setPollution_mortality_rate(Double.parseDouble(record.get(7)));
		        }
		        
		        if (record.get(8).equals("")) {
		        	hd.setComorbidity_mortality_rate(Double.NaN);
		        } else {
		        	hd.setComorbidity_mortality_rate(Double.parseDouble(record.get(8)));
		        }
		        
		        if (record.get(9).equals("")) {
		        	hd.setHospital_beds(Double.NaN);
		        } else {
		        	hd.setHospital_beds(Double.parseDouble(record.get(9)));
		        }
		        
		        if (record.get(10).equals("")) {
		        	hd.setNurses(Double.NaN);
		        } else {
		        	hd.setNurses(Double.parseDouble(record.get(10)));
		        }
		        
		        if (record.get(11).equals("")) {
		        	hd.setPhysicians(Double.NaN);
		        } else {
		        	hd.setPhysicians(Double.parseDouble(record.get(11)));
		        }
		        
		        if (record.get(12).equals("")) {
		        	hd.setHealth_expenditure(Double.NaN);
		        } else {
		        	hd.setHealth_expenditure(Double.parseDouble(record.get(12)));
		        }
		        
		        if (record.get(13).equals("")) {
		        	hd.setOut_of_pocket_health_expenditure(Double.NaN);
		        } else {
		        	hd.setOut_of_pocket_health_expenditure(Double.parseDouble(record.get(13)));
		        }
		        		        
		        // Add record to Health data
		        pool.getHealthData().add(hd);
			}
			
			i = i + 1;
		}
		
		return pool;
    }
}

//for(Index item : pool.getIndexData()) {
//	System.out.print("Key: ");
//	System.out.println(item.getKey());
//	System.out.print("Wikidata: ");
//	System.out.println(item.getWikidata());
//	System.out.print("Datacommons: ");
//	System.out.println(item.getDatacommons());
//	System.out.print("Country Code: ");
//	System.out.println(item.getCountry_code());
//	System.out.print("Country Name: ");
//	System.out.println(item.getCountry_name());
//	System.out.print("Subregion 1 code: ");
//	System.out.println(item.getSubregion1_code());
//	System.out.print("Subregion 1 name: ");
//	System.out.println(item.getSubregion1_name());
//	System.out.print("Subregion 2 code: ");
//	System.out.println(item.getSubregion2_code());
//	System.out.print("Subregion 2 name: ");
//	System.out.println(item.getSubregion2_name());
//	System.out.print("Locality code: ");
//	System.out.println(item.getLocality_code());
//	System.out.print("Locality name: ");
//	System.out.println(item.getLocality_name());
//	System.out.print("3166-1-alpha-2: ");
//	System.out.println(item.getAlpha_2());
//	System.out.print("3166-1-alpha-3: ");
//	System.out.println(item.getAlpha_3());
//	System.out.print("Aggregation Level: ");
//	System.out.println(item.getAggregation_level());
//	System.out.println("\n");
//}

//for(Epidemiology item : pool.getEpidemiologyData()) {
//	System.out.print("Key: ");
//	System.out.println(item.getKey());
//	System.out.print("Date: ");
//	System.out.println(item.getDate());
//	System.out.print("New Confirmed cases: ");
//	System.out.println(item.getNew_confirmed());
//	System.out.print("New Deceased cases: ");
//	System.out.println(item.getNew_deceased());
//	System.out.print("New Recovered cases: ");
//	System.out.println(item.getNew_recovered());
//	System.out.print("New Tested cases: ");
//	System.out.println(item.getNew_tested());
//	System.out.print("Total Confirmed cases: ");
//	System.out.println(item.getTotal_confirmed());
//	System.out.print("Total Deceased cases: ");
//	System.out.println(item.getTotal_deceased());
//	System.out.print("Total Recovered cases: ");
//	System.out.println(item.getTotal_recovered());
//	System.out.print("Total Tested cases: ");
//	System.out.println(item.getTotal_tested());
//	System.out.println("\n");
//}

//for(Health item : pool.getHealthData()) {
//	System.out.print("Key: ");
//	System.out.println(item.getKey());
//	System.out.print("Life Expectancy: ");
//	System.out.println(item.getLife_expectancy());
//	System.out.print("Smoking Prevalence: ");
//	System.out.println(item.getSmoking_prevalence());
//	System.out.print("Diabetes Prevalence: ");
//	System.out.println(item.getDiabetes_prevalence());
//	System.out.print("Infant Morality Rate: ");
//	System.out.println(item.getInfant_mortality_rate());
//	System.out.print("Adult Male Morality Rate: ");
//	System.out.println(item.getAdult_male_mortality_rate());
//	System.out.print("Adult Female Morality Rate: ");
//	System.out.println(item.getAdult_female_mortality_rate());
//	System.out.print("Pollution Morality Rate: ");
//	System.out.println(item.getPollution_mortality_rate());
//	System.out.print("Cormobidity Morality Rate: ");
//	System.out.println(item.getComorbidity_mortality_rate());
//	System.out.print("Hospital Beds: ");
//	System.out.println(item.getHospital_beds());
//	System.out.print("Nurses: ");
//	System.out.println(item.getNurses());
//	System.out.print("Physicians: ");
//	System.out.println(item.getPhysicians());
//	System.out.print("Health Expenditure: ");
//	System.out.println(item.getHealth_expenditure());
//	System.out.print("Out of Pocket Health Expenditure: ");
//	System.out.println(item.getOut_of_pocket_health_expenditure());
//	System.out.println("\n");
//}