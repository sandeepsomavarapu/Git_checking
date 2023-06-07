package pack1;

import pack2.Client;

public class Test extends Client {
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();// different package sub class
	}
}

class Hi {
	public void print() {
		Client client = new Client();
		client.m1();//different package non sub class

	}
}
