package com.multi.day03;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	Member(String name, String id){
		this(name, id, null, 0);
	}
}
