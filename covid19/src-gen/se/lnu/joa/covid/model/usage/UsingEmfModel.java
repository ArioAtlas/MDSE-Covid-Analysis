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
import se.lnu.joa.covid.model.covid19.Health;
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
			
	        Path healthPath = FileSystems.getDefault().getPath("health.csv");
	        Path epidemiologyPath = FileSystems.getDefault().getPath("epidemiology.csv");
	        Path indexPath = FileSystems.getDefault().getPath("index.csv");
			
	        Reader in = new FileReader(healthPath.toString());
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
			    // create a record
			    Health hd = factory.createHealth();
			    // fills records data
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
		        // add record to Health data
		        pool.getHealthData().add(hd);
			}
	        			
		
			for(Health item : pool.getHealthData()) {
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
			
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	        
	        System.out.println(resourceSet.createResource(URI.createURI("HealthData")));
			
			//resourceSet.createResource(URI.createURI("HealthData")).getContents().add(pool);
			
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
        
    }
    
}
