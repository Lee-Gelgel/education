package com.multi.day02;

public class BreakTest {
	public static void main(String[] args) {
		// break, continue ==> 반복문의 흐름을 변경

		for (int i = 1; i <= 10; i++) {
			//짝수일때 실행
			if(i%2==0){
				continue;//반복문의 시작점으로 이동
			}
			System.out.println("i=" + i);
		}
		System.out.println("==========================");
		
		//i를 2씩 증가시켜서 홀수만 출력
		for (int i = 1; i <= 10; i+=2) {
			System.out.println("i=" + i);
		}
		
		System.out.println("==========================");
		for (int i = 1; i <= 10; i++) {
			//짝수일때 실행
			if(i%2==0){
				break;//반복문을 빠져나옴
			}
			System.out.println("i=" + i);
		}
		System.out.println("==========================");
		System.out.println("Done.");
	}
}
