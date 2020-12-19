/**
 */
package se.lnu.joa.covid.model.covid19.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.Index;

/**
 * This is the item provider adapter for a {@link se.lnu.joa.covid.model.covid19.Index} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexItemProvider extends DataRecordItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexItemProvider(AdapterFactory adapterFactory) {
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

			addWikidataPropertyDescriptor(object);
			addDatacommonsPropertyDescriptor(object);
			addCountry_codePropertyDescriptor(object);
			addCountry_namePropertyDescriptor(object);
			addSubregion1_codePropertyDescriptor(object);
			addSubregion1_namePropertyDescriptor(object);
			addSubregion2_codePropertyDescriptor(object);
			addSubregion2_namePropertyDescriptor(object);
			addLocality_codePropertyDescriptor(object);
			addLocality_namePropertyDescriptor(object);
			addAlpha_2PropertyDescriptor(object);
			addAlpha_3PropertyDescriptor(object);
			addAggregation_levelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Wikidata feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWikidataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_wikidata_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_wikidata_feature", "_UI_Index_type"),
						Covid19Package.Literals.INDEX__WIKIDATA, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Datacommons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacommonsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_datacommons_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_datacommons_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__DATACOMMONS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Country code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountry_codePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_country_code_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_country_code_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__COUNTRY_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Country name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountry_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_country_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_country_name_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__COUNTRY_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subregion1 code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubregion1_codePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_subregion1_code_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_subregion1_code_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__SUBREGION1_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subregion1 name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubregion1_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_subregion1_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_subregion1_name_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__SUBREGION1_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subregion2 code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubregion2_codePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_subregion2_code_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_subregion2_code_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__SUBREGION2_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subregion2 name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubregion2_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_subregion2_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_subregion2_name_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__SUBREGION2_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Locality code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocality_codePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_locality_code_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_locality_code_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__LOCALITY_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Locality name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocality_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_locality_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_locality_name_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__LOCALITY_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alpha 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlpha_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_alpha_2_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_alpha_2_feature", "_UI_Index_type"),
						Covid19Package.Literals.INDEX__ALPHA_2, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alpha 3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlpha_3PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_alpha_3_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_alpha_3_feature", "_UI_Index_type"),
						Covid19Package.Literals.INDEX__ALPHA_3, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Aggregation level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregation_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Index_aggregation_level_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Index_aggregation_level_feature",
								"_UI_Index_type"),
						Covid19Package.Literals.INDEX__AGGREGATION_LEVEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Index.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Index"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Index) object).getCountry_name();
		return label == null || label.length() == 0 ? getString("_UI_Index_type")
				: getString("_UI_Index_type") + " " + label;
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

		switch (notification.getFeatureID(Index.class)) {
		case Covid19Package.INDEX__WIKIDATA:
		case Covid19Package.INDEX__DATACOMMONS:
		case Covid19Package.INDEX__COUNTRY_CODE:
		case Covid19Package.INDEX__COUNTRY_NAME:
		case Covid19Package.INDEX__SUBREGION1_CODE:
		case Covid19Package.INDEX__SUBREGION1_NAME:
		case Covid19Package.INDEX__SUBREGION2_CODE:
		case Covid19Package.INDEX__SUBREGION2_NAME:
		case Covid19Package.INDEX__LOCALITY_CODE:
		case Covid19Package.INDEX__LOCALITY_NAME:
		case Covid19Package.INDEX__ALPHA_2:
		case Covid19Package.INDEX__ALPHA_3:
		case Covid19Package.INDEX__AGGREGATION_LEVEL:
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
