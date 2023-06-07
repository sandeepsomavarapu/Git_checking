package com.ericsson.oops;

public class ConstructorTest {
	public void m1() {
		System.out.println("am from m1 method...");
	}

	public ConstructorTest() {
		System.out.println("default constructor");
	}
	public ConstructorTest(String name) {
		System.out.println("parameterized constructor : "+name);
	}
	public static void main(String[] args) {
		// classname objname=new classname();
		// classname objname=new constructor();
		ConstructorTest obj = new ConstructorTest("ericsson");// jvm default constructor
		ConstructorTest obj1 = new ConstructorTest();// jvm default constructor

		obj.m1();
	}

}
