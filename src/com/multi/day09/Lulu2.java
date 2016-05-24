package com.multi.day09;

public class Lulu2 {
	String str = "lulu";
	int a = 1;

	public void print() {
		// 2-1 메소드 내부에 선언된 클래스
		class Local {
			void print2() {
				str = "gelgel";
				a = 10;
				System.out.println(str); // 2-2 바깥클래스의 모든필드와 메소드를 사용할수있다
			}
		}
	}

	public static void main(String[] args) {
	}

}
