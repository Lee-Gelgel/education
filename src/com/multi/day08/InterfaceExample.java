package com.multi.day08;

public class InterfaceExample {
	public static void main(String[] args) {
		RemoteControl a = new SmartTelevison();
		((SmartTelevison)a).show();
		a.turnOn(); // 추상구현
		a.turnOff(); // 추상구현
		a.print(); // default
		RemoteControl.print2(); //static
		RemoteControl.changeBattery(); // static
		
		// Phone b = new Phone();
		// b.turnOn();
		// b.turnOff();
		// b.print();
		// RemoteControl.print2();
		// RemoteControl.changeBattery();

	}
}
