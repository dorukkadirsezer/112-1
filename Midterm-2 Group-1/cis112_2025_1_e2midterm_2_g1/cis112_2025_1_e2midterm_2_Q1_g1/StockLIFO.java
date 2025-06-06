package cis112_2025_1_e2midterm_2_Q1_g1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Inventory working as LIFO
 * 
 * @author bingol
 */
class StockLIFO {

	private static final boolean DEBUG = true;

	class Purchase {
		int quantity;
		int price;

		Purchase(int amount, int price) {
			this.quantity = amount;
			this.price = price;
		}

		@Override
		public String toString() {
			return "[Purchase quantity=" + quantity + ", price=" + price + "]";
		}

		public String canonical() {
			return "[" + quantity + "@" + price + "]";
		}
	}

	private int totalGain;

	// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
	// TODO your code should be between below and above marks.
	// Your declarations, such as int max, are in here

	 int max;; // ~~fake~~

	// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

	public StockLIFO() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		totalGain = 0;
	}

	public void buy(int quantity, int price) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		if (DEBUG) {
			System.out.printf("buy  q=%5d, p=%5d, %30s%n", quantity, price, canonical());
		}
	}

	public void sell(int quantity, int price) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		if (DEBUG) {
			System.out.printf("sell q=%5d, p=%5d, %30s%n", quantity, price, canonical());
		}
	}

	public int capitalGain() {
		return totalGain;
	}

	public String canonical() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return "-"; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
