package com.ericsson.oops;

class MobileCaluculator {
	public void mod(int a, int b) {
		System.out.println("mod of two numbers : " + (a % b));
	}
}

class PcCalculator extends MobileCaluculator {
	int marks = 234;

	public void div(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));
	}

	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}
}

public class Calculator extends MobileCaluculator {// ctrl+shift+f
	int salary = 23453;

	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.salary);
		//System.out.println(obj.marks);
		obj.add(12, 13);
		obj.sub(23, 13);
	//	obj.div(23, 12);
		obj.mod(12,2);
	}
}
