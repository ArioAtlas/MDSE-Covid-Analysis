package se.lnu.joa.covid.model.usage;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import se.lnu.joa.covid.model.covid19.Covid19Factory;
import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.DataPool;
import se.lnu.joa.covid.model.covid19.Epidemiology;
import se.lnu.joa.covid.model.covid19.Health;
import se.lnu.joa.covid.model.covid19.Index;
import se.lnu.joa.covid.model.covid19.util.Covid19AdapterFactory;


public class UsingEmfModel {
    public static void main(String[] args) {
    	final ResourceSet resourceSet = new ResourceSetImpl();
    	final Covid19AdapterFactory aFactory;
    	
		try {
			EcorePackage.eINSTANCE.eClass();    // Makes sure EMF is up and running
			Covid19Package.eINSTANCE.eClass(); 
			aFactory = new Covid19AdapterFactory();
			
	        // Retrieve the default factory singleton
	        Covid19Factory factory = Covid19Factory.eINSTANCE;
	        
	        // Create an instance of DataPool
	        DataPool pool = factory.createDataPool();
			
	        Path indexPath = FileSystems.getDefault().getPath("index.csv");
	        Path epidemiologyPath = FileSystems.getDefault().getPath("epidemiology.csv");
	        Path healthPath = FileSystems.getDefault().getPath("health.csv");
			
	        // Index
	        Reader in = new FileReader(indexPath.toString());
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
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
		        id.setAggregation_level(record.get(13));
		        
		        // Add record to Index data
		        pool.getIndexData().add(id);
			}
	        			
			int i = 0;
			for(Index item : pool.getIndexData()) {
				if (i > 0) {
					System.out.print("Key: ");
					System.out.println(item.getKey());
					System.out.print("Wikidata: ");
					System.out.println(item.getWikidata());
					System.out.print("Datacommons: ");
					System.out.println(item.getDatacommons());
					System.out.print("Country Code: ");
					System.out.println(item.getCountry_code());
					System.out.print("Country Name: ");
					System.out.println(item.getCountry_name());
					System.out.print("Subregion 1 code: ");
					System.out.println(item.getSubregion1_code());
					System.out.print("Subregion 1 name: ");
					System.out.println(item.getSubregion1_name());
					System.out.print("Subregion 2 code: ");
					System.out.println(item.getSubregion2_code());
					System.out.print("Subregion 2 name: ");
					System.out.println(item.getSubregion2_name());
					System.out.print("Locality code: ");
					System.out.println(item.getLocality_code());
					System.out.print("Locality name: ");
					System.out.println(item.getLocality_name());
					System.out.print("3166-1-alpha-2: ");
					System.out.println(item.getAlpha_2());
					System.out.print("3166-1-alpha-3: ");
					System.out.println(item.getAlpha_3());
					System.out.print("Aggregation Level: ");
					System.out.println(item.getAggregation_level());
					System.out.println("\n");
				}
				i = i + 1;
			}
			
			// Epidemiology
			in = new FileReader(epidemiologyPath.toString());
			records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
			    // Create a record
			    Epidemiology ed = factory.createEpidemiology();
			    
			    // Fill record with data
			    ed.setDate(record.get(0));
		        ed.setKey(record.get(1));
		        ed.setNew_confirmed(record.get(2));
		        ed.setNew_deceased(record.get(3));
		        ed.setNew_recovered(record.get(4));
		        ed.setNew_tested(record.get(5));
		        ed.setTotal_confirmed(record.get(5));
		        ed.setTotal_deceased(record.get(6));
		        ed.setTotal_recovered(record.get(7));
		        ed.setTotal_tested(record.get(8));
		        
		        // Add record to Epidemiology data
		        pool.getEpidemiologyData().add(ed);
			}
	        			
			i = 0;
			for(Epidemiology item : pool.getEpidemiologyData()) {
				if (i > 0) {
					System.out.print("Key: ");
					System.out.println(item.getKey());
					System.out.print("Date: ");
					System.out.println(item.getDate());
					System.out.print("New Confirmed cases: ");
					System.out.println(item.getNew_confirmed());
					System.out.print("New Deceased cases: ");
					System.out.println(item.getNew_deceased());
					System.out.print("New Recovered cases: ");
					System.out.println(item.getNew_recovered());
					System.out.print("New Tested cases: ");
					System.out.println(item.getNew_tested());
					System.out.print("Total Confirmed cases: ");
					System.out.println(item.getTotal_confirmed());
					System.out.print("Total Deceased cases: ");
					System.out.println(item.getTotal_deceased());
					System.out.print("Total Recovered cases: ");
					System.out.println(item.getTotal_recovered());
					System.out.print("Total Tested cases: ");
					System.out.println(item.getTotal_tested());
					System.out.println("\n");
				}
				i = i + 1;
			}
			
			// Health
			in = new FileReader(healthPath.toString());
			records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
			    // Create a record
			    Health hd = factory.createHealth();
			    
			    // Fill record with data
		        hd.setKey(record.get(0));
		        hd.setLife_expectancy(record.get(1));
		        hd.setSmoking_prevalence(record.get(2));
		        hd.setDiabetes_prevalence(record.get(3));
		        hd.setInfant_mortality_rate(record.get(4));
		        hd.setAdult_male_mortality_rate(record.get(5));
		        hd.setAdult_female_mortality_rate(record.get(6));
		        hd.setPollution_mortality_rate(record.get(7));
		        hd.setComorbidity_mortality_rate(record.get(8));
		        hd.setHospital_beds(record.get(9));
		        hd.setNurses(record.get(10));
		        hd.setPhysicians(record.get(11));
		        hd.setHealth_expenditure(record.get(12));
		        hd.setOut_of_pocket_health_expenditure(record.get(13));
		        
		        // Add record to Health data
		        pool.getHealthData().add(hd);
			}
	        			
			i = 0;
			for(Health item : pool.getHealthData()) {
				if (i > 0) {
					System.out.print("Key: ");
					System.out.println(item.getKey());
					System.out.print("Life Expectancy: ");
					System.out.println(item.getLife_expectancy());
					System.out.print("Smoking Prevalence: ");
					System.out.println(item.getSmoking_prevalence());
					System.out.print("Diabetes Prevalence: ");
					System.out.println(item.getDiabetes_prevalence());
					System.out.print("Infant Morality Rate: ");
					System.out.println(item.getInfant_mortality_rate());
					System.out.print("Adult Male Morality Rate: ");
					System.out.println(item.getAdult_male_mortality_rate());
					System.out.print("Adult Female Morality Rate: ");
					System.out.println(item.getAdult_female_mortality_rate());
					System.out.print("Pollution Morality Rate: ");
					System.out.println(item.getPollution_mortality_rate());
					System.out.print("Cormobidity Morality Rate: ");
					System.out.println(item.getComorbidity_mortality_rate());
					System.out.print("Hospital Beds: ");
					System.out.println(item.getHospital_beds());
					System.out.print("Nurses: ");
					System.out.println(item.getNurses());
					System.out.print("Physicians: ");
					System.out.println(item.getPhysicians());
					System.out.print("Health Expenditure: ");
					System.out.println(item.getHealth_expenditure());
					System.out.print("Out of Pocket Health Expenditure: ");
					System.out.println(item.getOut_of_pocket_health_expenditure());
					System.out.println("\n");
				}
				i = i + 1;
			}
			
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("Covid19", new XMIResourceFactoryImpl());
	        			
			resourceSet.createResource(URI.createURI("HealthData.Covid19")).getContents().add(pool);
			
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
        
    }
    
}
