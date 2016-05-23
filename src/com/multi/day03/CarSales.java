package com.multi.day03;

public class CarSales {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		Car car2 = new Car("마티즈");
		car2.move();
		Car car3 = new Car("에쿠스","BLACK");
		car3.move();
		Car car4 = new Car("그랜져", "RED", 2015);
		car4.move();
	}
}
