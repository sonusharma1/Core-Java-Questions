package com.dec082022;

public class Pattern2 {

	public static void main(String[] args) {

//		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter No Of Rows"));
		int n = 10;

		// row
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = n - i + 1; j > 0; j--) {

				System.out.print("*");
			}

			// column 2
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}

			// new row me le jane ke liye hai
			System.out.println();
		}
	}
}
