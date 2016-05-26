package com.multi.day11;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] arr = { 100, 40, 90, 70, 99 };
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOfRange(arr, 0, arr.length);
		int[] arr4 = {100,100,100,100};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.equals(arr3, arr2));
		
		int position = Arrays.binarySearch(arr2, 99);
		System.out.println(position);

	}
}
