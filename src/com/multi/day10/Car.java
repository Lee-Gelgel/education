package com.multi.day10;

public class Car {
	String model;
	int price;

	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public Car() {
		super();
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Car && model.equals(((Car) obj).model) && price == ((Car) obj).price;
	}
	
	public void print(){
		System.out.println("Car의 print함수입니다.");
	}
}
