package com.ericsson.oops1;

public class MethodOverloadingEx {
	public void add(float a, float b) {
		System.out.println("add of two float's :" + (a + b));
	}
	public void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}
	public void add(int a, int b, int c) {
		System.out.println("add of three int's :" + (a + b + c));
	}
	public void add(int a, float b) {
		System.out.println("add of two int,float  :" + (a + b));
	}
	public void add(float a, int b) {
		System.out.println("add of two float,int  :" + (a + b));
	}
	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.add(12.2f, 23);
		obj.add(12.2f, 12.4f);
		obj.add(12, 23);
		obj.add(12, 23.f);
		obj.add(11, 12, 13);
		obj.add('a','b');//type promotion

	}

}
