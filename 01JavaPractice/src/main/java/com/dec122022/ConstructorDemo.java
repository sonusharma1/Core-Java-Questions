package com.dec122022;

public class ConstructorDemo {

	// default Constructor
	public ConstructorDemo() {
		System.out.println("default Constructor");
	}

	// parameterized Constructor
	public ConstructorDemo(String name) {
		System.out.println("Your Name is : " + name);
	}

	// find area of square using constructor
	public ConstructorDemo(double side) {
		System.out.println("Area of square = " + side * side);
	}

	// find area of ractangle using constructor
	public ConstructorDemo(double len, double bred) {
		System.out.println(len * bred);
	}

	public void demo() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("Sujal");
		ConstructorDemo obj2 = new ConstructorDemo("Pal");

		ConstructorDemo obj3 = new ConstructorDemo(4.5);

		ConstructorDemo areaCons = new ConstructorDemo(9, 4);

//		obj.demo();
	}
}
