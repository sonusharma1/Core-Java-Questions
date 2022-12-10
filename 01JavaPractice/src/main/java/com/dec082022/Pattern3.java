package com.dec082022;

public class Pattern3 {

	public static void main(String[] args) {

		int n = 5;

		// row
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

}
