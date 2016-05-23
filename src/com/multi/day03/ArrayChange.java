package com.multi.day03;

import java.util.Arrays;

public class ArrayChange {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30 };
		int[] arr2 = new int[10];
		
		//规过1
		/*for(int i=0;i<arr.length;i++){
			arr2[i] = arr[i];
		}*/
		
		//规过2
		//System.arraycopy(arr, 0, arr2, 5, arr.length);
		
		//规过3
		arr2 = Arrays.copyOf(arr, arr2.length);
		
		for(int i : arr2){
			System.out.println(i);
		}
	}
}
