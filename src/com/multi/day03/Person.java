package com.multi.day03;

public class Person {
	// 1. 멤버변수(특징..기능)
	String name;
	int age;
	String major;

	// 2. 생성자...초기화작업에 사용된다
	// default생성자가 제공된다
	// 생성자를 추가하면 default생성자가 제거된다.
	// 생성자는 class이름과 같아야한다.
	// 생성자의 overloading->이름은 같고 매개변수가 다르다.
	Person() {
		// System.out.println("기본생성자이다");
		this("아무개", 12, "없음");
	}

	Person(String name, int age, String major) {
		super();
		System.out.println("매개변수 3개짜리 생성자");
		// 매개변수와 멤버변수의 이름이 같아서 충돌발생 // name = name 사용불가
		// 현재객체를 의미 => this.속성
		// 생성자가 다른 생성자를 호출 => this()
		this.name = name;
		this.age = age;
		this.major = major;
	}

	Person(String name) {
		this(name, 20, "음악");
	}

	Person(String name, int age) {
		this(name, age, "음악");
	}
	// 3. 함수(기능..행위기술)
	public void print(){
		System.out.println("이름은 "+name+", 나이는 "+age+", 전공은 "+major);
		System.out.println("******************************");
	}
	// 4. InnerClass
	// 5. static Block

}
