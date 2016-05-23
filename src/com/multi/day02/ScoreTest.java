package com.multi.day02;

public class ScoreTest {
	public static void main(String[] args) {
		// 시험점수 10개를 저장한후 총점과 평균을 출력
		int[] score = { 100, 98, 88, 97, 67, 59, 80, 90, 77, 85 };
		int total = 0;
		double avr = 0;
		for (int i : score) {
			total += i;
		}
		avr = (double) total / score.length;
		System.out.println("total : " + total);
		System.out.println("avr : " + avr);
	}
}
