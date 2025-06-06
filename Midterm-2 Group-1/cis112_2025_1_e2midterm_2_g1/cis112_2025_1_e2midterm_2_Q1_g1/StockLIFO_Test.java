package cis112_2025_1_e2midterm_2_Q1_g1;

public class StockLIFO_Test {

	public static void main(String[] args) {
		System.out.println("\n->StockLIFO_Test");

		StockLIFO inventory = new StockLIFO();

		inventory.buy(4, 5);
		inventory.buy(3, 6);
		inventory.sell(2, 7);
		inventory.sell(3, 8);
	}

}
