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
		Node currNode  = head.getHead();
		while (currNode  != null) {
			
			sb.append(currNode.geData()).append(" ");
			currNode  = currNode.nextNode();
		}
		return sb.toString().trim();

	}
	public double sum (linkedList data) {
		double sum = 0;
		Node currNode  = data.head.getHead();
		while (currNode  != null) {
			sum+=currNode.geData();
			currNode  = currNode.nextNode();
		}
		return sum;
			
		
	}
	public double sum (linkedList data, double media) {
		double sum = 0;
		Node currNode  = data.head.getHead();
		while (currNode  != null) {
			//System.out.println(currNode.geData());
			sum+=Math.pow(currNode.geData()-media,2);
			currNode  = currNode.nextNode();
		}
		return sum;
			
		
	}


}
