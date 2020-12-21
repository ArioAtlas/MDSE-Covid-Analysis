/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getLabel <em>Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getTransitionTime <em>Transition Time</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getShadowWake <em>Shadow Wake</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getWidth <em>Width</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getHeight <em>Height</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getDuration <em>Duration</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getFps <em>Fps</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getEndPause <em>End Pause</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getResolution <em>Resolution</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getOutputPath <em>Output Path</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.Animation#getOutputName <em>Output Name</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_TransitionTime()
	 * @model
	 * @generated
	 */
	String getTransitionTime();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Wake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Wake</em>' attribute.
	 * @see #setShadowWake(float)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_ShadowWake()
	 * @model
	 * @generated
	 */
	float getShadowWake();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getShadowWake <em>Shadow Wake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Wake</em>' attribute.
	 * @see #getShadowWake()
	 * @generated
	 */
	void setShadowWake(float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Fps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fps</em>' attribute.
	 * @see #setFps(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Fps()
	 * @model
	 * @generated
	 */
	int getFps();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getFps <em>Fps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fps</em>' attribute.
	 * @see #getFps()
	 * @generated
	 */
	void setFps(int value);

	/**
	 * Returns the value of the '<em><b>End Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Pause</em>' attribute.
	 * @see #setEndPause(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_EndPause()
	 * @model
	 * @generated
	 */
	int getEndPause();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getEndPause <em>End Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Pause</em>' attribute.
	 * @see #getEndPause()
	 * @generated
	 */
	void setEndPause(int value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(int)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_Resolution()
	 * @model
	 * @generated
	 */
	int getResolution();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(int value);

	/**
	 * Returns the value of the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Path</em>' attribute.
	 * @see #setOutputPath(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_OutputPath()
	 * @model
	 * @generated
	 */
	String getOutputPath();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getOutputPath <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Path</em>' attribute.
	 * @see #getOutputPath()
	 * @generated
	 */
	void setOutputPath(String value);

	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnimation_OutputName()
	 * @model
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.Animation#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

} // Animation
