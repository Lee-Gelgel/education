package com.multi.day06;

public class Rectangle extends Shape {
	String a = "Rectangle";
	int width, height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	void draw() {
		System.out.println("===사각형을 그립니다===");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	
	
}
