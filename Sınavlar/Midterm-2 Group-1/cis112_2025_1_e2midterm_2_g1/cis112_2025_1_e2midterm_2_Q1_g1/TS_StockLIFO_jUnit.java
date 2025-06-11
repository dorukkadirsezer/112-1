package cis112_2025_1_e2midterm_2_Q1_g1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis000_common.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests
 * 
 * @author bingol
 */
class TS_StockLIFO_jUnit {

	@Test
	void ts_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockLIFO inventory = new StockLIFO();
		inventory.buy(4, 5);
		inventory.sell(3, 7);
		inventory.buy(7, 6);
		inventory.sell(7, 8);

		int expected = 20;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void ts_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockLIFO inventory = new StockLIFO();
		inventory.buy(4, 5);
		inventory.buy(10, 6);
		inventory.sell(3, 8);
		inventory.sell(3, 7);

		int expected = 9;
		int actual = inventory.capitalGain();
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void ts_03() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockLIFO inventory = new StockLIFO();
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
	void ts_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StockLIFO inventory = new StockLIFO();
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
