/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimation()
	 * @generated
	 * @ordered
	 */
	protected EList<Animation> animation;

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
	public float getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public float getLineAlpha() {
		return lineAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Animation> getAnimation() {
		if (animation == null) {
			animation = new EObjectContainmentEList<Animation>(Animation.class, this, AnalysisPackage.LINEAR_PLOT__ANIMATION);
		}
		return animation;
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
				return ((InternalEList<?>)getAnimation()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
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
				getAnimation().clear();
				getAnimation().addAll((Collection<? extends Animation>)newValue);
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
				getAnimation().clear();
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
				return animation != null && !animation.isEmpty();
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
