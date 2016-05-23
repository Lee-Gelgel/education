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
// System.out.println("�������Լ��̴�.");
// }
// }

class ParamInterImpl implements ParamInterface{
	@Override
	public void print() {
		System.out.println("interface�� �����Ѵ�.");
	}
	
}

public class AnonymousTest {
	public static void main(String[] args) {
		
		use(new ParamClass() {
			@Override
			public void print() {
				System.out.println("�����ǵ��Լ���.");
			}
		});
		
		use(new ParamInterface() {
			
			@Override
			public void print() {
				System.out.println("interface�� �����Ѵ�.");
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
