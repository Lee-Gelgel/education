package com.multi.day03;

public class PrintStar {
	public static void main(String[] args) {
		// 1열 5개
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		// 1열 1개,2열 2개 ... 5열 5개
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------");
		// 1열 1개,2열 2개,3열 3개,4열 2개,5열 1개
		for (int i = 0; i < 5; i++) {
			if (i > 2) {
				for (int j = 0; j <=4-i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			} else if (i<=2) {
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.out.println("---------");
		System.out.println();
	}
}
