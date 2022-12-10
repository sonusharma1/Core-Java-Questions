package com.dec042022;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int[] arr1 = {};
		System.out.println("Array size : " + arr1.length);

//		System.out.println(arr1[1]);

		int[] arr2 = new int[5];

		// to add element in array
		arr2[0] = 5;
		arr2[1] = 6;
		arr2[2] = 7;
		arr2[3] = 8;
		arr2[4] = 9;

		for (int i = 0; i < arr2.length; i++) {

			System.out.println(arr2[i]);
		}

		// to find element in array

		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] == 8) { // 0,1,2,3

				System.out.println(i);
				break;
			}
		}

	}
}
