package org.pklose.tests.language;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pklose.simplespec.SimplespecInjectorProvider;
import org.pklose.simplespec.simplespec.Model;

@RunWith(XtextRunner.class)
@InjectWith(SimplespecInjectorProvider.class)
@SuppressWarnings("all")
public class LanguageTests {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Test
  public void testDomain() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Domain Person Description: \"Domain enth�lt alle Partner Daten\" {");
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
      this.validationTester.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Enumeration Geschlecht {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Maenlich,Weiblich");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this.validationTester.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
