import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private LinkedList<Edge> edges;
	private LinkedList<Vertex> vertices;

	public Graph() {
		this.edges = new LinkedList<Edge>();
		this.vertices = new LinkedList<Vertex>();
	}

	public LinkedList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<Edge> edges) {
		this.edges = edges;
	}

	public LinkedList<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(LinkedList<Vertex> vertices) {
		this.vertices = vertices;
	}

	public void vertices() {
		Iterator<Vertex> iterator = vertices.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next().getElement();
			System.out.println(element);
		}
	}

	public void edges() {
		Iterator<Edge> iterator = edges.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next().getElement();
			System.out.println(element);
		}
	}

	public void incidentEdges(Vertex v) {
		Iterator<Edge> iterator = v.getContainer().iterator();
		while (iterator.hasNext()) {
			String element = iterator.next().getElement();
			System.out.println(element);
		}
	}

	public Vertex opposite(Vertex v, Edge e) {

		Vertex answer;

		if (e.getV().equals(v)) {
			answer = e.getU();
		} else if (e.getU().equals(v)) {
			answer = e.getV();
		} else {
			answer = null;
		}

		return answer;
	}

	public Vertex[] endVertices(Edge e) {

		Vertex[] endPoints = new Vertex[2];
		endPoints[0] = e.getU();
		endPoints[1] = e.getV();

		return endPoints;
	}

	public boolean areAdjacent(Vertex v, Vertex w) {

		LinkedList container;

		if (v.getContainer().size() <= w.getContainer().size()) {
			container = v.getContainer();
		} else {
			container = w.getContainer();
		}

		Iterator<Edge> iterator = container.iterator();

		while (iterator.hasNext()) {
			Edge edge = iterator.next();
			if (edge.getU().equals(v) && edge.getV().equals(w) || edge.getU().equals(w) && edge.getV().equals(v)) {
				return true;
			}
		}
		return false;
	}

	public void replace(Vertex v, String elem) {
		v.setElement(elem);
	}

	public void replace(Edge e, String elem) {
		e.setElement(elem);
	}

	public Vertex insertVertex(String element) {
		Vertex vertex = new Vertex(element);
		this.vertices.add(vertex);
		return vertex;
	}

	public Edge insertEdge(Vertex v, Vertex w, String element) {
		Edge edge = new Edge(v, w, element);
		this.edges.add(edge);
		return edge;
	}

	public void removeEdge(Edge e) {
		e.getContainerU().remove(e);
		e.getContainerV().remove(e);
		this.getEdges().remove(e);
		e = null;
	}

	public void removeVertex(Vertex v) {

		Iterator<Edge> iterator = v.getContainer().iterator();

		while (iterator.hasNext()) {
			Edge edge = iterator.next();
			removeEdge(edge);
		}

		this.vertices.remove(v);
		v = null;

	}

}
