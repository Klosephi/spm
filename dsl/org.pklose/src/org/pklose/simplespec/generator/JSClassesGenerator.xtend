package org.pklose.simplespec.generator

import org.pklose.simplespec.simplespec.Entity
import org.pklose.simplespec.simplespec.Field

class JSClassesGenerator {
	
	
	def public String generateClasses (Iterable<Entity> entities) {
		return '''
		var classes = {
			«FOR entity : entities»
				«entity.name» : new uml.Interface ({
					position: { x:300 ,y:50},
					size: { width: 240, height: 100 },	
					name: 'Mammal',
					attributes:[«FOR attribute : entity.properties.filter(typeof(Field))»
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