package com.multi.day13;

public class Car implements Comparable<Car>{
	

	String model;
	int price;

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		Car car = (Car) obj;

		return model.equals(car.model) && price == car.price;
	}

	@Override
	public int hashCode() {

		return model.hashCode();
	}
	
	@Override
	public int compareTo(Car car) {
		if(price < car.price) return -1;
		if(price > car.price) return 1;
		return 0;
	}

}
