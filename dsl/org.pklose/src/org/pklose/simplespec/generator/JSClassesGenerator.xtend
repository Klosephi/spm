package org.pklose.simplespec.generator

import org.pklose.simplespec.simplespec.Diagram
import org.pklose.simplespec.simplespec.Field

class JSClassesGenerator {

/*
 * Diagram Personen {
	Include Geschaeftspartner with {
		Geschaeftspartner.Name
	}
	
	Include Gruppe with {
		Gruppe.Gruppenummer
	}
}
 */	
	def public String generateClasses (Diagram diagram) {		
		
		return '''
		var classes = {
			«FOR include : diagram.includes»
				«include.entity.name» : new uml.Interface ({
					position: { x:300 ,y:50},
					size: { width: 240, height: 100 },	
					name: '«include.entity.name»',
					attributes:[«FOR attribute : include.fields.filter(typeof(Field))»
						'«attribute.name»: «attribute.literal»'
					«ENDFOR»
					attrs: {
				'.uml-class-name-rect': {
				fill: '#feb662',
				stroke: '#ffffff',
				'stroke-width': 0.5
				},
				'.uml-class-attrs-rect, .uml-class-methods-rect': {
				fill: '#fdc886',
				stroke: '#fff',
				'stroke-width': 0.5
				},
				'.uml-class-attrs-text': {
				ref: '.uml-class-attrs-rect',
				'ref-y': 0.5,
				'y-alignment': 'middle'
				},
				'.uml-class-methods-text': {
				ref: '.uml-class-methods-rect',
				'ref-y': 0.5,
				'y-alignment': 'middle'
				}
				})
			«ENDFOR»
		}
		'''
	}	
}