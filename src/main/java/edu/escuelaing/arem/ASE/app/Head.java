package edu.escuelaing.arem.ASE.app;

public class Head {
	 Node head;
	 Node next;

	public Head(Node first, Node last) {
		head = first;
		next = last;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


}
