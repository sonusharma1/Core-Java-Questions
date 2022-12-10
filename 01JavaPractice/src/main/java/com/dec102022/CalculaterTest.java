package com.dec102022;

import java.util.Scanner;

public class CalculaterTest {

	public static void main(String[] args) {

		Calculater calculater = new Calculater();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// calling add method from calculater class
		calculater.add(num1, num2);

		calculater.multiply(num1, num2);

		int sub = calculater.sub(num1, num2) + 10;
		System.out.println(sub);
	}

}
