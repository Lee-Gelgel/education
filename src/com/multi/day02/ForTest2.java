package com.multi.day02;

public class ForTest2 {

	public static void main(String[] args) {
		System.out.println("main start");
		total(1,10);//함수호출
		total(5,6);//함수호출
		System.out.println("main end");
	}
	
	public static void total(int start, int stop){
		System.out.println("total start");
 
		int i;
		int sum = 0;
		
		for (i = start; i <= stop; i++) {
			System.out.println("i= " + i);
			sum += i;
		}
		System.out.println(sum);
		System.out.println("total end");
	}
}
