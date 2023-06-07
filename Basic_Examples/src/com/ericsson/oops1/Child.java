package com.ericsson.oops1;

interface Parent {
	public void m1();
}

interface Parent1 {
	public void m1();
}

public class Child implements Parent, Parent1 {

	public static void main(String[] args) {

		Child child = new Child();
		child.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from child method ");
	}

}
