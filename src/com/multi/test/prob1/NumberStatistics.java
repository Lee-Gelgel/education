package com.multi.test.prob1;

import java.util.Arrays;

public class NumberStatistics {
	public static void main(String[] args) {
		int[] array = {2, 23, 5, 65, 17, 66, 86, 9, 82, 22, 14};
		System.out.println("최대값 : " + getMaxNum(array));
	}

	private static int getMaxNum(int[] array) {
		// 구현하시오.
		// int maxNum = 0;
		// for (int i = 0; i < array.length; i++) {
		// if(maxNum<array[i]){
		// maxNum = array[i];
		// }
		// }
		// return maxNum;
		
		Arrays.sort(array);
		return array[array.length-1];
		
	}	
}
