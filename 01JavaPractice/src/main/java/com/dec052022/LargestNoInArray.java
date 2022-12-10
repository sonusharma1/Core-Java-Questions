package com.dec052022;

public class LargestNoInArray {

	public static void main(String[] args) {

		int[] arr = { 21, 35, 86, 45, 23, 65 };

		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println(largest);

		// to print smallest
		int smallNum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallNum) {
				smallNum = arr[i];
			}
		}

		System.out.println(smallNum);
	}
}
