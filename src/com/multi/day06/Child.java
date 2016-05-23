package com.multi.day06;

class Child extends Parent {
	String phoneNumber;

	Child(String name, String phoneNumber) {
		// 생성자의 1번째 줄에 super()가 생략됨
		// 1.상위class는 default생성자가 있어야한다
		// 2.명시적으로 상위class의 생성자호출
		super(name);
		this.phoneNumber = phoneNumber;
	}
}
