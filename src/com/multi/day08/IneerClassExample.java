package com.multi.day08;

public class IneerClassExample {
	public static void main(String[] args) {

		// =====instance 멤버 class 이용=====
		// OuterClass outer = new OuterClass();
		// OuterClass.InnerClass a = outer.new InnerClass();
		// System.out.println(a.innerVar);
		// a.innerMethod();

		// =====static 멤버 class 이용=====
		OuterClass.StaticInnerClass b = new OuterClass.StaticInnerClass();
		//instance변수접근
		System.out.println(b.innerVar);
		//static변수접근
		System.out.println(OuterClass.StaticInnerClass.staticInnerVar);
		
		//instance함수접근
		b.innerMethod();
		//static함수접근
		OuterClass.StaticInnerClass.staticInnerMethod();
		
	}
}
