package com.multi.day04;

public class CarManage {
	public static void main(String[] args) {
		Car[] cars ={new Car("SM5", "White", 200)
					,new Car("�׷���", "Black", 200)
					,new Car("�ҳ�Ÿ", "Red", 200)
					,new Car("���׽ý�", "Green", 200)
					,new Car("����", "Blue", 200)};
//		Car[] cars = new Car[5];
//		cars[0] = new Car("SM5", "White", 200);
//		cars[1] = new Car("�׷���", "Black", 200);
//		cars[2] = new Car("�ҳ�Ÿ", "Red", 200);
//		cars[3] = new Car("���׽ý�", "Green", 200);
//		cars[4] = new Car("����", "Blue", 200);

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].color+"������ �ڵ��� "+cars[i].model);
		}
	}
}
