package com.multi.day21;

public class Prob4 {
	public static void main(String[] args) {		   
		Circle c = new Circle(1,2,3);
		c.print();
		c.calculateArea();
	}
}

class Shape {
	private int x;
	private int y;
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class Circle extends Shape{
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void calculateArea(){
		System.out.println("원의 면적="+radius*radius*Math.PI);
	}
	public void print() {
		System.out.println("x="+getX()+",y="+getY()+",radius="+radius);
	}
}