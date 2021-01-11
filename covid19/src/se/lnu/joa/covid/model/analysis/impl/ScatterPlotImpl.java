/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.Animation;
import se.lnu.joa.covid.model.analysis.ScatterPlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScatterPlotImpl extends VisualizationImpl implements ScatterPlot {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final float ALPHA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected float alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final float STROKE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected float stroke = STROKE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimation()
	 * @generated
	 * @ordered
	 */
	protected Animation animation;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.SCATTER_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlpha(float newAlpha) {
		float oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCATTER_PLOT__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStroke(float newStroke) {
		float oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCATTER_PLOT__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Animation getAnimation() {
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimation(Animation newAnimation, NotificationChain msgs) {
		Animation oldAnimation = animation;
		animation = newAnimation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCATTER_PLOT__ANIMATION, oldAnimation, newAnimation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnimation(Animation newAnimation) {
		if (newAnimation != animation) {
			NotificationChain msgs = null;
			if (animation != null)
				msgs = ((InternalEObject)animation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.SCATTER_PLOT__ANIMATION, null, msgs);
			if (newAnimation != null)
				msgs = ((InternalEObject)newAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.SCATTER_PLOT__ANIMATION, null, msgs);
			msgs = basicSetAnimation(newAnimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCATTER_PLOT__ANIMATION, newAnimation, newAnimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.SCATTER_PLOT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.SCATTER_PLOT__ANIMATION:
				return basicSetAnimation(null, msgs);
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
			case AnalysisPackage.SCATTER_PLOT__ALPHA:
				return getAlpha();
			case AnalysisPackage.SCATTER_PLOT__STROKE:
				return getStroke();
			case AnalysisPackage.SCATTER_PLOT__ANIMATION:
				return getAnimation();
			case AnalysisPackage.SCATTER_PLOT__SIZE:
				return getSize();
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
			case AnalysisPackage.SCATTER_PLOT__ALPHA:
				setAlpha((Float)newValue);
				return;
			case AnalysisPackage.SCATTER_PLOT__STROKE:
				setStroke((Float)newValue);
				return;
			case AnalysisPackage.SCATTER_PLOT__ANIMATION:
				setAnimation((Animation)newValue);
				return;
			case AnalysisPackage.SCATTER_PLOT__SIZE:
				setSize((String)newValue);
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
			case AnalysisPackage.SCATTER_PLOT__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case AnalysisPackage.SCATTER_PLOT__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case AnalysisPackage.SCATTER_PLOT__ANIMATION:
				setAnimation((Animation)null);
				return;
			case AnalysisPackage.SCATTER_PLOT__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case AnalysisPackage.SCATTER_PLOT__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case AnalysisPackage.SCATTER_PLOT__STROKE:
				return stroke != STROKE_EDEFAULT;
			case AnalysisPackage.SCATTER_PLOT__ANIMATION:
				return animation != null;
			case AnalysisPackage.SCATTER_PLOT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ScatterPlotImpl
