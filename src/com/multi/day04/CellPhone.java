package com.multi.day04;

public class CellPhone {
	// 1.멤버변수
	String model;
	int price;
	int pixel;
	String company;
	boolean fingerPrint;

	// 2.생성자
	public CellPhone(String model, int price, int pixel, String company, boolean fingerPrint) {
		this.model = model;
		this.price = price;
		this.pixel = pixel;
		this.company = company;
		this.fingerPrint = fingerPrint;
	}

	// 3.메서드
	public void print() {
		System.out.println(model + ", " + price + ", "+pixel+", "+company+", "+fingerPrint);
	}

}
