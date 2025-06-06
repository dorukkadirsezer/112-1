package cis112_2025_1_e2midterm_2_Q2_g2;

/**
 * A validator for float literals conforming to a specific EBNF grammar.
 * <p>
 * This class implements a recursive descent parser to validate float literals
 * according to the following grammar:
 * 
 * <pre>
 * float_literal       = decimal_float ;
 * decimal_float       = decimal_digits ["." [decimal_digits]] [exponent_part] [float_type_suffix]
 *                    | "." decimal_digits [exponent_part] [float_type_suffix]
 *                    | decimal_digits exponent_part [float_type_suffix] ;
 * exponent_part       = ("e" | "E") ["+" | "-"] decimal_digits ;
 * decimal_digits      = decimal_digit { decimal_digit | "_" } ;
 * decimal_digit       = "0".."9" ;
 * float_type_suffix   = "f" | "F" | "d" | "D" ;
 * </pre>
 * 
 * <p>
 * Examples of valid float literals:
 * <ul>
 * <li>{@code 3.14}</li>
 * <li>{@code 1_000.25e-10f}</li>
 * <li>{@code .5D}</li>
 * <li>{@code 1e5}</li>
 * </ul>
 */
public class ValidatorFloatLiteral {
	private String input;
	private int index;

	/**
	 * Validates whether the input string conforms to the float literal grammar.
	 *
	 * @param input the string to validate (may be null)
	 * @return {@code true} if the input is a valid float literal according to the
	 *         grammar, {@code false} otherwise (including null or empty input)
	 */
	public boolean isValidFloatLiteral(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		this.input = input;
		this.index = 0;

		try {
			return parseDecimalFloat() && index == input.length();
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	/**
	 * Parses a decimal float according to the grammar rules.
	 * 
	 * @return {@code true} if the remaining input matches one of the decimal float
	 *         productions, {@code false} otherwise
	 */
	private boolean parseDecimalFloat() {
		return parseDigitsWithOptionalFraction() || parseFractionWithRequiredDigits()
				|| parseDigitsWithRequiredExponent();
	}

	/**
	 * Parses the production: decimal_digits ["." [decimal_digits]] [exponent_part]
	 * [float_type_suffix]
	 */
	private boolean parseDigitsWithOptionalFraction() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
		return false;
	}

	/**
	 * Parses the production: "." decimal_digits [exponent_part] [float_type_suffix]
	 */
	private boolean parseFractionWithRequiredDigits() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
		return false;
	}

	/**
	 * Parses the production: decimal_digits exponent_part [float_type_suffix]
	 */
	private boolean parseDigitsWithRequiredExponent() {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		return false;
	}

	/**
	 * Parses the exponent part of a float literal.
	 * 
	 * @return {@code true} if the remaining input matches the exponent_part
	 *         production, {@code false} otherwise
	 */
	private boolean parseExponentPart() {
		int saved = index;
		if (tryConsume('e') || tryConsume('E')) {
			// Optional sign
			if (peek() == '+' || peek() == '-') {
				index++;
			}
			// Must have digits after exponent marker
			if (parseDecimalDigits()) {
				return true;
			}
		}
		index = saved;
		return false;
	}

	/**
	 * Parses a sequence of decimal digits with optional underscores.
	 * 
	 * @return {@code true} if the remaining input matches the decimal_digits
	 *         production, {@code false} otherwise
	 * @throws IllegalStateException if the digits contain consecutive underscores
	 *                               or end with an underscore
	 */
	private boolean parseDecimalDigits() {
		if (!parseDecimalDigit()) {
			return false;
		}

		boolean lastWasUnderscore = false;
		while (index < input.length()) {
			if (parseDecimalDigit()) {
				lastWasUnderscore = false;
			} else if (tryConsume('_')) {
				if (lastWasUnderscore) {
					return false; // No consecutive underscores
				}
				lastWasUnderscore = true;
			} else {
				break;
			}
		}
		return !lastWasUnderscore; // Cannot end with underscore
	}

	/**
	 * Parses a single decimal digit.
	 * 
	 * @return {@code true} if the next character is a decimal digit, {@code false}
	 *         otherwise
	 */
	private boolean parseDecimalDigit() {
		if (index >= input.length()) {
			return false;
		}
		char c = input.charAt(index);
		if (c >= '0' && c <= '9') {
			index++;
			return true;
		}
		return false;
	}

	/**
	 * Parses an optional float type suffix.
	 * 
	 * @return {@code true} if a valid suffix is consumed, {@code false} otherwise
	 */
	private boolean parseFloatTypeSuffix() {
		if (index >= input.length()) {
			return false;
		}
		char c = input.charAt(index);
		if (c == 'f' || c == 'F' || c == 'd' || c == 'D') {
			index++;
			return true;
		}
		return false;
	}

	/**
	 * Attempts to consume the specified character from the input.
	 * 
	 * @param expected the character to consume
	 * @return {@code true} if the character was consumed, {@code false} otherwise
	 */
	private boolean tryConsume(char expected) {
		if (index < input.length() && input.charAt(index) == expected) {
			index++;
			return true;
		}
		return false;
	}

	/**
	 * Peeks at the next character without consuming it.
	 * 
	 * @return the next character in the input
	 * @throws IndexOutOfBoundsException if there are no more characters
	 */
	private char peek() {
		if (index >= input.length()) {
			throw new IndexOutOfBoundsException("No more characters to peek");
		}
		return input.charAt(index);
	}
}
