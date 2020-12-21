/**
 */
package se.lnu.joa.covid.model.data.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.lnu.joa.covid.model.data.DataPackage;
import se.lnu.joa.covid.model.data.Health;

/**
 * This is the item provider adapter for a {@link se.lnu.joa.covid.model.data.Health} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthItemProvider extends DataRecordItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLife_expectancyPropertyDescriptor(object);
			addSmoking_prevalencePropertyDescriptor(object);
			addDiabetes_prevalencePropertyDescriptor(object);
			addInfant_mortality_ratePropertyDescriptor(object);
			addAdult_male_mortality_ratePropertyDescriptor(object);
			addAdult_female_mortality_ratePropertyDescriptor(object);
			addPollution_mortality_ratePropertyDescriptor(object);
			addComorbidity_mortality_ratePropertyDescriptor(object);
			addHospital_bedsPropertyDescriptor(object);
			addNursesPropertyDescriptor(object);
			addPhysiciansPropertyDescriptor(object);
			addHealth_expenditurePropertyDescriptor(object);
			addOut_of_pocket_health_expenditurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Life expectancy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLife_expectancyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_life_expectancy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_life_expectancy_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__LIFE_EXPECTANCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smoking prevalence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmoking_prevalencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_smoking_prevalence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_smoking_prevalence_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__SMOKING_PREVALENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diabetes prevalence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiabetes_prevalencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_diabetes_prevalence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_diabetes_prevalence_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__DIABETES_PREVALENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Infant mortality rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfant_mortality_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_infant_mortality_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_infant_mortality_rate_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__INFANT_MORTALITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adult male mortality rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdult_male_mortality_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_adult_male_mortality_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_adult_male_mortality_rate_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__ADULT_MALE_MORTALITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adult female mortality rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdult_female_mortality_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_adult_female_mortality_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_adult_female_mortality_rate_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__ADULT_FEMALE_MORTALITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pollution mortality rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPollution_mortality_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_pollution_mortality_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_pollution_mortality_rate_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__POLLUTION_MORTALITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comorbidity mortality rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComorbidity_mortality_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_comorbidity_mortality_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_comorbidity_mortality_rate_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__COMORBIDITY_MORTALITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hospital beds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHospital_bedsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_hospital_beds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_hospital_beds_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__HOSPITAL_BEDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nurses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNursesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_nurses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_nurses_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__NURSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physicians feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysiciansPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_physicians_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_physicians_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__PHYSICIANS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Health expenditure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHealth_expenditurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_health_expenditure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_health_expenditure_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__HEALTH_EXPENDITURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Out of pocket health expenditure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOut_of_pocket_health_expenditurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Health_out_of_pocket_health_expenditure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Health_out_of_pocket_health_expenditure_feature", "_UI_Health_type"),
				 DataPackage.Literals.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Health.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Health"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Health)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_Health_type") :
			getString("_UI_Health_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Health.class)) {
			case DataPackage.HEALTH__LIFE_EXPECTANCY:
			case DataPackage.HEALTH__SMOKING_PREVALENCE:
			case DataPackage.HEALTH__DIABETES_PREVALENCE:
			case DataPackage.HEALTH__INFANT_MORTALITY_RATE:
			case DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE:
			case DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
			case DataPackage.HEALTH__POLLUTION_MORTALITY_RATE:
			case DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE:
			case DataPackage.HEALTH__HOSPITAL_BEDS:
			case DataPackage.HEALTH__NURSES:
			case DataPackage.HEALTH__PHYSICIANS:
			case DataPackage.HEALTH__HEALTH_EXPENDITURE:
			case DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
