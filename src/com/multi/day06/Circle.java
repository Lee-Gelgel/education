package com.multi.day06;

public class Circle extends Shape {
	int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("===원을 그린다===");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("radius=" + radius);
	}

}
