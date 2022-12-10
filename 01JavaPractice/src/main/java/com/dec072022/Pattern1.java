package com.dec072022;

import javax.swing.JOptionPane;

/*
  
  * * * * *
  * * * * *
  
 */

public class Pattern1 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no");
//		
//		int n = sc.nextInt();

		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter No Of Rows"));
//		String name = JOptionPane.showInputDialog("Enter Pattern Symbol");

		// row
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
