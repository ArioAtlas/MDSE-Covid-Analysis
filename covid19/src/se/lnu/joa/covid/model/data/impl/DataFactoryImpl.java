/**
 */
package se.lnu.joa.covid.model.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.lnu.joa.covid.model.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataPackage.DATA_POOL: return createDataPool();
			case DataPackage.DATA_SOURCE: return createDataSource();
			case DataPackage.DATA_SET: return createDataSet();
			case DataPackage.INT_SET: return createIntSet();
			case DataPackage.DOUBLE_SET: return createDoubleSet();
			case DataPackage.STRING_SET: return createStringSet();
			case DataPackage.DATE_SET: return createDateSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPool createDataPool() {
		DataPoolImpl dataPool = new DataPoolImpl();
		return dataPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet createDataSet() {
		DataSetImpl dataSet = new DataSetImpl();
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntSet createIntSet() {
		IntSetImpl intSet = new IntSetImpl();
		return intSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleSet createDoubleSet() {
		DoubleSetImpl doubleSet = new DoubleSetImpl();
		return doubleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSet createStringSet() {
		StringSetImpl stringSet = new StringSetImpl();
		return stringSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateSet createDateSet() {
		DateSetImpl dateSet = new DateSetImpl();
		return dateSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
