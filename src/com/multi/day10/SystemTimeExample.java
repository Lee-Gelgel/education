package com.multi.day10;

public class SystemTimeExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += i;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println("## 소요시간(초.0f) : " + (endTime - startTime) / 1000.0f + "초");
	}
	
}
