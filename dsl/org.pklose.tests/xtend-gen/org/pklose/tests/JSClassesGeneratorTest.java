package org.pklose.tests;

import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.simplespec.SimplespecInjectorProvider;
import org.pklose.simplespec.generator.JSClassesGenerator;
import org.pklose.simplespec.simplespec.Diagram;
import org.pklose.simplespec.simplespec.Element;
import org.pklose.simplespec.simplespec.Model;

@RunWith(XtextRunner.class)
@InjectWith(SimplespecInjectorProvider.class)
@SuppressWarnings("all")
public class JSClassesGeneratorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  private Model diagModel;
  
  @Before
  public void prepareTest() {
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
      final Model tmpModel = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.append("Import Person.*");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("Diagram Personen {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Include Geschaeftspartner with {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("Geschaeftspartner.Name");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Include Gruppe with {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("Gruppe.Gruppenummer");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse = this._parseHelper.parse(_builder_1);
      this.diagModel = _parse;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void createTestClass() {
    EList<Element> _elements = this.diagModel.getElements();
    Iterable<Diagram> _filter = Iterables.<Diagram>filter(_elements, Diagram.class);
    final Diagram diagram = IterableExtensions.<Diagram>head(_filter);
    final JSClassesGenerator generator = new JSClassesGenerator();
    final String code = generator.generateClasses(diagram);
    code.length();
  }
}
