package com.multi.day08;

public class RectTriangle extends Shape{

	private double width;
	private double height;


	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		double result = width*height*0.5; 
		return result;
	}

	@Override
	double getPerimter() {
		double result = width+height+Math.sqrt(width*width+height*height);
		return result;
	}
	
	
}
