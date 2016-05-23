package com.multi.day02;

public class Gugudan {
	public static void compute(int dan) {
		System.out.println(dan+"단 입니다.");
		int gop;
		for (gop = 1; gop <= 9; gop++) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
		}
	}
	
	public static void main(String args[]){
		int dan;
		for(dan=2;dan<=9;dan++){
			System.out.println(dan+"단 입니다.");
			int gop;
			for (gop = 1; gop <= 9; gop++) {
				System.out.println(dan + "*" + gop + "=" + dan * gop);
			}
		}
	}
}
