package se.lnu.joa.covid.model.usage;

import se.lnu.joa.covid.model.covid19.DataPool;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import se.lnu.joa.covid.model.covid19.Covid19Factory;
import se.lnu.joa.covid.model.covid19.Covid19Package;

import se.lnu.joa.covid.model.covid19.DataRecord;
import se.lnu.joa.covid.model.covid19.Epidemiology;
import se.lnu.joa.covid.model.covid19.Health;
import se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl;
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
	        // create an instance of DataPool
	        DataPool pool = factory.createDataPool();
			
	        
			Reader in = new FileReader("c:/Book1.csv");
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
			    System.out.println(record.get(0));
			    // create a record
			    Health hd = factory.createHealth();
			    // fills records data
		        hd.setKey(record.get(0));
		        hd.setLife_expectancy(record.get(1));
		        hd.setSmoking_prevalence(record.get(2));
		        // add record to Health data
		        pool.getHealthData().add(hd);
			}
	        			
		
			for(Health item : pool.getHealthData()) {
				System.out.print("Key:");
				System.out.println(item.getKey());
				System.out.print("Life Expectancy:");
				System.out.println(item.getLife_expectancy());
				System.out.print("Smoking Prevalence:");
				System.out.println(item.getSmoking_prevalence());
			}
	        
	        
			resourceSet.createResource(URI.createURI("HealthData")).getContents().add(pool);
			
			
			
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
        
    }
    
}
