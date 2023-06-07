package com.fundamentals;

public class VariablesEx {
	// global variable
	long contact = 9494949494l;// 8 bytes -->heap -->create the object
	boolean data = false;
	char gender = 'M'; //instance 
	static int countryCode = 91;//static variable

	public static void main(String[] args) // jvm
	{
		// local variables
		byte marks = 127;
		float salary = 23.4378553543939f;
		double result = 23.4378553543939;
		System.out.println(salary + " " + result + " " + marks);

		System.out.println(VariablesEx.countryCode);
		// classname obj=new classname();

		VariablesEx obj = new VariablesEx();// memory creation,instantiation

		System.out.println(obj.contact);
		System.out.println(obj.gender);
		System.out.println(obj.data);

	}

}
