/**
 */
package se.lnu.joa.covid.model.analysis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.Visualization;

/**
 * This is the item provider adapter for a {@link se.lnu.joa.covid.model.analysis.Visualization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationItemProvider(AdapterFactory adapterFactory) {
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

			addXAxisPropertyDescriptor(object);
			addYAxisPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addSubTitlePropertyDescriptor(object);
			addXAxisLabelPropertyDescriptor(object);
			addYAxisLabelPropertyDescriptor(object);
			addColorLabelPropertyDescriptor(object);
			addCaptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XAxis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_xAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_xAxis_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__XAXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YAxis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_yAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_yAxis_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__YAXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_color_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_title_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_subTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_subTitle_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__SUB_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XAxis Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAxisLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_xAxisLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_xAxisLabel_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__XAXIS_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YAxis Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAxisLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_yAxisLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_yAxisLabel_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__YAXIS_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_colorLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_colorLabel_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__COLOR_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Visualization_caption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Visualization_caption_feature", "_UI_Visualization_type"),
				 AnalysisPackage.Literals.VISUALIZATION__CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AnalysisPackage.Literals.VISUALIZATION__SCALE_X);
			childrenFeatures.add(AnalysisPackage.Literals.VISUALIZATION__SCALE_Y);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Visualization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Visualization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Visualization)object).getXAxis();
		return label == null || label.length() == 0 ?
			getString("_UI_Visualization_type") :
			getString("_UI_Visualization_type") + " " + label;
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

		switch (notification.getFeatureID(Visualization.class)) {
			case AnalysisPackage.VISUALIZATION__XAXIS:
			case AnalysisPackage.VISUALIZATION__YAXIS:
			case AnalysisPackage.VISUALIZATION__COLOR:
			case AnalysisPackage.VISUALIZATION__TITLE:
			case AnalysisPackage.VISUALIZATION__SUB_TITLE:
			case AnalysisPackage.VISUALIZATION__XAXIS_LABEL:
			case AnalysisPackage.VISUALIZATION__YAXIS_LABEL:
			case AnalysisPackage.VISUALIZATION__COLOR_LABEL:
			case AnalysisPackage.VISUALIZATION__CAPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AnalysisPackage.VISUALIZATION__SCALE_X:
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_X,
				 AnalysisFactory.eINSTANCE.createScale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_X,
				 AnalysisFactory.eINSTANCE.createLog10Scale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_X,
				 AnalysisFactory.eINSTANCE.createSqrtScale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_X,
				 AnalysisFactory.eINSTANCE.createDateScale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_Y,
				 AnalysisFactory.eINSTANCE.createScale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_Y,
				 AnalysisFactory.eINSTANCE.createLog10Scale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_Y,
				 AnalysisFactory.eINSTANCE.createSqrtScale()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.VISUALIZATION__SCALE_Y,
				 AnalysisFactory.eINSTANCE.createDateScale()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AnalysisPackage.Literals.VISUALIZATION__SCALE_X ||
			childFeature == AnalysisPackage.Literals.VISUALIZATION__SCALE_Y;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Covid19AnalysisEditPlugin.INSTANCE;
	}

}
