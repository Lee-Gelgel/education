package com.multi.day04;

public class CellPhone {
	// 1.�������
	String model;
	int price;
	int pixel;
	String company;
	boolean fingerPrint;

	// 2.������
	public CellPhone(String model, int price, int pixel, String company, boolean fingerPrint) {
		this.model = model;
		this.price = price;
		this.pixel = pixel;
		this.company = company;
		this.fingerPrint = fingerPrint;
	}

	// 3.�޼���
	public void print() {
		System.out.println(model + ", " + price + ", "+pixel+", "+company+", "+fingerPrint);
	}

}
