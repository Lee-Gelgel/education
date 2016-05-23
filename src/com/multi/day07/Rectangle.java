package com.multi.day07;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	Rectangle(String color, double width, double lenght) {
		super(color, "Rectangle");
		this.length = lenght;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		double result = length * width;
		return result;
	}

	@Override
	public double calculatePerimeter() {
		double result = 2 * (length + width);
		return result;
	}
}
