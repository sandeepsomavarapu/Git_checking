package com.fundamentals;

public class MethodsEx {
	static int a = 123;
	static int b = 234;

	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers  :" + (a + b));
	}

	public static int subOfTwo(int a, int b) {
		return a - b;
	}

	public static int mulOfTwo() {
		return a * b;
	}

	public void divOfTwo() {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		MethodsEx objref = new MethodsEx();//object creation
		objref.addOfTwo(12, 13);//instance method calling
		objref.divOfTwo();

		System.out.println("sub of two numbers  :" + MethodsEx.subOfTwo(23, 12));//static method calling 
		System.out.println("mul of two numbers  :" + MethodsEx.mulOfTwo());

	}

}
// ctrl+a & ctrl+shift+f
