/**
 */
package se.lnu.joa.covid.model.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visualization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualizationType()
 * @model
 * @generated
 */
public enum VisualizationType implements Enumerator {
	/**
	 * The '<em><b>Linear Plot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_PLOT_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR_PLOT(0, "LinearPlot", "LinearPlot"),

	/**
	 * The '<em><b>Scatter Plot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_PLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER_PLOT(1, "ScatterPlot", "ScatterPlot");

	/**
	 * The '<em><b>Linear Plot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_PLOT
	 * @model name="LinearPlot"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_PLOT_VALUE = 0;

	/**
	 * The '<em><b>Scatter Plot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_PLOT
	 * @model name="ScatterPlot"
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_PLOT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Visualization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VisualizationType[] VALUES_ARRAY =
		new VisualizationType[] {
			LINEAR_PLOT,
			SCATTER_PLOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Visualization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VisualizationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visualization Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisualizationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisualizationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visualization Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisualizationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisualizationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visualization Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisualizationType get(int value) {
		switch (value) {
			case LINEAR_PLOT_VALUE: return LINEAR_PLOT;
			case SCATTER_PLOT_VALUE: return SCATTER_PLOT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VisualizationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VisualizationType
