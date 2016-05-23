package com.multi.day04;

public class CarManage {
	public static void main(String[] args) {
		Car[] cars ={new Car("SM5", "White", 200)
					,new Car("그랜저", "Black", 200)
					,new Car("소나타", "Red", 200)
					,new Car("제네시스", "Green", 200)
					,new Car("에쿠스", "Blue", 200)};
//		Car[] cars = new Car[5];
//		cars[0] = new Car("SM5", "White", 200);
//		cars[1] = new Car("그랜저", "Black", 200);
//		cars[2] = new Car("소나타", "Red", 200);
//		cars[3] = new Car("제네시스", "Green", 200);
//		cars[4] = new Car("에쿠스", "Blue", 200);

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].color+"색깔의 자동차 "+cars[i].model);
		}
	}
}
