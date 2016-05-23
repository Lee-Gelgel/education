package com.multi.day08;

abstract class ParamClass {
	public abstract void print();
}

interface ParamInterface{
	void print();
}

// class ParamChildClass extends ParamClass{
// @Override
// public void print() {
// System.out.println("재정의함수이다.");
// }
// }

class ParamInterImpl implements ParamInterface{
	@Override
	public void print() {
		System.out.println("interface를 구현한다.");
	}
	
}

public class AnonymousTest {
	public static void main(String[] args) {
		
		use(new ParamClass() {
			@Override
			public void print() {
				System.out.println("재정의된함수다.");
			}
		});
		
		use(new ParamInterface() {
			
			@Override
			public void print() {
				System.out.println("interface를 구현한다.");
			}
		});
	}

	public static void use(ParamClass paramClass) {
		paramClass.print();
	}
	
	public static void use(ParamInterface paramInterface) {
		paramInterface.print();
	}

}
