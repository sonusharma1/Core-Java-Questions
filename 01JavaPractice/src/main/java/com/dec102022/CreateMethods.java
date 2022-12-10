package com.dec102022;

public class CreateMethods {

	public void printCounting() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void printTable() {
		System.out.println("This method print tables");
	}

	public static void main(String[] args) {

		// calling method by creating class object
		CreateMethods obj = new CreateMethods();
		obj.printCounting();
		obj.printTable();

		CreateMethods obj2 = new CreateMethods();

//		new CreateMethods().printCounting();
//		new CreateMethods().printCounting();
//		new CreateMethods().printTable();

	}

}
