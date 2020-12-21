/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.Scale;
import se.lnu.joa.covid.model.analysis.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getColorLabel <em>Color Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getScale_x <em>Scale x</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getScale_y <em>Scale y</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization {
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
	 * The cached value of the '{@link #getScale_x() <em>Scale x</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_x()
	 * @generated
	 * @ordered
	 */
	protected Scale scale_x;

	/**
	 * The cached value of the '{@link #getScale_y() <em>Scale y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale_y()
	 * @generated
	 * @ordered
	 */
	protected Scale scale_y;

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
		return AnalysisPackage.Literals.VISUALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__XAXIS, oldXAxis, xAxis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__YAXIS, oldYAxis, yAxis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__SUB_TITLE, oldSubTitle, subTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__XAXIS_LABEL, oldXAxisLabel, xAxisLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__YAXIS_LABEL, oldYAxisLabel, yAxisLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__COLOR_LABEL, oldColorLabel, colorLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scale getScale_x() {
		return scale_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale_x(Scale newScale_x, NotificationChain msgs) {
		Scale oldScale_x = scale_x;
		scale_x = newScale_x;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__SCALE_X, oldScale_x, newScale_x);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale_x(Scale newScale_x) {
		if (newScale_x != scale_x) {
			NotificationChain msgs = null;
			if (scale_x != null)
				msgs = ((InternalEObject)scale_x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.VISUALIZATION__SCALE_X, null, msgs);
			if (newScale_x != null)
				msgs = ((InternalEObject)newScale_x).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.VISUALIZATION__SCALE_X, null, msgs);
			msgs = basicSetScale_x(newScale_x, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__SCALE_X, newScale_x, newScale_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scale getScale_y() {
		return scale_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale_y(Scale newScale_y, NotificationChain msgs) {
		Scale oldScale_y = scale_y;
		scale_y = newScale_y;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__SCALE_Y, oldScale_y, newScale_y);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale_y(Scale newScale_y) {
		if (newScale_y != scale_y) {
			NotificationChain msgs = null;
			if (scale_y != null)
				msgs = ((InternalEObject)scale_y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.VISUALIZATION__SCALE_Y, null, msgs);
			if (newScale_y != null)
				msgs = ((InternalEObject)newScale_y).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.VISUALIZATION__SCALE_Y, null, msgs);
			msgs = basicSetScale_y(newScale_y, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__SCALE_Y, newScale_y, newScale_y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.VISUALIZATION__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.VISUALIZATION__SCALE_X:
				return basicSetScale_x(null, msgs);
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				return basicSetScale_y(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.VISUALIZATION__XAXIS:
				return getXAxis();
			case AnalysisPackage.VISUALIZATION__YAXIS:
				return getYAxis();
			case AnalysisPackage.VISUALIZATION__COLOR:
				return getColor();
			case AnalysisPackage.VISUALIZATION__TITLE:
				return getTitle();
			case AnalysisPackage.VISUALIZATION__SUB_TITLE:
				return getSubTitle();
			case AnalysisPackage.VISUALIZATION__XAXIS_LABEL:
				return getXAxisLabel();
			case AnalysisPackage.VISUALIZATION__YAXIS_LABEL:
				return getYAxisLabel();
			case AnalysisPackage.VISUALIZATION__COLOR_LABEL:
				return getColorLabel();
			case AnalysisPackage.VISUALIZATION__SCALE_X:
				return getScale_x();
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				return getScale_y();
			case AnalysisPackage.VISUALIZATION__CAPTION:
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
			case AnalysisPackage.VISUALIZATION__XAXIS:
				setXAxis((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__YAXIS:
				setYAxis((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__COLOR:
				setColor((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__TITLE:
				setTitle((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__SUB_TITLE:
				setSubTitle((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__XAXIS_LABEL:
				setXAxisLabel((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__YAXIS_LABEL:
				setYAxisLabel((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__COLOR_LABEL:
				setColorLabel((String)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__SCALE_X:
				setScale_x((Scale)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				setScale_y((Scale)newValue);
				return;
			case AnalysisPackage.VISUALIZATION__CAPTION:
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
			case AnalysisPackage.VISUALIZATION__XAXIS:
				setXAxis(XAXIS_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__YAXIS:
				setYAxis(YAXIS_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__SUB_TITLE:
				setSubTitle(SUB_TITLE_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__XAXIS_LABEL:
				setXAxisLabel(XAXIS_LABEL_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__YAXIS_LABEL:
				setYAxisLabel(YAXIS_LABEL_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__COLOR_LABEL:
				setColorLabel(COLOR_LABEL_EDEFAULT);
				return;
			case AnalysisPackage.VISUALIZATION__SCALE_X:
				setScale_x((Scale)null);
				return;
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				setScale_y((Scale)null);
				return;
			case AnalysisPackage.VISUALIZATION__CAPTION:
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
			case AnalysisPackage.VISUALIZATION__XAXIS:
				return XAXIS_EDEFAULT == null ? xAxis != null : !XAXIS_EDEFAULT.equals(xAxis);
			case AnalysisPackage.VISUALIZATION__YAXIS:
				return YAXIS_EDEFAULT == null ? yAxis != null : !YAXIS_EDEFAULT.equals(yAxis);
			case AnalysisPackage.VISUALIZATION__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case AnalysisPackage.VISUALIZATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AnalysisPackage.VISUALIZATION__SUB_TITLE:
				return SUB_TITLE_EDEFAULT == null ? subTitle != null : !SUB_TITLE_EDEFAULT.equals(subTitle);
			case AnalysisPackage.VISUALIZATION__XAXIS_LABEL:
				return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
			case AnalysisPackage.VISUALIZATION__YAXIS_LABEL:
				return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
			case AnalysisPackage.VISUALIZATION__COLOR_LABEL:
				return COLOR_LABEL_EDEFAULT == null ? colorLabel != null : !COLOR_LABEL_EDEFAULT.equals(colorLabel);
			case AnalysisPackage.VISUALIZATION__SCALE_X:
				return scale_x != null;
			case AnalysisPackage.VISUALIZATION__SCALE_Y:
				return scale_y != null;
			case AnalysisPackage.VISUALIZATION__CAPTION:
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
		result.append(" (xAxis: ");
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
