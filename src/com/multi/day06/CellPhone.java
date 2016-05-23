package com.multi.day06;

public class CellPhone {
	// ����
	String model;
	String color;

	// ������
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}

	// �Լ�
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
