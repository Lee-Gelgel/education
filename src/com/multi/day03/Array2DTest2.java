package com.multi.day03;

public class Array2DTest2 {
	public static void main(String[] args) {
		int[][] a = { { 30, 30, 30 }, { 40, 40, 40, 40 }, { 50, 50, 50, 50, 50 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 } };
		int[][] c = new int[3][];
		compute(a, b, c);
		print(c);
	}

	private static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void compute(int[][] arr, int[][] arr2, int[][] arr3) {
		// 배열의 값을 변경
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				arr3[i][j] = arr[i][j] - arr2[i][j];
			}
		}

	}
}
