package com.dec052022;

public class PrintDuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 4, 3, 6, 7 };

		for (int i = 0; i < arr.length; i++) {

			int temp = arr[i]; // i=0 -> 4

			for (int j = i + 1; j < arr.length; j++) {

				if (temp == arr[j]) { // aar[1], arr[2], arr[3], arr[4], arr[5]

					System.out.println(arr[j]);
				}
			}

		}
	}

}
