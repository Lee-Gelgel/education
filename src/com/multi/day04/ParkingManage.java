package com.multi.day04;

//.java(자바소스)에 class가 여러개 올수있다.
//public class는 하나만 존재한다.
//public이 없을수도있다.
//main이 있는 class로 .java이름을 준다.
public class ParkingManage {
	public static void main(String[] args) {
		// 1.객체참조변수선언
		Car car1;
		// 2.객체생성
		car1 = new Car();
		// 3.객체사용
		car1.model = "소나타";
		car1.color = "black";
		car1.maxSpeed = 200;
		car1.print();

		// java.lang패키지의 class import생략
		String str1 = new String("자바");
		String str2 = new String();
		char[] ch = { 'J', 'A', 'V', 'A' };
		String str3 = new String(ch);
		System.out.println(str3);
		byte[] by = { 65, 66, 67, 68, 69 };
		String str4 = new String(by);
		System.out.println(str4);

	}
}
