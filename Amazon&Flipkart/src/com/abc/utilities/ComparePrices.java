package com.abc.utilities;

public class ComparePrices {
	public static String price1;
	public static String price2;

	public ComparePrices(String p1, String p2) {
		this.price1 = p1;
		this.price2 = p2;

	}

	public void check() {
		int a1 = Integer.parseInt(price1);
		int a2 = Integer.parseInt(price2);
		if (a1 < a2) {

			System.out.println("Amazon price is less");
		} else {
			System.out.println("Flipkart price is less");
		}

	}

}
