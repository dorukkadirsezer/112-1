package cis112_2025_1_midterm_1_linkedListIntersection;

/**
 * A node having data as String.
 * 
 * @author bingol
 */
public class Node {

	public String data;
	public Node next;

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "[Node: data=" + data + "]";
	}

	public String canonical() {
		return data;
	}
}
