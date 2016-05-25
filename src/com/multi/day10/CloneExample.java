package com.multi.day10;

public class CloneExample {

	public static void main(String[] args) {
		int[] score = {100,100,100};
		Car car = new Car("����",8000);
		Member m = new Member("blue", score, car);
		Member m2 = m; // �ּҺ���
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
		m2.id = "red"; // �����ϸ� ������ ������ �޴´�
		System.out.println("����:" + m);
		System.out.println("�ּҺ���:" + m2);

		Member m3 = m.getMember(); // ����
		System.out.println(m3);
		m3.scores[2]=20;
		m3.id = "blue"; // �����ص� ������ ������ ���� �ʴ´�.
		m3.car.price=9500;
		System.out.println("����:" + m);
		System.out.println("����:" + m3);

	}
}
