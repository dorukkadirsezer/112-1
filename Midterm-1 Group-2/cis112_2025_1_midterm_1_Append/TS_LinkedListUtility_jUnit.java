package cis112_2025_1_midterm_1_Append;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




class TS_LinkedListUtility_jUnit {
	
	@Test
    void zz_jUnitWorking() {
            System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

            StudentInfo.studentTag();
            System.out.println("You got one additional point since jUnit is working.");
    }
	
	@Test
	void test_1_2__3() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 2, 0);
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 1, 2);
		
		LinkedList list3 = new LinkedList();
		listInit(list3, 3, 0);
		String temp = list3.toString();
		
		LinkedListUtility.unionAppend(list1, list2);
		
		String s = list1.toString();
		assertEquals(temp, s);
	}
	

	@Test
	void test_1__1_2_3_4() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 1, 0);
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 4, 0);
		String temp = list2.toString();
		
		LinkedListUtility.unionAppend(list1, list2);
		
		String s = list1.toString();
		assertEquals(temp, s);
	}
	
	
	@Test
	void test_1_2_3_4__5() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 4, 0);
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 1, 4);
		
		LinkedListUtility.unionAppend(list1, list2);
			
		LinkedList list3 = new LinkedList();
		listInit(list3, 5, 0);
		String temp = list3.toString();
		
		String s = list1.toString();
		assertEquals(temp, s);
	}

	
	@Test
	void test_1_2__3_4() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 2, 0);
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 2, 2);
		
		LinkedList list3 = new LinkedList();
		listInit(list3, 4, 0);
		String temp = list3.toString();
		
		LinkedListUtility.unionAppend(list1, list2);
		
		String s = list1.toString();
		assertEquals(temp, s);
	}
	
	
	/**
	 * 
	 * @param list
	 * @param size of the list to be created
	 * @param index list elements are: index+1, index+2, ...
	 */
	private static void listInit(LinkedList list, int size, int index) {
		for (int i = 1; i <= size; i++) {
			list.add(new Node("" + (i+index)));
		}
	}
	
}
