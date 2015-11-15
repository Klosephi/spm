/**
 */
package org.pklose.simplespec.simplespec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pklose.simplespec.simplespec.Association;
import org.pklose.simplespec.simplespec.Diagram;
import org.pklose.simplespec.simplespec.Domain;
import org.pklose.simplespec.simplespec.Element;
import org.pklose.simplespec.simplespec.Entity;
import org.pklose.simplespec.simplespec.EnumDeclaration;
import org.pklose.simplespec.simplespec.Field;
import org.pklose.simplespec.simplespec.Import;
import org.pklose.simplespec.simplespec.Include;
import org.pklose.simplespec.simplespec.Literal;
import org.pklose.simplespec.simplespec.Model;
import org.pklose.simplespec.simplespec.Property;
import org.pklose.simplespec.simplespec.SimplespecFactory;
import org.pklose.simplespec.simplespec.SimplespecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplespecFactoryImpl extends EFactoryImpl implements SimplespecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimplespecFactory init()
  {
    try
    {
      SimplespecFactory theSimplespecFactory = (SimplespecFactory)EPackage.Registry.INSTANCE.getEFactory(SimplespecPackage.eNS_URI);
      if (theSimplespecFactory != null)
      {
        return theSimplespecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimplespecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplespecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimplespecPackage.MODEL: return createModel();
      case SimplespecPackage.ELEMENT: return createElement();
      case SimplespecPackage.IMPORT: return createImport();
      case SimplespecPackage.DIAGRAM: return createDiagram();
      case SimplespecPackage.INCLUDE: return createInclude();
      case SimplespecPackage.ENUM_DECLARATION: return createEnumDeclaration();
      case SimplespecPackage.ENTITY: return createEntity();
      case SimplespecPackage.DOMAIN: return createDomain();
      case SimplespecPackage.PROPERTY: return createProperty();
      case SimplespecPackage.ASSOCIATION: return createAssociation();
      case SimplespecPackage.FIELD: return createField();
      case SimplespecPackage.LITERAL: return createLiteral();
      case SimplespecPackage.ENUM: return createEnum();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDeclaration createEnumDeclaration()
  {
    EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
    return enumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.simplespec.simplespec.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplespecPackage getSimplespecPackage()
  {
    return (SimplespecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimplespecPackage getPackage()
  {
    return SimplespecPackage.eINSTANCE;
  }

} //SimplespecFactoryImpl
