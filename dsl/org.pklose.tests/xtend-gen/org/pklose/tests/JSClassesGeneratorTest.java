package org.pklose.tests;

import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.simplespec.SimplespecInjectorProvider;
import org.pklose.simplespec.generator.JSClassesGenerator;
import org.pklose.simplespec.simplespec.Domain;
import org.pklose.simplespec.simplespec.Element;
import org.pklose.simplespec.simplespec.Entity;
import org.pklose.simplespec.simplespec.Model;

@RunWith(XtextRunner.class)
@InjectWith(SimplespecInjectorProvider.class)
@SuppressWarnings("all")
public class JSClassesGeneratorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Test
  public void createTestClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Domain Person Description: \"Domain enthält alle Partner Daten\" {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Geschaeftspartner {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Field Name: Text");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Gruppe {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Field Gruppenummer:Int");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Relation 1..N Teilnehmer:Geschaeftspartner\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EList<Element> _elements = model.getElements();
      Element _head = IterableExtensions.<Element>head(_elements);
      final EList<Entity> entities = ((Domain) _head).getEntities();
      final JSClassesGenerator generator = new JSClassesGenerator();
      final String code = generator.generateClasses(entities);
      code.length();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
