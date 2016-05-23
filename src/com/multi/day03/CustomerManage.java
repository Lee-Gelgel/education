package com.multi.day03;

public class CustomerManage {
	public static void main(String[] args) {
		// Person class를 이용한 Object를 생성
		// 1.객체참조변수선언
		int a;
		String s;
		Person p1;
		// 2.객체생성
		p1 = new Person(); // 자동초기화
		// 3.객체사용
		p1.name = "gelgel";
		p1.age = 27;
		p1.major = "computer";
		p1.print();
		
		//객체변수선언+생성
		Person p2 = new Person();
		p2.name = "lulu";
		p2.age = 29;
		p2.major = "lover";
		p2.print();
		
		Person p3 = new Person("겔겔",27,"경영");
		p3.print();
		
		Person p4 = new Person("루루");
		p4.print();
		
		Person p5 = new Person("겔겔2", 27);
		p5.print();
	}
}
