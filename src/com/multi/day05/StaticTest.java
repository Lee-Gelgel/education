package com.multi.day05;

public class StaticTest {
	// 1.�������->static(class����),non-static(object����)
	int objVar;
	static int staticVar;
	// 2.������

	// 3.�޼���->static(class�޼���),non-static(object�޼���)
	public void objMethod() {
		System.out.println("Object Method");
	}

	// 4.InnerClass
	class MyClass {

	}

	// 5. static block
	static {
		//class load�ÿ� ����Ǵ� ����
		System.out.println("static block�Դϴ�.");
	};

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		System.out.println("123");
		// static�������
		// 1.���ο��� ���
		System.out.println(staticVar);
		// 2.�ܺο��� ���
		System.out.println(StaticTest.staticVar);
		// static�Լ����
		// 1.���ο��� ���
		staticMethod();
		// 2.�ܺο��� ���
		StaticTest.staticMethod();

		// object����,�Լ����
		StaticTest staticTest = new StaticTest();
		System.out.println(staticTest.objVar);
		staticTest.objMethod();
	}
}
