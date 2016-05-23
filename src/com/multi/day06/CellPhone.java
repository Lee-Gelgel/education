package com.multi.day06;

public class CellPhone {
	// 변수
	String model;
	String color;

	// 생성자
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}

	// 함수
	void powerOn() {
		System.out.println("powerOn");
	}

	void powerOff() {
		System.out.println("powerOff");
	}

	void bell() {
		System.out.println("bell");
	}

	void sendVoices(String message) {
		System.out.println("I : " + message);
	}

	void receiveVoices(String message) {
		System.out.println("U : " + message);
	}

	void hangUp() {
		System.out.println("hangUp");
	}

}
