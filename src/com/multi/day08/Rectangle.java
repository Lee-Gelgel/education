package com.multi.day08;

public class Rectangle extends Shape implements Resizable{

	// 필드
	private double width;
	private double height;
	// 생성자
	
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	
	// 함수
	@Override
	double getArea() {
		double result = width * height;
		return result;
	}

	@Override
	double getPerimter() {
		double result = 2 * (width + height);
		return result;
	}


	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

}
