package org.pklose.simplespec.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.pklose.simplespec.simplespec.Diagram

class JSDiagrammGenerator implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {		
		val diagrams = input.allContents.toIterable.filter(typeof(Diagram))		
		diagrams.forEach[printDiagram]
	}
	
	
	
	
	def public String printDiagram (Diagram diagram) {
		 var head = createHead(diagram);
		 head += createBody (diagram);
		 
		 return head;			
	}
	
	def String createBody(Diagram diagram) {
		return '''
			<body>
			  <div id="myholder"></div>
			  <script type="text/javascript">
			
			    var graph = new joint.dia.Graph();

				var paper = new joint.dia.Paper({
				    el: $('#paper'),
				    width: 800,
				    height: 600,
				    gridSize: 1,
				    model: graph
				});
				
				
				var uml = joint.shapes.uml;

			
			    var rect = new joint.shapes.basic.Rect({
			        position: { x: 100, y: 30 },
			        size: { width: 100, height: 30 },
			        attrs: { rect: { fill: 'blue' }, text: { text: 'my box', fill: 'white' } }
			    });
			    
			    
			    
			    
			    var rect2 = rect.clone();
			    rect2.translate(300);
			
			    var link = new joint.dia.Link({
			        source: { id: rect.id },
			        target: { id: rect2.id }
			    });
			
			    graph.addCells([rect, rect2, link]);
			  </script>
			</body>
			</html>
		'''
	}
	
	def String createHead(Diagram diagram) {
		val htmlHead = '''
		<!DOCTYPE html>
		<html>
		<head>
		    <link rel="stylesheet" href="joint.css" />
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-alpha1/jquery.min.js"></script>
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/3.10.1/lodash.min.js"></script>
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/backbone.js/1.2.3/backbone-min.js"></script>
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/jointjs/0.9.5/joint.min.js"></script>
		</head>'''
		
		return htmlHead;
		
	}
	
}