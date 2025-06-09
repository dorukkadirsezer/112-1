package cis112_week11.lab;

public class HeapMinString extends HeapCommonString {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG_M = true;

	public HeapMinString(int capacity) {
		super(capacity);
	}

	public void enqueue(String element) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (size == capacity) {
			expandCapacity();
		}
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Restore the heap property by moving the element at index up
	 * 
	 * @param index
	 */
	private void heapifyUp(int index) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	// Remove and return the smallest element (highest priority)
	public String dequeue() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (size == 0) {
			throw new IllegalStateException("Priority queue is empty");
		}
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return "-314"; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	// Restore the array property by moving the element at index down
	private void heapifyDown(int index) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
