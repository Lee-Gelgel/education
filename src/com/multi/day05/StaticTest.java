package com.multi.day05;

public class StaticTest {
	// 1.멤버변수->static(class변수),non-static(object변수)
	int objVar;
	static int staticVar;
	// 2.생성자

	// 3.메서드->static(class메서드),non-static(object메서드)
	public void objMethod() {
		System.out.println("Object Method");
	}

	// 4.InnerClass
	class MyClass {

	}

	// 5. static block
	static {
		//class load시에 수행되는 문장
		System.out.println("static block입니다.");
	};

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		System.out.println("123");
		// static변수사용
		// 1.내부에서 사용
		System.out.println(staticVar);
		// 2.외부에서 사용
		System.out.println(StaticTest.staticVar);
		// static함수사용
		// 1.내부에서 사용
		staticMethod();
		// 2.외부에서 사용
		StaticTest.staticMethod();

		// object변수,함수사용
		StaticTest staticTest = new StaticTest();
		System.out.println(staticTest.objVar);
		staticTest.objMethod();
	}
}
