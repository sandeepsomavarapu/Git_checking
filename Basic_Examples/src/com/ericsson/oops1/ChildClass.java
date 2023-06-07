package com.ericsson.oops1;

import java.util.Date;
//final -->before variable,method,class
class ParentClass {
	 int age = 32;

	public  void printDate() {
		System.out.println("Today's Date :" + new Date());
	}

	public  void printAge() {
		++age;
		System.out.println("Age :" + age);
	}

}

public class ChildClass extends ParentClass {
	public void m1() {
		System.out.println("Am from m1 method of child class");
	}

	@Override
	public void printAge() {
		--age;
		System.out.println("Age :" + age);
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.printDate();
		obj.m1();
		obj.printAge();
	}

}
