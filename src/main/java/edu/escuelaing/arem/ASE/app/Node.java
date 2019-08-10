package edu.escuelaing.arem.ASE.app;

public class Node {

	double data;
	Node next;

	// Constructor
	public Node(Double d) {
		data = d;
		next = null;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public Node nextNode() {
		return next;
	}

	public double geData() {
		return data;
	}

}
