package com.dec082022;

public class Pattern4 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			// column
			for (int j = n - i + 1; j > 0; j--) {

				System.out.print(" ");
			}

			// col 2
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			// col 3
			for (int j = i - 1; j > 0; j--) {
				System.out.print(j);
			}

			System.out.println();
		}
	}
}
