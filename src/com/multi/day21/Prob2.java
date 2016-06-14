package com.multi.day21;

public class Prob2 {
	public static void main(String[] args) {
		printStar(5);
		printStar(4);
	}

	public static void printStar(int cnt) {
		// 구현하시오
		for (int i = 0; i < cnt; i++) {
			for (int j = i; j < cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
