/**
 */
package org.pklose.simplespec.simplespec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.simplespec.simplespec.Domain#getImports <em>Imports</em>}</li>
 *   <li>{@link org.pklose.simplespec.simplespec.Domain#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pklose.simplespec.simplespec.Domain#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Element
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.simplespec.simplespec.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDomain_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDomain_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.pklose.simplespec.simplespec.Domain#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.simplespec.simplespec.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDomain_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // Domain
