package com.multi.day03;

public class CarSales {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		Car car2 = new Car("��Ƽ��");
		car2.move();
		Car car3 = new Car("����","BLACK");
		car3.move();
		Car car4 = new Car("�׷���", "RED", 2015);
		car4.move();
	}
}
