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
import se.lnu.joa.covid.model.data.Epidemiology;

/**
 * This is the item provider adapter for a {@link se.lnu.joa.covid.model.data.Epidemiology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EpidemiologyItemProvider extends DataRecordItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpidemiologyItemProvider(AdapterFactory adapterFactory) {
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

			addDatePropertyDescriptor(object);
			addNew_confirmedPropertyDescriptor(object);
			addNew_deceasedPropertyDescriptor(object);
			addNew_recoveredPropertyDescriptor(object);
			addNew_testedPropertyDescriptor(object);
			addTotal_confirmedPropertyDescriptor(object);
			addTotal_deceasedPropertyDescriptor(object);
			addTotal_recoveredPropertyDescriptor(object);
			addTotal_testedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_date_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New confirmed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_confirmedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_new_confirmed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_new_confirmed_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__NEW_CONFIRMED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New deceased feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_deceasedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_new_deceased_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_new_deceased_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__NEW_DECEASED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New recovered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_recoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_new_recovered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_new_recovered_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__NEW_RECOVERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New tested feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNew_testedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_new_tested_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_new_tested_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__NEW_TESTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total confirmed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_confirmedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_total_confirmed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_total_confirmed_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__TOTAL_CONFIRMED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total deceased feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_deceasedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_total_deceased_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_total_deceased_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__TOTAL_DECEASED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total recovered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_recoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_total_recovered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_total_recovered_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__TOTAL_RECOVERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total tested feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_testedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Epidemiology_total_tested_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Epidemiology_total_tested_feature", "_UI_Epidemiology_type"),
				 DataPackage.Literals.EPIDEMIOLOGY__TOTAL_TESTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Epidemiology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Epidemiology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Epidemiology)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_Epidemiology_type") :
			getString("_UI_Epidemiology_type") + " " + label;
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

		switch (notification.getFeatureID(Epidemiology.class)) {
			case DataPackage.EPIDEMIOLOGY__DATE:
			case DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED:
			case DataPackage.EPIDEMIOLOGY__NEW_DECEASED:
			case DataPackage.EPIDEMIOLOGY__NEW_RECOVERED:
			case DataPackage.EPIDEMIOLOGY__NEW_TESTED:
			case DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED:
			case DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED:
			case DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED:
			case DataPackage.EPIDEMIOLOGY__TOTAL_TESTED:
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
