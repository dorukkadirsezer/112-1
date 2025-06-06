package cis112_2025_1_e2midterm_2_Q1_g2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis000_common.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests for MyQueue.
 * 
 * @author bingol
 */
class TS_StockFIFO_jUnit {


	@Test
	void s_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockFIFO inventory = new StockFIFO();
		inventory.buy(4, 5);
		inventory.sell(3, 7);
		inventory.buy(7, 6);
		inventory.sell(7, 8);

		int expected = 21;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockFIFO inventory = new StockFIFO();
		inventory.buy(4, 5);
		inventory.buy(10, 6);
		inventory.sell(3, 8);
		inventory.sell(3, 7);

		int expected = 13;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_03() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockFIFO inventory = new StockFIFO();
		inventory.buy(4, 5);
		inventory.buy(10, 6);
		inventory.sell(8, 8);
		inventory.sell(6, 7);

		int expected = 26;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockFIFO inventory = new StockFIFO();
		inventory.buy(1, 5);
		inventory.buy(1, 6);
		inventory.buy(1, 4);
		inventory.buy(1, 3);
		inventory.sell(4, 4);

		int expected = -2;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ utility
	 */

	private void zzPrintExpectedActual(int expected, int actual) {
		System.out.println("~~~expected:" + expected);
		System.out.println("~~~actual  :" + actual);
	}

	@Test
	void zzJUnitWorking() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
				+ " @" + this.getClass().getCanonicalName());

		StudentInfo.studentTag();
		System.out.println("\nYou got one additional point since jUnit is working.");
	}

}
