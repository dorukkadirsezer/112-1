package cis112_2025_1_midterm_1_linkedListIntersection;

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
	void test_1_2__1_2_3() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 2, 0);
		String list1String = list1.toString();
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 3, 0);
				
		LinkedList resList = LinkedListUtility.intersection(list1, list2);
		
		String resString = resList.toString();
		assertEquals(list1String, resString);
	}
	

	@Test
	void test_1__1_2_3_4() {
		LinkedList list1 = new LinkedList();
		listInit(list1, 1, 0);
		String list1String = list1.toString();
		
		LinkedList list2 = new LinkedList();
		listInit(list2, 4, 0);
		
		LinkedList resList = LinkedListUtility.intersection(list1, list2);
		
		String resString = resList.toString();
		
		assertEquals(list1String, resString);
	}
	
	
	@Test
    void test_1_2_3_4__1_2_3_4() {
            
            LinkedList list1 = new LinkedList();
            listInit(list1, 4, 0);
            String list1String = list1.toString();
            
            LinkedList list2 = new LinkedList();
            listInit(list2, 4, 0);
            
            LinkedList resList = LinkedListUtility.intersection(list1, list2);
            String resString = resList.toString();
            
            assertEquals(list1String, resString);
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
