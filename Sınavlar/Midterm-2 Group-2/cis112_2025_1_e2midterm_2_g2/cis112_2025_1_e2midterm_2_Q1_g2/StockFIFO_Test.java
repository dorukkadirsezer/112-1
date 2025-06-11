package cis112_2025_1_e2midterm_2_Q1_g2;

public class StockFIFO_Test {

	public static void main(String[] args) {
		System.out.println("StockFIFO_Test");

		StockFIFO inventory = new StockFIFO();

		inventory.buy(4, 5);
		inventory.buy(3, 6);
		inventory.sell(2, 7);
		inventory.sell(3, 8);
	}

}
