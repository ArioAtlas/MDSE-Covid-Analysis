/**
 */
package se.lnu.joa.covid.model.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regression Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getRegressionType()
 * @model
 * @generated
 */
public enum RegressionType implements Enumerator {
	/**
	 * The '<em><b>Linnear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINNEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINNEAR(0, "Linnear", "Linnear"),

	/**
	 * The '<em><b>Logarithmic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGARITHMIC_VALUE
	 * @generated
	 * @ordered
	 */
	LOGARITHMIC(1, "Logarithmic", "Logarithmic");

	/**
	 * The '<em><b>Linnear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINNEAR
	 * @model name="Linnear"
	 * @generated
	 * @ordered
	 */
	public static final int LINNEAR_VALUE = 0;

	/**
	 * The '<em><b>Logarithmic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGARITHMIC
	 * @model name="Logarithmic"
	 * @generated
	 * @ordered
	 */
	public static final int LOGARITHMIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Regression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegressionType[] VALUES_ARRAY =
		new RegressionType[] {
			LINNEAR,
			LOGARITHMIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Regression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegressionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Regression Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegressionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegressionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regression Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegressionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegressionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regression Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegressionType get(int value) {
		switch (value) {
			case LINNEAR_VALUE: return LINNEAR;
			case LOGARITHMIC_VALUE: return LOGARITHMIC;
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
	private RegressionType(int value, String name, String literal) {
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
	
} //RegressionType
