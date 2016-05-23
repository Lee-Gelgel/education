package com.multi.day07;

public class ExChild extends ExParent{
	private String name;

	public ExChild() {
		this("ȫ�浿");
		System.out.println("child() call");
	}

	public ExChild(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}
	
	
}
