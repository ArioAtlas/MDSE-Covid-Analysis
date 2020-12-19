/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.config.Animation;
import se.lnu.joa.covid.model.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getTransitionTime <em>Transition Time</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AnimationImpl#getOutputPath <em>Output Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimationImpl extends MinimalEObjectImpl.Container implements Animation {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected String transitionTime = TRANSITION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected String outputName = OUTPUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected String outputPath = OUTPUT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ANIMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionTime() {
		return transitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTime(String newTransitionTime) {
		String oldTransitionTime = transitionTime;
		transitionTime = newTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputName() {
		return outputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputName(String newOutputName) {
		String oldOutputName = outputName;
		outputName = newOutputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__OUTPUT_NAME, oldOutputName, outputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputPath() {
		return outputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPath(String newOutputPath) {
		String oldOutputPath = outputPath;
		outputPath = newOutputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ANIMATION__OUTPUT_PATH, oldOutputPath, outputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.ANIMATION__LABEL:
				return getLabel();
			case ConfigPackage.ANIMATION__TRANSITION_TIME:
				return getTransitionTime();
			case ConfigPackage.ANIMATION__WIDTH:
				return getWidth();
			case ConfigPackage.ANIMATION__HEIGHT:
				return getHeight();
			case ConfigPackage.ANIMATION__DURATION:
				return getDuration();
			case ConfigPackage.ANIMATION__OUTPUT_NAME:
				return getOutputName();
			case ConfigPackage.ANIMATION__OUTPUT_PATH:
				return getOutputPath();
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
			case ConfigPackage.ANIMATION__LABEL:
				setLabel((String)newValue);
				return;
			case ConfigPackage.ANIMATION__TRANSITION_TIME:
				setTransitionTime((String)newValue);
				return;
			case ConfigPackage.ANIMATION__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ConfigPackage.ANIMATION__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ConfigPackage.ANIMATION__DURATION:
				setDuration((Integer)newValue);
				return;
			case ConfigPackage.ANIMATION__OUTPUT_NAME:
				setOutputName((String)newValue);
				return;
			case ConfigPackage.ANIMATION__OUTPUT_PATH:
				setOutputPath((String)newValue);
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
			case ConfigPackage.ANIMATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__TRANSITION_TIME:
				setTransitionTime(TRANSITION_TIME_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__OUTPUT_NAME:
				setOutputName(OUTPUT_NAME_EDEFAULT);
				return;
			case ConfigPackage.ANIMATION__OUTPUT_PATH:
				setOutputPath(OUTPUT_PATH_EDEFAULT);
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
			case ConfigPackage.ANIMATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ConfigPackage.ANIMATION__TRANSITION_TIME:
				return TRANSITION_TIME_EDEFAULT == null ? transitionTime != null : !TRANSITION_TIME_EDEFAULT.equals(transitionTime);
			case ConfigPackage.ANIMATION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ConfigPackage.ANIMATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ConfigPackage.ANIMATION__DURATION:
				return duration != DURATION_EDEFAULT;
			case ConfigPackage.ANIMATION__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
			case ConfigPackage.ANIMATION__OUTPUT_PATH:
				return OUTPUT_PATH_EDEFAULT == null ? outputPath != null : !OUTPUT_PATH_EDEFAULT.equals(outputPath);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", transitionTime: ");
		result.append(transitionTime);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", duration: ");
		result.append(duration);
		result.append(", outputName: ");
		result.append(outputName);
		result.append(", outputPath: ");
		result.append(outputPath);
		result.append(')');
		return result.toString();
	}

} //AnimationImpl
