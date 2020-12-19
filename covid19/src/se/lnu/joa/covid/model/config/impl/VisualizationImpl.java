/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.Visualization;
import se.lnu.joa.covid.model.config.VisualizationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getColorLabel <em>Color Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VisualizationType TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VisualizationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected String xAxis = XAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected String yAxis = YAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubTitle() <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubTitle() <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTitle()
	 * @generated
	 * @ordered
	 */
	protected String subTitle = SUB_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String xAxisLabel = XAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String yAxisLabel = YAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorLabel() <em>Color Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorLabel() <em>Color Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLabel()
	 * @generated
	 * @ordered
	 */
	protected String colorLabel = COLOR_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.VISUALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VisualizationType newType) {
		VisualizationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(String newXAxis) {
		String oldXAxis = xAxis;
		xAxis = newXAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__XAXIS, oldXAxis, xAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxis() {
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxis(String newYAxis) {
		String oldYAxis = yAxis;
		yAxis = newYAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__YAXIS, oldYAxis, yAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTitle(String newSubTitle) {
		String oldSubTitle = subTitle;
		subTitle = newSubTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__SUB_TITLE, oldSubTitle, subTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxisLabel() {
		return xAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisLabel(String newXAxisLabel) {
		String oldXAxisLabel = xAxisLabel;
		xAxisLabel = newXAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__XAXIS_LABEL, oldXAxisLabel, xAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxisLabel() {
		return yAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxisLabel(String newYAxisLabel) {
		String oldYAxisLabel = yAxisLabel;
		yAxisLabel = newYAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__YAXIS_LABEL, oldYAxisLabel, yAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorLabel() {
		return colorLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorLabel(String newColorLabel) {
		String oldColorLabel = colorLabel;
		colorLabel = newColorLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__COLOR_LABEL, oldColorLabel, colorLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.VISUALIZATION__TYPE:
				return getType();
			case ConfigPackage.VISUALIZATION__XAXIS:
				return getXAxis();
			case ConfigPackage.VISUALIZATION__YAXIS:
				return getYAxis();
			case ConfigPackage.VISUALIZATION__COLOR:
				return getColor();
			case ConfigPackage.VISUALIZATION__TITLE:
				return getTitle();
			case ConfigPackage.VISUALIZATION__SUB_TITLE:
				return getSubTitle();
			case ConfigPackage.VISUALIZATION__XAXIS_LABEL:
				return getXAxisLabel();
			case ConfigPackage.VISUALIZATION__YAXIS_LABEL:
				return getYAxisLabel();
			case ConfigPackage.VISUALIZATION__COLOR_LABEL:
				return getColorLabel();
			case ConfigPackage.VISUALIZATION__CAPTION:
				return getCaption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.VISUALIZATION__TYPE:
				setType((VisualizationType)newValue);
				return;
			case ConfigPackage.VISUALIZATION__XAXIS:
				setXAxis((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__YAXIS:
				setYAxis((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__COLOR:
				setColor((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__TITLE:
				setTitle((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__SUB_TITLE:
				setSubTitle((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__XAXIS_LABEL:
				setXAxisLabel((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__YAXIS_LABEL:
				setYAxisLabel((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__COLOR_LABEL:
				setColorLabel((String)newValue);
				return;
			case ConfigPackage.VISUALIZATION__CAPTION:
				setCaption((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.VISUALIZATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__XAXIS:
				setXAxis(XAXIS_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__YAXIS:
				setYAxis(YAXIS_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__SUB_TITLE:
				setSubTitle(SUB_TITLE_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__XAXIS_LABEL:
				setXAxisLabel(XAXIS_LABEL_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__YAXIS_LABEL:
				setYAxisLabel(YAXIS_LABEL_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__COLOR_LABEL:
				setColorLabel(COLOR_LABEL_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.VISUALIZATION__TYPE:
				return type != TYPE_EDEFAULT;
			case ConfigPackage.VISUALIZATION__XAXIS:
				return XAXIS_EDEFAULT == null ? xAxis != null : !XAXIS_EDEFAULT.equals(xAxis);
			case ConfigPackage.VISUALIZATION__YAXIS:
				return YAXIS_EDEFAULT == null ? yAxis != null : !YAXIS_EDEFAULT.equals(yAxis);
			case ConfigPackage.VISUALIZATION__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case ConfigPackage.VISUALIZATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ConfigPackage.VISUALIZATION__SUB_TITLE:
				return SUB_TITLE_EDEFAULT == null ? subTitle != null : !SUB_TITLE_EDEFAULT.equals(subTitle);
			case ConfigPackage.VISUALIZATION__XAXIS_LABEL:
				return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
			case ConfigPackage.VISUALIZATION__YAXIS_LABEL:
				return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
			case ConfigPackage.VISUALIZATION__COLOR_LABEL:
				return COLOR_LABEL_EDEFAULT == null ? colorLabel != null : !COLOR_LABEL_EDEFAULT.equals(colorLabel);
			case ConfigPackage.VISUALIZATION__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", xAxis: ");
		result.append(xAxis);
		result.append(", yAxis: ");
		result.append(yAxis);
		result.append(", color: ");
		result.append(color);
		result.append(", title: ");
		result.append(title);
		result.append(", subTitle: ");
		result.append(subTitle);
		result.append(", xAxisLabel: ");
		result.append(xAxisLabel);
		result.append(", yAxisLabel: ");
		result.append(yAxisLabel);
		result.append(", colorLabel: ");
		result.append(colorLabel);
		result.append(", caption: ");
		result.append(caption);
		result.append(')');
		return result.toString();
	}

} //VisualizationImpl
