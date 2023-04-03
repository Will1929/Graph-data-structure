import java.util.LinkedList;

public class Vertex {

	private String element;
	private LinkedList<Edge> container;

	public Vertex(String element) {
		this.element = element;
		this.container = new LinkedList<Edge>();
	}

	public Vertex() {
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public LinkedList<Edge> getContainer() {
		return container;
	}

	public void setContainer(LinkedList<Edge> container) {
		this.container = container;
	}

}
