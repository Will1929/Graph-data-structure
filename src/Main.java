public class Main {

	public static void main(String[] args) {

		Graph graph = new Graph();

		Vertex a1 = graph.insertVertex("1");
		Vertex a2 = graph.insertVertex("2");
		Vertex a3 = graph.insertVertex("3");
		Vertex a4 = graph.insertVertex("4");
		Vertex a5 = graph.insertVertex("5");
		Vertex a6 = graph.insertVertex("6");
		Vertex a7 = graph.insertVertex("7");
		Vertex a8 = graph.insertVertex("8");

		Edge e1 = graph.insertEdge(a1, a2, "e1");
		Edge e2 = graph.insertEdge(a2, a3, "e2");
		Edge e3 = graph.insertEdge(a3, a4, "e3");
		Edge e4 = graph.insertEdge(a4, a5, "e4");
		Edge e5 = graph.insertEdge(a5, a6, "e5");
		Edge e6 = graph.insertEdge(a6, a7, "e6");
		Edge e7 = graph.insertEdge(a7, a8, "e7");
		Edge e8 = graph.insertEdge(a8, a1, "e8");

		
		System.out.println(graph.areAdjacent(a3, a5));
		graph.vertices();
		
	}

}
