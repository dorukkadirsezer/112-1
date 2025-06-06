package cis112_2025_1_e2midterm_2_Q2_g1;

public class ValidatorIntegerLiteral_Test {

	public static void main(String[] args) {

		String s;

//		// decimal
//		s = "0";
//		s="7";
//		s="_76";
//		s="76_";
//		s="7_6";
//		s="9A";
//
//		// hex
//		s="0x0";
//		s="0xF";
//		s="0x7";
//		s="0x_7";
//		s="0x76_";
//		s = "0x_FF";
//		s="0X9abBDcdef"; // <<<
//
//		// octal
//		s="0";
//		s="07";
//		s="0_7";
//		s="076_";
//		s="09"; //q<<<
//		
//		// binary
		s = "0b101";
//		s = "0b101_";
//		s = "0b1_01L";
//		s = "0b12";

//		System.out.println("s=" + s + " " + ValidatorIntegerLiteral.isValid(s));
//		System.out.println("s=" + s + " " + ValidatorIntegerLiteral.isBinaryInteger(s));
//
//		s="0b1011";
//		System.out.println("s=" + s + " " + ValidatorIntegerLiteral.isBinaryInteger(s));
		
		s="0xFF";
		System.out.println("s=" + s + " " + ValidatorIntegerLiteral.isHexInteger(s));
	}

}
