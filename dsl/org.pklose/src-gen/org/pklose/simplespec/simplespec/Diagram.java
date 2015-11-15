/**
 */
package org.pklose.simplespec.simplespec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.simplespec.simplespec.Diagram#getImports <em>Imports</em>}</li>
 *   <li>{@link org.pklose.simplespec.simplespec.Diagram#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends Element
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
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDiagram_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.simplespec.simplespec.Include}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.pklose.simplespec.simplespec.SimplespecPackage#getDiagram_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Include> getIncludes();

} // Diagram
