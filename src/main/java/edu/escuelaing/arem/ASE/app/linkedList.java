package edu.escuelaing.arem.ASE.app;

public class linkedList {

	private Head head;

	public linkedList() {
		head = new Head(null, null);
	}

	public void insert(Double data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (head.getHead() == null)
			head.setHead(new_node);
		else {
			Node last = head.getHead();
			while (last.nextNode() != null) {
				last = last.nextNode();
			}
			last.setNext(new_node);
		}
		head.setNext(new_node);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node currNode  = head.getNext();
		while (currNode  != null) {
			sb.append(currNode.geData()).append(" ");
			currNode  = currNode.nextNode();
		}
		return sb.toString().trim();

	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
