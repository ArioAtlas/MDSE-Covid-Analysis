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
import se.lnu.joa.covid.model.analysis.LinearPlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl#getLineAlpha <em>Line Alpha</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearPlotImpl extends VisualizationImpl implements LinearPlot {
	/**
	 * The default value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected float lineSize = LINE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineAlpha() <em>Line Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_ALPHA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineAlpha() <em>Line Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAlpha()
	 * @generated
	 * @ordered
	 */
	protected float lineAlpha = LINE_ALPHA_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.LINEAR_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSize(float newLineSize) {
		float oldLineSize = lineSize;
		lineSize = newLineSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.LINEAR_PLOT__LINE_SIZE, oldLineSize, lineSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLineAlpha() {
		return lineAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineAlpha(float newLineAlpha) {
		float oldLineAlpha = lineAlpha;
		lineAlpha = newLineAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.LINEAR_PLOT__LINE_ALPHA, oldLineAlpha, lineAlpha));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.LINEAR_PLOT__ANIMATION, oldAnimation, newAnimation);
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
				msgs = ((InternalEObject)animation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.LINEAR_PLOT__ANIMATION, null, msgs);
			if (newAnimation != null)
				msgs = ((InternalEObject)newAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.LINEAR_PLOT__ANIMATION, null, msgs);
			msgs = basicSetAnimation(newAnimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.LINEAR_PLOT__ANIMATION, newAnimation, newAnimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.LINEAR_PLOT__ANIMATION:
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
			case AnalysisPackage.LINEAR_PLOT__LINE_SIZE:
				return getLineSize();
			case AnalysisPackage.LINEAR_PLOT__LINE_ALPHA:
				return getLineAlpha();
			case AnalysisPackage.LINEAR_PLOT__ANIMATION:
				return getAnimation();
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
			case AnalysisPackage.LINEAR_PLOT__LINE_SIZE:
				setLineSize((Float)newValue);
				return;
			case AnalysisPackage.LINEAR_PLOT__LINE_ALPHA:
				setLineAlpha((Float)newValue);
				return;
			case AnalysisPackage.LINEAR_PLOT__ANIMATION:
				setAnimation((Animation)newValue);
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
			case AnalysisPackage.LINEAR_PLOT__LINE_SIZE:
				setLineSize(LINE_SIZE_EDEFAULT);
				return;
			case AnalysisPackage.LINEAR_PLOT__LINE_ALPHA:
				setLineAlpha(LINE_ALPHA_EDEFAULT);
				return;
			case AnalysisPackage.LINEAR_PLOT__ANIMATION:
				setAnimation((Animation)null);
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
			case AnalysisPackage.LINEAR_PLOT__LINE_SIZE:
				return lineSize != LINE_SIZE_EDEFAULT;
			case AnalysisPackage.LINEAR_PLOT__LINE_ALPHA:
				return lineAlpha != LINE_ALPHA_EDEFAULT;
			case AnalysisPackage.LINEAR_PLOT__ANIMATION:
				return animation != null;
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
		result.append(" (lineSize: ");
		result.append(lineSize);
		result.append(", lineAlpha: ");
		result.append(lineAlpha);
		result.append(')');
		return result.toString();
	}

} //LinearPlotImpl
