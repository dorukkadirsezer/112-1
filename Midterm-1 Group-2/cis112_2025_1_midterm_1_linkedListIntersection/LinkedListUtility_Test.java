package cis112_2025_1_midterm_1_linkedListIntersection;


public class LinkedListUtility_Test {
	
		
	public static void main(String[] args) {
		
		
		// 1st test //
				
		// list1 = 1
		LinkedList list1 = new LinkedList();
		listInit(list1, 1, 0);
		String list1String = list1.toString();
		
		// list2 = 2, 3
		LinkedList list2 = new LinkedList();
		listInit(list2, 2, 1);
		String list2String = list2.toString();
				
				
		System.out.println(list1String + " - " + list2String + " = " + LinkedListUtility.intersection(list1, list2));
		
		
		// 2nd test //
				
		// list1 = 1, 2
		list1 = new LinkedList();
		listInit(list1, 2, 0);
		list1String = list1.toString();

		// list2 = 2, 3
		list2 = new LinkedList();
		listInit(list2, 2, 1);
		list2String = list2.toString();
		
		System.out.println(list1String + " - " + list2String + " = " + LinkedListUtility.intersection(list1, list2));
		
		
		// list1 = 1, 2, 3, 4
		list1 = new LinkedList();
		listInit(list1, 4, 0);
		list1String = list1.toString();

		// list2 = 2, 3
		list2 = new LinkedList();
		listInit(list2, 2, 1);
		list2String = list2.toString();
		
		System.out.println(list1String + " - " + list2String + " = " + LinkedListUtility.intersection(list1, list2));

	}
	
	
	private static void listInit(LinkedList list, int size, int index) {
		for (int i = 1; i <= size; i++) {
			list.add(new Node("" + (i+index)));
		}
	}
	
}
