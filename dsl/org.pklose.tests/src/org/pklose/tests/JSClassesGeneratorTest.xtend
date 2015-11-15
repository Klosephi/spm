package org.pklose.tests

import org.junit.Test
import org.pklose.simplespec.generator.JSClassesGenerator
import org.eclipse.xtext.junit4.util.ParseHelper
import org.pklose.simplespec.simplespec.Entity
import javax.inject.Inject
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.pklose.simplespec.SimplespecInjectorProvider
import org.pklose.simplespec.simplespec.Model
import org.pklose.simplespec.simplespec.Domain

@RunWith(XtextRunner)
@InjectWith(SimplespecInjectorProvider)
class JSClassesGeneratorTest {
	
	@Inject extension ParseHelper<Model>
	
	@Test
	def public void createTestClass () {
		val model = '''
		Domain Person Description: "Domain enthält alle Partner Daten" {
			
			Entity Geschaeftspartner {
				Field Name: Text
			}
			
			
			Entity Gruppe {
				Field Gruppenummer:Int
				Relation 1..N Teilnehmer:Geschaeftspartner		
			}
			
		}
		'''.parse;
		
		val entities = (model.elements.head as Domain).entities;
		val JSClassesGenerator generator = new JSClassesGenerator();
		val code = generator.generateClasses(entities);
		code.length;
	}
	
}