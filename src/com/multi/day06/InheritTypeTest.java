package com.multi.day06;
class A{
	int a = 10;
	void printA(){
		System.out.println("A class");
	}
}
class B extends A{
	int b = 20;
	void printB(){
		System.out.println("B class");
	}
}
class C extends A{
	int c = 30;
	void printC(){
		System.out.println("C class");
	}
}
class BB extends B{
	String a = "java";
	int bb = 40;
	void printA(){
		System.out.println("BB에서 override한 A method");
	}
	void printBB(){
		System.out.println("BB class");
	}
}
class CC extends C{
	int cc = 50;
	void printCC(){
		System.out.println("CC class");
	}
}

public class InheritTypeTest {
	public static void main(String[] args) {
		//자동형변환
		//상위 = 하위
		A obj3 = new BB();
		B obj2 = new BB();
		BB obj1 = new BB();
		
		//변수의 타입에 해당하는 멤버만 보인다
		//변수는 타입에서 해당하는 함수만 보인다
		//함수는 실행시 하위에서 Override한 경우 그것이 실행
		//**함수는 instancde를 따른다
		//**변수는 class를 따른다
		obj2.printA();
		obj3.printA();
	}
}
