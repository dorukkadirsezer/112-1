package cis112_2025_1_midterm_1_linkedListIntersection;

/**
 * Linked list.
 * 
 * @author bingol
 * changes by ruhan alpaydin
 */
public class LinkedList {

	Node head = null;

	public LinkedList() {
		head = null;
	}

	/**
	 * Add a node to the back of the list.
	 * @param node
	 */
	public void add(Node node) {
		if (head == null) {
			// empty list
			head = node;
			node.next = null;
			return;
		}
		// find the last node as x
		Node x = head;
		while (x.next != null) {
			x = x.next;
		}
		x.next = node;
		node.next = null;
	}

	
	/**
	 * Traverse {@code next} links
	 * @return
	 */
	public String canonical() {
		StringBuilder sb = new StringBuilder();
		// Node last = head; // last node
		Node x = head;
		
		// next-chain
		while (x != null) {
			sb.append("," + x.canonical());
			// last = x;
			x = x.next;
		}
		return sb.toString();
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node x = head;
		// next chain
		while (x != null) {
			sb.append(x.canonical() + ",");
			x = x.next;
		}
		sb.append(".");

		return sb.toString();
	}

	
	public Node getHead() {
		return head;
	}

	
	public void setHead(Node head) {
		this.head = head;
	}
}
