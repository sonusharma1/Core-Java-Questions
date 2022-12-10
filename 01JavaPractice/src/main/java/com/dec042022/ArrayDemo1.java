package com.dec042022;

/**
 * Hello world!
 *
 */
public class ArrayDemo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		System.out.println(c);

		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(arr[2]);

		String s1 = "Mango";
		String s2 = "Apple";
		String s3 = "Papaya";
		String s4 = "Orange";

		String[] fruitsArray = { "Mango", "grapes", "papaya", "orange" };

		System.out.println(fruitsArray[3]);

		System.out.println(fruitsArray[2]);
		fruitsArray[2] = "Banana"; // to change value of position // update value
		System.out.println(fruitsArray[2]);

		// to print all array elements

//		int fruitArraySize = fruitsArray.length;
//		System.out.println(fruitArraySize);

		for (int i = 0; i < fruitsArray.length; i++) { // 0,1,2,3,4
			System.out.print(fruitsArray[i] + "  ");
		}

	}
}
