package com.multi.day05;

public class Calulator {
	// 덧셈함수
	int plus(int x, int y) { // 정의시에는 변수선언
		int result = x + y;
		return result;
	}

	// 평균함수
	double avg(int x, int y) {
		int sum = plus(x, y); // 호출시에는 값전달
		double result = sum / 2.0;
		return result;
	}

	// 실행함수
	void excute() {
		double result = avg(7, 10); // 호출시에는 값전달
		System.out.println("result : " + result);
	}

	// 출력함수
	void println(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Calulator calulator = new Calulator();
		calulator.println("message print");
		
		calulator.excute();
	}
}
