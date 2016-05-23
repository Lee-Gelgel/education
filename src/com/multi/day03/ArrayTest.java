package com.multi.day03;

public class ArrayTest {
	public static void main(String[] args) {
		// 하나의 이름으로 같은타입, 값 여러개 저장
		// 1. 배열선언
		int[] score = null;

		// 2. 배열생성
		score = new int[4]; // 자동초기화

		// 3. 사용
		score[0] = 100;
		System.out.println("0번째 방의 값 : " + score[0]);
		System.out.println("9번째 방의 값 : " + score[3]);

		String[] season = new String[] { "봄", "여름", "가을", "겨울" };
		System.out.println("배열의 갯수 : " + season.length);
		int count = season.length;
		for (int i = 0; i < count; i++) {
			System.out.println(i+"번째 방의 값 : "+season[i]);
		}
		
		score = new int[]{100, 95, 90, 85};
		for (int i : score){
			System.out.println(i);
		}
		
		String[] str = new String[3];
		System.out.println(str[0]);
		
		char[] ch = new char[4];
		System.out.println("*"+ch[0]+"*");
		
		char ch2 = ' ';
		char ch3 = '\u0000';
		System.out.println("*"+ch2+"*");
		System.out.println("*"+ch3+"*");
		
		System.out.println("main에 전달된 문자갯수 : "+args.length);
		int su = Integer.parseInt(args[0]);
		System.out.println(su);
	}
}
