package com.multi.day08;

public abstract class Shape {
	// 필드
	private int numSides;
	// 생성자

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	// 함수
	public int getNumSides() {
		return numSides;
	}

	abstract double getArea();

	abstract double getPerimter();
}
