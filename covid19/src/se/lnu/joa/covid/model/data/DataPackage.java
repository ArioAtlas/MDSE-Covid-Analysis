/**
 */
package se.lnu.joa.covid.model.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lnu.se/dv651/covid19/csv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "covid19";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = se.lnu.joa.covid.model.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.DataPoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.DataPoolImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataPool()
	 * @generated
	 */
	int DATA_POOL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__SOURCES = 1;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.DataSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.DataSourceImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA = 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.DataSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.DataSetImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.IntSetImpl <em>Int Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.IntSetImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getIntSet()
	 * @generated
	 */
	int INT_SET = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SET__TITLE = DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SET__VALUES = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SET_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.DoubleSetImpl <em>Double Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.DoubleSetImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDoubleSet()
	 * @generated
	 */
	int DOUBLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_SET__TITLE = DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_SET__VALUES = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_SET_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.StringSetImpl <em>String Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.StringSetImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getStringSet()
	 * @generated
	 */
	int STRING_SET = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__TITLE = DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__VALUES = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.data.impl.DateSetImpl <em>Date Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.data.impl.DateSetImpl
	 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDateSet()
	 * @generated
	 */
	int DATE_SET = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SET__TITLE = DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SET__VALUES = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SET_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.DataPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see se.lnu.joa.covid.model.data.DataPool
	 * @generated
	 */
	EClass getDataPool();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.data.DataPool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.lnu.joa.covid.model.data.DataPool#getName()
	 * @see #getDataPool()
	 * @generated
	 */
	EAttribute getDataPool_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.data.DataPool#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see se.lnu.joa.covid.model.data.DataPool#getSources()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_Sources();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.DataSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.data.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.data.DataSource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSource#getPath()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.data.DataSource#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSource#getData()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Data();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.DataSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.data.DataSet#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see se.lnu.joa.covid.model.data.DataSet#getTitle()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_Title();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.IntSet <em>Int Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Set</em>'.
	 * @see se.lnu.joa.covid.model.data.IntSet
	 * @generated
	 */
	EClass getIntSet();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.data.IntSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see se.lnu.joa.covid.model.data.IntSet#getValues()
	 * @see #getIntSet()
	 * @generated
	 */
	EAttribute getIntSet_Values();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.DoubleSet <em>Double Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Set</em>'.
	 * @see se.lnu.joa.covid.model.data.DoubleSet
	 * @generated
	 */
	EClass getDoubleSet();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.data.DoubleSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see se.lnu.joa.covid.model.data.DoubleSet#getValues()
	 * @see #getDoubleSet()
	 * @generated
	 */
	EAttribute getDoubleSet_Values();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.StringSet <em>String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Set</em>'.
	 * @see se.lnu.joa.covid.model.data.StringSet
	 * @generated
	 */
	EClass getStringSet();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.data.StringSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see se.lnu.joa.covid.model.data.StringSet#getValues()
	 * @see #getStringSet()
	 * @generated
	 */
	EAttribute getStringSet_Values();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.data.DateSet <em>Date Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Set</em>'.
	 * @see se.lnu.joa.covid.model.data.DateSet
	 * @generated
	 */
	EClass getDateSet();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.data.DateSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see se.lnu.joa.covid.model.data.DateSet#getValues()
	 * @see #getDateSet()
	 * @generated
	 */
	EAttribute getDateSet_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.DataPoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.DataPoolImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataPool()
		 * @generated
		 */
		EClass DATA_POOL = eINSTANCE.getDataPool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_POOL__NAME = eINSTANCE.getDataPool_Name();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__SOURCES = eINSTANCE.getDataPool_Sources();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.DataSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.DataSourceImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__PATH = eINSTANCE.getDataSource_Path();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DATA = eINSTANCE.getDataSource_Data();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.DataSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.DataSetImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__TITLE = eINSTANCE.getDataSet_Title();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.IntSetImpl <em>Int Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.IntSetImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getIntSet()
		 * @generated
		 */
		EClass INT_SET = eINSTANCE.getIntSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_SET__VALUES = eINSTANCE.getIntSet_Values();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.DoubleSetImpl <em>Double Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.DoubleSetImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDoubleSet()
		 * @generated
		 */
		EClass DOUBLE_SET = eINSTANCE.getDoubleSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_SET__VALUES = eINSTANCE.getDoubleSet_Values();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.StringSetImpl <em>String Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.StringSetImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getStringSet()
		 * @generated
		 */
		EClass STRING_SET = eINSTANCE.getStringSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_SET__VALUES = eINSTANCE.getStringSet_Values();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.data.impl.DateSetImpl <em>Date Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.data.impl.DateSetImpl
		 * @see se.lnu.joa.covid.model.data.impl.DataPackageImpl#getDateSet()
		 * @generated
		 */
		EClass DATE_SET = eINSTANCE.getDateSet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_SET__VALUES = eINSTANCE.getDateSet_Values();

	}

} //DataPackage
