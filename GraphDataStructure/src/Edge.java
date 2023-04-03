import java.util.LinkedList;

public class Edge {

	private String element;
	private Vertex u;
	private Vertex v;
	private LinkedList<Edge> containerU;
	private LinkedList<Edge> containerV;

	public Edge(Vertex u, Vertex v, String element) {
		this.element = element;
		this.u = u;
		this.v = v;
		this.containerU = u.getContainer();
		this.containerV = v.getContainer();

		this.containerU.add(this);
		this.containerV.add(this);
	}

	public Edge() {
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Vertex getU() {
		return u;
	}

	public void setU(Vertex u) {
		this.u = u;
	}

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}

	public LinkedList<Edge> getContainerU() {
		return containerU;
	}

	public void setContainerU(LinkedList<Edge> containerU) {
		this.containerU = containerU;
	}

	public LinkedList<Edge> getContainerV() {
		return containerV;
	}

	public void setContainerV(LinkedList<Edge> containerV) {
		this.containerV = containerV;
	}

}
