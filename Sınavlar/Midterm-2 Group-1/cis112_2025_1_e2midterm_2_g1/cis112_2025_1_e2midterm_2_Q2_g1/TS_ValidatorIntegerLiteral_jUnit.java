package cis112_2025_1_e2midterm_2_Q2_g1;

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
class TS_ValidatorIntegerLiteral_jUnit {
	private static final boolean DEBUG = true;

	@Test
	void s_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0";
		String s1 = "4_321L";
		String s2 = "0x110";

		int expected = 0b111;
		int actual = zzMake3digits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0x12l";
		String s1 = "34L";
		String s2 = "4_321l";

		int expected = 0b111;
		int actual = zzMake3digits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0c10100";
		String s1 = "0B110";
		String s2 = "0123b";

		int expected = 0b010;
		int actual = zzMake3digits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_05() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0x1aFg";
		String s1 = "0X123";
		String s2 = "0XADF";

		int expected = 0b110;
		int actual = zzMake3digits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_06() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0x1g";
		String s1 = "0X1f";
		String s2 = "4__6";

		int expected = 0b110;
		int actual = zzMake3digits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	/*
	 * ================================================== utilities
	 */

	private void zzPrintExpectedActual(int expected, int actual) {
		if (DEBUG) {
			System.out.println("~~~expected:" + expected);
			System.out.println("~~~actual  :" + actual);
		}
	}

	private int zzMake3digits(String s2, String s1, String s0) {
		int a = 0;
		if (ValidatorIntegerLiteral.isValid(s0)) {
			a += 0b1;
		}
		if (ValidatorIntegerLiteral.isValid(s1)) {
			a += 0b10;
		}
		if (ValidatorIntegerLiteral.isValid(s2)) {
			a += 0b100;
		}
		return a;
	}

	@Test
	void zzJUnitWorking() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
				+ " @" + this.getClass().getCanonicalName());

		StudentInfo.studentTag();
		System.out.println("\nYou got one additional point since jUnit is working.");
	}

}
