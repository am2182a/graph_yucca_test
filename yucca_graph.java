import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class yucca_graph {

	
	public static Graph non_yucca() {
		Graph non_yucca = new AdjacencyListGraph("non-Yucca");
		String styleSheet ="edge {arrow-shape: arrow; arrow-size: 20px, 10px;} node{text-size: 30;} ";
		non_yucca.addAttribute("ui.stylesheet",styleSheet);
		
		non_yucca.addNode("A");
		non_yucca.addNode("B");
		non_yucca.addNode("C");
		non_yucca.addNode("D");
		non_yucca.addNode("E");
		non_yucca.addNode("F");
		
		non_yucca.addEdge("AB", "A", "B",true);
		non_yucca.addEdge("AC", "A", "C",true);
		non_yucca.addEdge("BD", "B", "D",true);
		non_yucca.addEdge("CF", "C", "F",true);
		non_yucca.addEdge("BE", "B", "E",true);
		non_yucca.addEdge("AE", "A", "E",true);
		non_yucca.addEdge("EF", "E", "F",true);
				
		for (Node node : non_yucca) {
            node.addAttribute("ui.label", node.getId());
        }		
		
		return non_yucca; 
	}
	
	public static Graph yucca() {
		Graph yucca = new AdjacencyListGraph("Yucca"); 
		String styleSheet ="edge {arrow-shape: arrow; arrow-size: 20px, 10px;} node{text-size: 30;} ";
		yucca.addAttribute("ui.stylesheet",styleSheet);
		
		yucca.addNode("A");
		yucca.addNode("B");
		yucca.addNode("C");
		yucca.addNode("D");
		yucca.addNode("E");
		yucca.addNode("F");
		
		yucca.addEdge("AB", "A", "B",true);
		yucca.addEdge("AC", "A", "C",true);
		yucca.addEdge("AD", "A", "D",true);
		yucca.addEdge("AE", "A", "E",true);
		yucca.addEdge("AF", "A", "F",true);
		yucca.addEdge("BE", "B", "E",true);
		yucca.addEdge("BC", "B", "C",true);
		yucca.addEdge("CF", "C", "F",true);
		yucca.addEdge("ED", "E", "D",true);
		yucca.addEdge("DB", "D", "B",true);
		yucca.addEdge("FC", "F", "C",true);
		
		for (Node node : yucca) {
            node.addAttribute("ui.label", node.getId());
        }	
		
		return yucca; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph yucca = yucca(); 
		Graph non_yucca = non_yucca();
		yucca.display(); 
		
		
	}

}
