package cis112_2025_1_e2midterm_2_Q2_g2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis000_common.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_ValidatorFloatLiteral_jUnit {

	private static final boolean DEBUG = true;

	/*
	 * ==================================================== TH V
	 */

	@Test
	void h_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = ".1";
		String s1 = ".";
		String s2 = "";

		int expected = 0b001;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void h_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = ".314";
		String s1 = "-123";
		String s2 = "12 3.4";

		int expected = 0b001;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void h_03() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "_";
		String s1 = "1.2.3";
		String s2 = "10.2e-8";

		int expected = 0b100;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void h_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "3.141";
		String s1 = "3.141_";
		String s2 = "3._141 ";

		int expected = 0b011;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void h_05() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "1e5.";
		String s1 = "1e5e6";
		String s2 = "12.3_";

		int expected = 0b100;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	/*
	 * ==================================================== T A
	 */

	/*
	 * ================================================== shared V
	 */

	@Test
	void s_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "3.14";
		String s1 = "0.123";
		String s2 = "123x";

		int expected = 0b011;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "e5";
		String s1 = "1.0f";
		String s2 = "43";

		int expected = 0b110;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_03() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "1._23";
		String s1 = "-46";
		String s2 = ".4_6";

		int expected = 0b100;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "0.0";
		String s1 = "1.2.3";
		String s2 = "0123.";

		int expected = 0b101;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_05() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String s0 = "abc";
		String s1 = "1_234";
		String s2 = "+1.2";

		int expected = 0b010;
		int actual = zzMake3bits(s2, s1, s0);
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	/*
	 * ==================================================== utilities
	 */

	private final ValidatorFloatLiteral validator = new ValidatorFloatLiteral();

	private int zzMake3bits(String s2, String s1, String s0) {
		int a = 0;
		if (validator.isValidFloatLiteral(s0)) {
			a += 0b1;
		}
		if (validator.isValidFloatLiteral(s1)) {
			a += 0b10;
		}
		if (validator.isValidFloatLiteral(s2)) {
			a += 0b100;
		}
		return a;
	}

	private void zzPrintExpectedActual(int expected, int actual) {
		if (DEBUG) {
			System.out.println("~~~expected:" + expected);
			System.out.println("~~~actual  :" + actual);
		}
	}

	@Test
	void zzJUnitWorking() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName()
				+ " @" + this.getClass().getCanonicalName());

		StudentInfo.studentTag();
		System.out.println("\nYou got one additional point since jUnit is working.");
	}

}
