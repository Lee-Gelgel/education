package com.multi.day08;

public class IneerClassExample {
	public static void main(String[] args) {

		// =====instance ��� class �̿�=====
		// OuterClass outer = new OuterClass();
		// OuterClass.InnerClass a = outer.new InnerClass();
		// System.out.println(a.innerVar);
		// a.innerMethod();

		// =====static ��� class �̿�=====
		OuterClass.StaticInnerClass b = new OuterClass.StaticInnerClass();
		//instance��������
		System.out.println(b.innerVar);
		//static��������
		System.out.println(OuterClass.StaticInnerClass.staticInnerVar);
		
		//instance�Լ�����
		b.innerMethod();
		//static�Լ�����
		OuterClass.StaticInnerClass.staticInnerMethod();
		
	}
}
