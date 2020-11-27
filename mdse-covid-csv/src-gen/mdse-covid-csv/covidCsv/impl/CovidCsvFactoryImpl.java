/**
 */
package mdse-covid-csv.covidCsv.impl;

import mdse-covid-csv.covidCsv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CovidCsvFactoryImpl extends EFactoryImpl implements CovidCsvFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CovidCsvFactory init()
	{
		try
		{
			CovidCsvFactory theCovidCsvFactory = (CovidCsvFactory)EPackage.Registry.INSTANCE.getEFactory(CovidCsvPackage.eNS_URI);
			if (theCovidCsvFactory != null)
			{
				return theCovidCsvFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CovidCsvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CovidCsvFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case CovidCsvPackage.HEALTH_DATA: return (EObject)createHealthData();
			case CovidCsvPackage.INDEX_DATA: return (EObject)createIndexData();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA: return (EObject)createEpidemiologyData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV createHealthData()
	{
		HealthDataImpl healthData = new HealthDataImpl();
		return healthData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV createIndexData()
	{
		IndexDataImpl indexData = new IndexDataImpl();
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV createEpidemiologyData()
	{
		EpidemiologyDataImpl epidemiologyData = new EpidemiologyDataImpl();
		return epidemiologyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CovidCsvPackage getCovidCsvPackage()
	{
		return (CovidCsvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CovidCsvPackage getPackage()
	{
		return CovidCsvPackage.eINSTANCE;
	}

} //CovidCsvFactoryImpl
