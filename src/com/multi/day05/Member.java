package com.multi.day05;

public class Member {
	//1.멤버변수
	String name;
	String id;
	String password;
	int age;

	//2.생성자
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public Member(String name, String id) {
		this(name,id,null,0);
	}
	
	//메서드
	
	//실행
	public static void main(String[] args) {
		Member user1 = new Member("겔겔","gelgel");
		Member user2 = new Member("루루","lulu");
		System.out.println(user1.name);
		System.out.println(user2.name);
	}

}
