package com.multi.day10;

public class Car {
	String model;
	int price;
	
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
}
