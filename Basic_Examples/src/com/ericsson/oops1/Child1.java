package com.ericsson.oops1;

interface Car {
	public void selfDrive();
}
class HuyndaiCar implements Car {
	@Override
	public void selfDrive() {
		System.out.println("self drive with ADAS option");
	}

}

class TeslaCar implements Car {
	@Override
	public void selfDrive() {
		System.out.println("AutoDriver...");
	}

}

public class Child1 {

	public static void main(String[] args) {
		Car car=new TeslaCar();
		car.selfDrive();
	}

}
