package com.multi.day06;

public class Parent {
	private String name; // 아무리 자식이여도 private 되어있는 변수는 접근불가
	protected int age;
	public Parent(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	// public Parent() {
	//
	// }
}

/*
public
protected
private
생략

static
final
abstract
synchronized

 */
