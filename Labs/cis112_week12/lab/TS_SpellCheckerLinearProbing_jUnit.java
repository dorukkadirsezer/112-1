package cis112_week12.lab;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis000_common.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_SpellCheckerLinearProbing_jUnit {

	SpellCheckerLinearProbing sp;

	@BeforeEach
	void prep() {
		try {
			sp = new SpellCheckerLinearProbing(15);
			sp.loadDictionary(Constants.FILE_10);
			
//			sp = new SpellCheckerLinearProbing(15_000);
//			sp.loadDictionary(Constants.FILE_10k);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void s_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		boolean expected = true;
		boolean actual = sp.isCorrect("aaa");
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_02() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		boolean expected = true;
		boolean actual = sp.isCorrect("AAA");
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_03() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		boolean expected = true;
		boolean actual = sp.isCorrect("that");
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	void s_04() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		boolean expected = false;
		boolean actual = sp.isCorrect("this");
		zzPrintExpectedActual(expected, actual);
		assertEquals(expected, actual);
	}

	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ utility
	 */

	private void zzPrintExpectedActual(boolean expected, boolean actual) {
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
