package com.multi.day04;

public class CarTest {
	static void changeCar(Car cc) {
		cc.color = "Black";
	}

	public static void main(String[] args) {
		Car c1 = new Car("Grandeur", "Gray", 100);
		c1.print();

		changeCar(c1);
		c1.print();

		System.out.println("***********************************");
		Car c2 = new Car();
		c2.print();

		System.out.println("***********************************");
		Car c3 = new Car("BMW520");
		c3.print();
		System.out.println("***********************************");

		Car c4 = new Car("BMW520", "Blue");
		c4.print();
		System.out.println("***********************************");

	}
}
