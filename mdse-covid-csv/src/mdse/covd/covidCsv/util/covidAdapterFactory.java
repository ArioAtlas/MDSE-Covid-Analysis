/**
 */
package mdse.covd.covidCsv.util;

import mdse.covd.covidCsv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdse.covd.covidCsv.covidPackage
 * @generated
 */
public class covidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static covidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public covidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = covidPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected covidSwitch<Adapter> modelSwitch = new covidSwitch<Adapter>() {
		@Override
		public Adapter caseHealthRecord(HealthRecord object) {
			return createHealthRecordAdapter();
		}

		@Override
		public Adapter caseIndexData(IndexData object) {
			return createIndexDataAdapter();
		}

		@Override
		public Adapter caseEpidemiologyRecord(EpidemiologyRecord object) {
			return createEpidemiologyRecordAdapter();
		}

		@Override
		public Adapter caseDataPool(DataPool object) {
			return createDataPoolAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdse.covd.covidCsv.HealthRecord <em>Health Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdse.covd.covidCsv.HealthRecord
	 * @generated
	 */
	public Adapter createHealthRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdse.covd.covidCsv.IndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdse.covd.covidCsv.IndexData
	 * @generated
	 */
	public Adapter createIndexDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdse.covd.covidCsv.EpidemiologyRecord <em>Epidemiology Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord
	 * @generated
	 */
	public Adapter createEpidemiologyRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdse.covd.covidCsv.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdse.covd.covidCsv.DataPool
	 * @generated
	 */
	public Adapter createDataPoolAdapter() {
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

} //covidAdapterFactory
