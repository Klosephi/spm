/**
 */
package org.pklose.simplespec.simplespec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.simplespec.simplespec.Association#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.pklose.simplespec.simplespec.Association#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.pklose.simplespec.simplespec.SimplespecPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Property
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(String)
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getAssociation_Multiplicity()
   * @model
   * @generated
   */
  String getMultiplicity();

  /**
   * Sets the value of the '{@link org.pklose.simplespec.simplespec.Association#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getAssociation_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.pklose.simplespec.simplespec.Association#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

} // Association
