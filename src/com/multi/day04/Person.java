package com.multi.day04;

public class Person {
	//1.멤버변수
	//static : calss변수이다는 의미, object공유변수
	private static int numberOfPersons; 
	private int age;
	private String name;
	
	//2.생성자
	public Person(int age, String name) {
		numberOfPersons ++;
		System.out.println("인구가 추가되었습니다.");
		this.age = age;
		this.name = name;
	}

	public Person() {
		this(12, "Anonymous");
	}
	
	//3.메서드
	void selfIntroduce(){
		System.out.println("내 이름은 "+name+"이며, 나이는 "+age+"살입니다.");
	}
	
	public static int getPopulation(){
		//static함수에서는 static변수만 사용가능
		return numberOfPersons;
	}
	

}
