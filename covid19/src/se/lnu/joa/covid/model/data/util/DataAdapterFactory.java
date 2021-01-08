/**
 */
package se.lnu.joa.covid.model.data.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.lnu.joa.covid.model.data.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
			@Override
			public Adapter caseDataPool(DataPool object) {
				return createDataPoolAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSet(DataSet object) {
				return createDataSetAdapter();
			}
			@Override
			public Adapter caseIntSet(IntSet object) {
				return createIntSetAdapter();
			}
			@Override
			public Adapter caseDoubleSet(DoubleSet object) {
				return createDoubleSetAdapter();
			}
			@Override
			public Adapter caseStringSet(StringSet object) {
				return createStringSetAdapter();
			}
			@Override
			public Adapter caseDateSet(DateSet object) {
				return createDateSetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.DataPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.DataPool
	 * @generated
	 */
	public Adapter createDataPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.DataSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.DataSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.DataSet
	 * @generated
	 */
	public Adapter createDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.IntSet <em>Int Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.IntSet
	 * @generated
	 */
	public Adapter createIntSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.DoubleSet <em>Double Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.DoubleSet
	 * @generated
	 */
	public Adapter createDoubleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.StringSet <em>String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.StringSet
	 * @generated
	 */
	public Adapter createStringSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.data.DateSet <em>Date Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.data.DateSet
	 * @generated
	 */
	public Adapter createDateSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataAdapterFactory
