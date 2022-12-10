package com.dec052022;

public class SumOfEvenOdd {

	public static void main(String[] args) {

		int[] arr = { 8, 4, 2, 3, 5, 6, 7, 9 };

		int sumOfEven = 0;
		int sumOfOdd = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) { // formula to check no is even
				sumOfEven = sumOfEven + arr[i];
			} else {
				sumOfOdd = sumOfOdd + arr[i];
			}
		}

		System.out.println("Sum Of Even No : " + sumOfEven);
		System.out.println("Sum Of Odd No : " + sumOfOdd);
	}

}
