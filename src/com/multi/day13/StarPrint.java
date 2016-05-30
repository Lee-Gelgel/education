package com.multi.day13;

public class StarPrint {
	public static void main(String[] args) {
		print(3);
		print(5);
	}
	static void print(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
