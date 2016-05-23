package com.multi.day08;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList<Shape>();
		Rectangle rectangle = new Rectangle(5, 6);
		RectTriangle rectTriange = new RectTriangle(6, 2);
		shape.add(rectangle);
		shape.add(rectTriange);
		for (int i = 0; i < shape.size(); i++) {
			System.out.println("area: " + shape.get(i).getArea());
			System.out.println("perimeter: " + shape.get(i).getPerimter());
			if (shape.get(i) instanceof Resizable) {
				System.out.println("-------------------------");
				((Resizable) shape.get(i)).resize(0.5);
				System.out.println("new area: " + shape.get(i).getArea());
				System.out.println("new perimeter: " + shape.get(i).getPerimter());
				System.out.println("-------------------------");
			}
		}

	}
}
