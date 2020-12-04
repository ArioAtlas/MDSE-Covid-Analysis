/**
 */
package se.lnu.joa.covid.model.covid19.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.lnu.joa.covid.model.covid19.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.covid19.Covid19Package
 * @generated
 */
public class Covid19AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Covid19Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Covid19AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Covid19Package.eINSTANCE;
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
	protected Covid19Switch<Adapter> modelSwitch = new Covid19Switch<Adapter>() {
		@Override
		public Adapter caseHealth(Health object) {
			return createHealthAdapter();
		}

		@Override
		public Adapter caseEpidemiology(Epidemiology object) {
			return createEpidemiologyAdapter();
		}

		@Override
		public Adapter caseDataPool(DataPool object) {
			return createDataPoolAdapter();
		}

		@Override
		public Adapter caseDataRecord(DataRecord object) {
			return createDataRecordAdapter();
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
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.covid19.Health <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.covid19.Health
	 * @generated
	 */
	public Adapter createHealthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.covid19.Epidemiology <em>Epidemiology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology
	 * @generated
	 */
	public Adapter createEpidemiologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.covid19.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.covid19.DataPool
	 * @generated
	 */
	public Adapter createDataPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.covid19.DataRecord <em>Data Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.covid19.DataRecord
	 * @generated
	 */
	public Adapter createDataRecordAdapter() {
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

} //Covid19AdapterFactory
