package com.multi.day08;

public abstract class Shape {
	// �ʵ�
	private int numSides;
	// ������

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	// �Լ�
	public int getNumSides() {
		return numSides;
	}

	abstract double getArea();

	abstract double getPerimter();
}
