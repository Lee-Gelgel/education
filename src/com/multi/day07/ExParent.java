package com.multi.day07;

public class ExParent {
	public String nation;

	public ExParent() {
		this("���ѹα�");
		System.out.println("parent() call");
	}

	public ExParent(String nation) {
		this.nation = nation;
		System.out.println("parent(String nation) call");
	}
	
	
}
