package com.multi.day07;

public class Circle extends Shape {

	private double radius; // ������
	private double circumference; // 2��r
	// double PI = Math.PI;

	public Circle(String string, int radius) {
		super(string, "Circle");
		this.radius = radius;
		circumference = 2 * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		double result = radius * radius * Math.PI;
		return result;
	}

	@Override
	public double calculatePerimeter() {
		double result = circumference;
		return result;
	}
}
