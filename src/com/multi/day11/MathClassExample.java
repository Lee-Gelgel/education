package com.multi.day11;

import java.util.Random;

public class MathClassExample {
	public static void main(String[] args) {
		System.out.println(Math.ceil(5.001)); //�ø�
		System.out.println(Math.floor(5.999)); //����
		System.out.println(Math.round(5.499)); //�ݿø�

		double d = Math.random();
		System.out.println(d);
		
		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.err.println(i);
		
		
	}
}
