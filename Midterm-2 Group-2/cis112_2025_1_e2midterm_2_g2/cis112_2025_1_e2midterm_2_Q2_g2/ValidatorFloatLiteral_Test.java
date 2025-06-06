package cis112_2025_1_e2midterm_2_Q2_g2;

public class ValidatorFloatLiteral_Test {

	public static void main(String[] args) {

		String example = "1e5e6";

		ValidatorFloatLiteral validator = new ValidatorFloatLiteral();
		boolean result = validator.isValidFloatLiteral(example);
		System.out.printf("%-20s: %b%n", example, result);
	}

}
