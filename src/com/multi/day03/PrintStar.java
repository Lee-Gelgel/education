package com.multi.day03;

public class PrintStar {
	public static void main(String[] args) {
		// 1�� 5��
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
		// 1�� 1��,2�� 2�� ... 5�� 5��
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------");
		// 1�� 1��,2�� 2��,3�� 3��,4�� 2��,5�� 1��
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
