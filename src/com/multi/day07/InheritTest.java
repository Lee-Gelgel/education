package com.multi.day07;

//자동형변환(기본형) 큰방 = 작은값
//자동형변환 : 상위 = 하위
//강제형변환(기본형) 작은방 = (작은방타입) 큰값
//강제형변환....본래 생성된 instance로의 변환만 가능 : 하위 = (하위) 상위

class A {
	int score = 100;

	public void print() {
		System.out.println("A의 함수입니다." + score);
	}
}

class B extends A {

}

class C extends A {

}

class BB extends B {
	int score = 200;
	int cnt = 2;

	public void print() {
		System.out.println("BB의 재정의 함수입니다." + score);
	}

	public void draw() {
		System.out.println("BB의 새로만든 함수입니다." + score);
	}
}

class CC extends C {

}

public class InheritTest {
	public static void main(String[] args) {
		BB test = new BB();
		B test2 = new BB();
		A test3 = new BB();

		// System.out.println(test3.score);
		// test3.print();
		
		
		//컴파일에서는 에러 안나는데 실행에서 에러
		// A test4 = new A();
		// BB test5 = (BB) test4;
		// 본래 인스턴스로만 케스트 가능
		
		
		//강제형변환
		if(test2 instanceof BB){
			((BB) test2).draw();
		}
		
		if(test3 instanceof BB){
			((BB) test3).draw();
		}

		// System.out.println(test2.score);
		// test2.print();

		// System.out.println(test.score);
		// test.print();

		// System.out.println(test instanceof BB); // test는 BB의 instance인가요?
		// System.out.println(test2 instanceof B); // test2는 B의 instance인가요?
		// System.out.println(test3 instanceof A); // test3는 A의 instance인가요?
		//
		// System.out.println(test3 instanceof BB); // test3는 BB의 instance인가요?
		// System.out.println(test3 instanceof B); // test3는 B의 instance인가요?
		// System.out.println(test3 instanceof A); // test3는 A의 instance인가요?
		// System.out.println(test3 instanceof Object); // test3는 Object의
		// // instance인가요?
		//
		// System.out.println(test3 instanceof CC); // test3는 CC의 instance인가요?
		// System.out.println(test3 instanceof C); // test3는 C의 instance인가요?

	}

}
