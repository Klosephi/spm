/**
 */
package org.pklose.simplespec.simplespec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pklose.simplespec.simplespec.SimplespecFactory
 * @model kind="package"
 * @generated
 */
public interface SimplespecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simplespec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.org.pklose.simplespec/Simplespec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simplespec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplespecPackage eINSTANCE = org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.ModelImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.ElementImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.ImportImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.DiagramImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__INCLUDES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.IncludeImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 4;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.EnumDeclarationImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEnumDeclaration()
   * @generated
   */
  int ENUM_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__VALUES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.EntityImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.DomainImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ENTITIES = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.PropertyImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.AssociationImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__MULTIPLICITY = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__TYPE = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.FieldImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getField()
   * @generated
   */
  int FIELD = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LITERAL = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.LiteralImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 11;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.pklose.simplespec.simplespec.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.simplespec.simplespec.impl.EnumImpl
   * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.pklose.simplespec.simplespec.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.pklose.simplespec.simplespec.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.pklose.simplespec.simplespec.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.simplespec.simplespec.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.pklose.simplespec.simplespec.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.pklose.simplespec.simplespec.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.pklose.simplespec.simplespec.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Diagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.simplespec.simplespec.Diagram#getImports()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Diagram#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.pklose.simplespec.simplespec.Diagram#getIncludes()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Includes();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.pklose.simplespec.simplespec.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the reference '{@link org.pklose.simplespec.simplespec.Include#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.pklose.simplespec.simplespec.Include#getEntity()
   * @see #getInclude()
   * @generated
   */
  EReference getInclude_Entity();

  /**
   * Returns the meta object for the reference list '{@link org.pklose.simplespec.simplespec.Include#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see org.pklose.simplespec.simplespec.Include#getFields()
   * @see #getInclude()
   * @generated
   */
  EReference getInclude_Fields();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.EnumDeclaration <em>Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Declaration</em>'.
   * @see org.pklose.simplespec.simplespec.EnumDeclaration
   * @generated
   */
  EClass getEnumDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.pklose.simplespec.simplespec.EnumDeclaration#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.pklose.simplespec.simplespec.EnumDeclaration#getValues()
   * @see #getEnumDeclaration()
   * @generated
   */
  EAttribute getEnumDeclaration_Values();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.pklose.simplespec.simplespec.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.simplespec.simplespec.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.pklose.simplespec.simplespec.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.pklose.simplespec.simplespec.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Domain#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.simplespec.simplespec.Domain#getImports()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Domain#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.pklose.simplespec.simplespec.Domain#getDescription()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.simplespec.simplespec.Domain#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.pklose.simplespec.simplespec.Domain#getEntities()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Entities();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.pklose.simplespec.simplespec.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.simplespec.simplespec.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see org.pklose.simplespec.simplespec.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.simplespec.simplespec.Association#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.pklose.simplespec.simplespec.Association#getMultiplicity()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Multiplicity();

  /**
   * Returns the meta object for the reference '{@link org.pklose.simplespec.simplespec.Association#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.pklose.simplespec.simplespec.Association#getType()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Type();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.pklose.simplespec.simplespec.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link org.pklose.simplespec.simplespec.Field#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.pklose.simplespec.simplespec.Field#getLiteral()
   * @see #getField()
   * @generated
   */
  EReference getField_Literal();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.pklose.simplespec.simplespec.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.pklose.simplespec.simplespec.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see org.pklose.simplespec.simplespec.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the reference '{@link org.pklose.simplespec.simplespec.Enum#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.pklose.simplespec.simplespec.Enum#getType()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimplespecFactory getSimplespecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.ModelImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.ElementImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.ImportImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.DiagramImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__IMPORTS = eINSTANCE.getDiagram_Imports();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__INCLUDES = eINSTANCE.getDiagram_Includes();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.IncludeImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE__ENTITY = eINSTANCE.getInclude_Entity();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE__FIELDS = eINSTANCE.getInclude_Fields();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.EnumDeclarationImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEnumDeclaration()
     * @generated
     */
    EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DECLARATION__VALUES = eINSTANCE.getEnumDeclaration_Values();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.EntityImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.DomainImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__IMPORTS = eINSTANCE.getDomain_Imports();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__ENTITIES = eINSTANCE.getDomain_Entities();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.PropertyImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.AssociationImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__MULTIPLICITY = eINSTANCE.getAssociation_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.FieldImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__LITERAL = eINSTANCE.getField_Literal();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.LiteralImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.pklose.simplespec.simplespec.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.simplespec.simplespec.impl.EnumImpl
     * @see org.pklose.simplespec.simplespec.impl.SimplespecPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__TYPE = eINSTANCE.getEnum_Type();

  }

} //SimplespecPackage
