package com.multi.day02;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열..하나의 이름으로 같은 type의 여러개의 값을 지정하기위한 자료구조

		// 1.배열선언
		int[] score; // stack영역 생성
		double score2[];
		boolean b[];
		char[] c;
		// 2.배열생성
		score = new int[3]; // heap영역 생성, 자동초기화 0
		score2 = new double[4]; // 자동초기화 0.0
		b = new boolean[2]; // 자동초기화 false
		c = new char[10]; // 자동초기화 공백
		// 3.배열사용
		score[0] = 100;
		score2[0] = 123.567;
		b[0] = true;
		c[0] = 'A';

		System.out.println(score[0]);
		System.out.println(score2[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);

		// 선언+생성
		int[] score3 = new int[20];
		System.out.println(score3[19]);

		// 선언+생성+초기화
		//int[] score4 = new int[] { 10, 20, 30, 40 };
		int[] score4 = { 10, 20, 30, 40 };
		System.out.println(score4[0]);
		System.out.println(score4.length);
		//일반FOR
		for(int i=0;i<score4.length;i++){
			System.out.print(score4[i]+"\t");
		}
		//확장FOR, 향상된FOR
		for(int i : score4){
			System.out.println(i);
		}
	}
}
