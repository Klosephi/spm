package org.pklose.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.pklose.simplespec.SimplespecInjectorProvider
import org.pklose.simplespec.generator.JSClassesGenerator
import org.pklose.simplespec.simplespec.Diagram
import org.pklose.simplespec.simplespec.Model

@RunWith(XtextRunner)
@InjectWith(SimplespecInjectorProvider)
class JSClassesGeneratorTest {
	
	@Inject extension ParseHelper<Model>
	
	var Model diagModel;
	
	@Before
	def public void prepareTest () {
		val tmpModel = '''
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
		
		diagModel = '''
				
		Import Person.*

		Diagram Personen {
			Include Geschaeftspartner with {
				Geschaeftspartner.Name
			}
			
			Include Gruppe with {
				Gruppe.Gruppenummer
			}
		}
		'''.parse;
	}
	
	@Test
	def public void createTestClass () {		
		val diagram = diagModel.elements.filter(typeof(Diagram)).head;
		val JSClassesGenerator generator = new JSClassesGenerator();
		val code = generator.generateClasses(diagram);
		code.length;
	}
	
}