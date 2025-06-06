package cis112_2025_1_e2midterm_2_Q2_g1;

import java.util.HashSet;
import java.util.Set;

public class ValidatorIntegerLiteral {

	private static final Set<Character> DIGITS_DECIMAL = new HashSet<>();
	private static final Set<Character> DIGITS_HEX = new HashSet<>();
	private static final Set<Character> DIGITS_BINARY = new HashSet<>();

	static {
		final String digitDecimal = "0123456789";
		for (int i = 0; i < digitDecimal.length(); i++) {
			DIGITS_DECIMAL.add(digitDecimal.charAt(i));
		}

		final String digitHex = "0123456789abcdefABCDEF";
		for (int i = 0; i < digitHex.length(); i++) {
			DIGITS_HEX.add(digitHex.charAt(i));
		}

		final String digitBinary = "01";
		for (int i = 0; i < digitBinary.length(); i++) {
			DIGITS_BINARY.add(digitBinary.charAt(i));
		}
	}

	public static boolean isValid(String s) {
		return isIntegerLiteral(s);
	}

	public static boolean isIntegerLiteral(String s) {
		if (!(isDecimalInteger(s)//
				|| isHexInteger(s)//
				|| isBinaryInteger(s)//
		)) {
			return false;
		}
		return true;
	}

	static boolean isDecimalInteger(String s) {
		final int lenghtRequire = 1;
		if (s.length() < lenghtRequire) {
			return false;
		}
		if (!isDecimalDigit(s.charAt(0))) {
			return false;
		}

		// optional part
		char c;

		// integer type suffix
		int length1m = s.length() - 1;
		c = s.charAt(length1m);
		if (isIntegerTypeSuffix(c)) {
			s = s.substring(0, length1m);
		}

		// remaining digits without integer type suffix
		for (int i = lenghtRequire; i < s.length(); i++) {
			c = s.charAt(i);
			if (!(isDecimalDigit(c) || c == '_')) {
				return false;
			}
		}

		return true;
	}

	static boolean isHexInteger(String s) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return false; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	static boolean isBinaryInteger(String s) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return false; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	static boolean isIntegerTypeSuffix(char c) {
		if (c == 'l' || c == 'L') {
			return true;
		} else {
			return false;
		}
	}

	static boolean isDecimalDigit(char c) {
		return DIGITS_DECIMAL.contains(c);
	}

	static boolean isHexDigit(char c) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return false; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	static boolean isBinaryDigit(char c) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return false; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
