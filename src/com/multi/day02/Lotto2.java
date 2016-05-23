package com.multi.day02;

public class Lotto2 {
	public static void main(String[] args) {
		int[] num = new int[6];

		go:for (int i = 0; i <num.length; i++) {
			num[i] = (int) (Math.random() * 6 + 1);//((Math.random() * 6)+ 1);
			if (i == 0) {
				//System.out.println("pass1");
				i++;
				continue;
			}
			for (int j = i - 1; j >= 0; j--) {
				//System.out.println("i : "+i+" j : "+j);
				if (num[i] == num[j]) {
					//System.out.println("pass2");
					--i;
					
					continue go;
				}
			}
		}
		for (int a : num) {
			System.out.println(a);
		}
	}
}
