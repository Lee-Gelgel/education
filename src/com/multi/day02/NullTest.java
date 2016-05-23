package com.multi.day02;

public class NullTest {
	public static void main(String[] args) {
		String s = null;// null->정해지지않음, 참조형 타입변수에서 사용
		// NullPointerException -->값이 null이기때문에 사용불가
		System.out.println(s.length());
	}
}
