package com.ericsson.oops;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number For addition");
		int a = scan.nextInt();
		System.out.println("Enter Second number For addition");
		int b = scan.nextInt();
		int result = a + b;
		System.out.println("Enter Username");
		String name = scan.next();
		System.out.println("Enter Marks %");
		float percentage = scan.nextFloat();
		System.out.println("addition of two numbers : " + result);
		System.out.println("Username  :" + name);
		System.out.println("Marks Percentage" + percentage);
		scan.close();
	}

}
