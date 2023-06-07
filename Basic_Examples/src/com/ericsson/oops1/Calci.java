package com.ericsson.oops1;

import java.util.Date;

interface Calculator {
	public abstract void div(int a, int b);

	void printDate();// public abstract void printDate();
}

abstract class MobileCalci implements Calculator {
	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}

	public abstract void mod(int a, int b);

}

public class Calci extends MobileCalci {
	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public static void main(String[] args) {
		Calci cal = new Calci();
		cal.add(12, 13);
		cal.sub(45, 78);
		cal.printDate();
		cal.div(23, 2);
		cal.mod(12, 2);
		cal.mul(12, 2);
		cal.mul(992, 22);
	}

	@Override
	public void div(int a, int b) {
		mul(992, 22);
		System.out.println("div of two numbers  : " + (a / b));
	}

	@Override
	public void printDate() {
		Date date = new Date();// ctrl+shift+o
		System.out.println("Today's Date : " + date);
	}

	@Override
	public void mod(int a, int b) {
		System.out.println(a % b);
	}
}