package com.multi.day10;

public class CloneExample {

	public static void main(String[] args) {
		int[] score = {100,100,100};
		Car car = new Car("에쿠스",8000);
		Member m = new Member("blue", score, car);
		Member m2 = m; // 주소복사
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
		m2.id = "red"; // 변경하면 원본이 영향을 받는다
		System.out.println("원본:" + m);
		System.out.println("주소복사:" + m2);

		Member m3 = m.getMember(); // 복제
		System.out.println(m3);
		m3.scores[2]=20;
		m3.id = "blue"; // 변경해도 원본은 영향을 받지 않는다.
		m3.car.price=9500;
		System.out.println("원본:" + m);
		System.out.println("복제:" + m3);

	}
}
