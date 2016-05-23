package com.multi.day05;

public class ObjectTest {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		Integer a = new Integer(100);
		System.out.println(a.MAX_VALUE);

		// static함수호출
		int b = Integer.parseInt("200");

		// object함수호출
		System.out.println(a.intValue());
		// System.out.println(Integer.intValue());

		int i = 100;
		Integer i2 = new Integer(200);
		Integer i3 = 300; // AutoBoxing

		int i4 = i2.intValue();
		int i5 = i2; // AutoUnBoxing
	}
}
