package com.dec072022;

import java.util.Scanner;

/*
 
 	*
 	**
 	***
 	****
 	***** 

 */

public class TrianglePattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no");
		int n = sc.nextInt();

		// row
		for (int i = 1; i <= n; i++) {

			// col
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
