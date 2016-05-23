package com.multi.day05;

public class Car {
	private int speed;

	// Getter
	public int getSpeed() {
		return speed;
	}

	// Method
	void keyTurnOn() {
		System.out.println("Key Turn");
	}

	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.err.println("Speed : "+speed+" km/h");
		}
	}
}
