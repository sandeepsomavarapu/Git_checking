package pack2;

public class Client {
	public void m1() {
		System.out.println("am from m1 method of client class");
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.m1();// Same Class
	}
}

class Child extends Client {
	public void m2() {
		m1();//same package sub class
	}
}

class Hello {
	public void m3() {
		Client client = new Client();
		client.m1();//same package non-subclass
	}
}