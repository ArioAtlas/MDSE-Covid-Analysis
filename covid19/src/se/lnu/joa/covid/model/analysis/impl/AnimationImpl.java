/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.Animation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getTransitionTime <em>Transition Time</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getShadowWake <em>Shadow Wake</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getFps <em>Fps</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getEndPause <em>End Pause</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getOutputPath <em>Output Path</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl#getOutputName <em>Output Name</em>}</li>
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
	 * The default value of the '{@link #getShadowWake() <em>Shadow Wake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowWake()
	 * @generated
	 * @ordered
	 */
	protected static final float SHADOW_WAKE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShadowWake() <em>Shadow Wake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowWake()
	 * @generated
	 * @ordered
	 */
	protected float shadowWake = SHADOW_WAKE_EDEFAULT;

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
	 * The default value of the '{@link #getFps() <em>Fps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFps()
	 * @generated
	 * @ordered
	 */
	protected static final int FPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFps() <em>Fps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFps()
	 * @generated
	 * @ordered
	 */
	protected int fps = FPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPause() <em>End Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPause()
	 * @generated
	 * @ordered
	 */
	protected static final int END_PAUSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndPause() <em>End Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPause()
	 * @generated
	 * @ordered
	 */
	protected int endPause = END_PAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected int resolution = RESOLUTION_EDEFAULT;

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
		return AnalysisPackage.Literals.ANIMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShadowWake() {
		return shadowWake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowWake(float newShadowWake) {
		float oldShadowWake = shadowWake;
		shadowWake = newShadowWake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__SHADOW_WAKE, oldShadowWake, shadowWake));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFps() {
		return fps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFps(int newFps) {
		int oldFps = fps;
		fps = newFps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__FPS, oldFps, fps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndPause() {
		return endPause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPause(int newEndPause) {
		int oldEndPause = endPause;
		endPause = newEndPause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__END_PAUSE, oldEndPause, endPause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(int newResolution) {
		int oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__RESOLUTION, oldResolution, resolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__OUTPUT_PATH, oldOutputPath, outputPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANIMATION__OUTPUT_NAME, oldOutputName, outputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.ANIMATION__LABEL:
				return getLabel();
			case AnalysisPackage.ANIMATION__TRANSITION_TIME:
				return getTransitionTime();
			case AnalysisPackage.ANIMATION__SHADOW_WAKE:
				return getShadowWake();
			case AnalysisPackage.ANIMATION__WIDTH:
				return getWidth();
			case AnalysisPackage.ANIMATION__HEIGHT:
				return getHeight();
			case AnalysisPackage.ANIMATION__DURATION:
				return getDuration();
			case AnalysisPackage.ANIMATION__FPS:
				return getFps();
			case AnalysisPackage.ANIMATION__END_PAUSE:
				return getEndPause();
			case AnalysisPackage.ANIMATION__RESOLUTION:
				return getResolution();
			case AnalysisPackage.ANIMATION__OUTPUT_PATH:
				return getOutputPath();
			case AnalysisPackage.ANIMATION__OUTPUT_NAME:
				return getOutputName();
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
			case AnalysisPackage.ANIMATION__LABEL:
				setLabel((String)newValue);
				return;
			case AnalysisPackage.ANIMATION__TRANSITION_TIME:
				setTransitionTime((String)newValue);
				return;
			case AnalysisPackage.ANIMATION__SHADOW_WAKE:
				setShadowWake((Float)newValue);
				return;
			case AnalysisPackage.ANIMATION__WIDTH:
				setWidth((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__DURATION:
				setDuration((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__FPS:
				setFps((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__END_PAUSE:
				setEndPause((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__RESOLUTION:
				setResolution((Integer)newValue);
				return;
			case AnalysisPackage.ANIMATION__OUTPUT_PATH:
				setOutputPath((String)newValue);
				return;
			case AnalysisPackage.ANIMATION__OUTPUT_NAME:
				setOutputName((String)newValue);
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
			case AnalysisPackage.ANIMATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__TRANSITION_TIME:
				setTransitionTime(TRANSITION_TIME_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__SHADOW_WAKE:
				setShadowWake(SHADOW_WAKE_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__FPS:
				setFps(FPS_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__END_PAUSE:
				setEndPause(END_PAUSE_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__OUTPUT_PATH:
				setOutputPath(OUTPUT_PATH_EDEFAULT);
				return;
			case AnalysisPackage.ANIMATION__OUTPUT_NAME:
				setOutputName(OUTPUT_NAME_EDEFAULT);
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
			case AnalysisPackage.ANIMATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AnalysisPackage.ANIMATION__TRANSITION_TIME:
				return TRANSITION_TIME_EDEFAULT == null ? transitionTime != null : !TRANSITION_TIME_EDEFAULT.equals(transitionTime);
			case AnalysisPackage.ANIMATION__SHADOW_WAKE:
				return shadowWake != SHADOW_WAKE_EDEFAULT;
			case AnalysisPackage.ANIMATION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case AnalysisPackage.ANIMATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case AnalysisPackage.ANIMATION__DURATION:
				return duration != DURATION_EDEFAULT;
			case AnalysisPackage.ANIMATION__FPS:
				return fps != FPS_EDEFAULT;
			case AnalysisPackage.ANIMATION__END_PAUSE:
				return endPause != END_PAUSE_EDEFAULT;
			case AnalysisPackage.ANIMATION__RESOLUTION:
				return resolution != RESOLUTION_EDEFAULT;
			case AnalysisPackage.ANIMATION__OUTPUT_PATH:
				return OUTPUT_PATH_EDEFAULT == null ? outputPath != null : !OUTPUT_PATH_EDEFAULT.equals(outputPath);
			case AnalysisPackage.ANIMATION__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
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
		result.append(", shadowWake: ");
		result.append(shadowWake);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", duration: ");
		result.append(duration);
		result.append(", fps: ");
		result.append(fps);
		result.append(", endPause: ");
		result.append(endPause);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", outputPath: ");
		result.append(outputPath);
		result.append(", outputName: ");
		result.append(outputName);
		result.append(')');
		return result.toString();
	}

} //AnimationImpl
