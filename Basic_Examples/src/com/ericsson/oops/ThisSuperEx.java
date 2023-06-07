package com.ericsson.oops;

class ParentEx {
	int result = 200;

	public ParentEx() {
		this(234);
		System.out.println("am from parent class default constructor");
	}

	public ParentEx(int marks) {
		System.out.println("am from parent class param constructor" + marks);
	}

	public void displayData() {
		System.out.println("am from parent  method");
	}

}

public class ThisSuperEx extends ParentEx {
	int result = 35000;

	public ThisSuperEx() {
		super();
		System.out.println("Am from default constructor");
		System.out.println(this.result);
		System.out.println(super.result);
		this.displayData();
		super.displayData();
	}

	public ThisSuperEx(String orgName) {
		System.out.println("am from child class param constructor : " + orgName);
	}

	@Override
	public void displayData() {
		System.out.println("am from child class method");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx();

	}

}
