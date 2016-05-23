package com.multi.day03;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 2차원배열 -> 배열의 배열
		// 1.배열참조변수선언
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[2][2];
		System.out.println("배열의갯수:" + a.length);
		System.out.println("배열의갯수:" + a[0].length);
		System.out.println("배열의갯수:" + a[1].length);

		b = new int[4][];
		System.out.println("배열의갯수:" + b.length);
		b[0] = new int[3];
		b[1] = new int[4];
		b[2] = new int[5];
		b[3] = new int[6];
		System.out.println(b[0].length);

		c = new int[5][2];
		// 선언+생성+초기화
		int[][] d = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		// 선언시 초기화 할때는 new int[][]생략가능하지만 선언후 초기화 할때는 생략불가능
		int[][] position = { { 11, 22, 33 }, { 10, 20, 30 }, { 1, 2, }, { 3, 4 } };
		position = new int[][] { { 3, 4, 5 }, { 10, 20, 30 }, { 1, 2, } };

		for (int row = 0; row < position.length; row++) {
			System.out.print(row + "번째행 : ");
			for (int column = 0; column < position[row].length; column++) {
				System.out.print(position[row][column] + " ");
			}
			System.out.println();
		}
	}
}
