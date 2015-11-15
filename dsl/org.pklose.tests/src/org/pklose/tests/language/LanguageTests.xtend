package org.pklose.tests.language

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.pklose.simplespec.SimplespecInjectorProvider
import org.pklose.simplespec.simplespec.Model

@RunWith(XtextRunner)
@InjectWith(SimplespecInjectorProvider)
class LanguageTests {
	
	@Inject extension ParseHelper<Model>
	
	@Inject ValidationTestHelper validationTester
	
	@Test
	def public void testDomain () {
		val model = '''
		Domain Person Description: "Domain enth�lt alle Partner Daten" {
			
			Entity Geschaeftspartner {
				Field Name: Text
			}
			
			
			Entity Gruppe {
				Field Gruppenummer:Int
				Relation 1..N Teilnehmer:Geschaeftspartner		
			}
			
		}
		'''.parse;
		
		validationTester.assertNoIssues(model);		
	}
	
	@Test
	def public void testEnum () {
		val model = '''
		Enumeration Geschlecht {
			Maenlich,Weiblich
		}
		'''.parse;
		
		validationTester.assertNoIssues(model);	
	}
	
	
	
}