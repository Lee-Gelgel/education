package com.multi.day02;

public class ForTest3 {
	
	public static void getNumber(int range){
		for(int i=1;i<=6;i++){
			int su = (int)(Math.random()*range)+1;
			System.out.println(su); 
		}
		
	}
	public static void main(String[] args) {
		//Random number
		//System.out.println(Math.random()); //0~1사이의 실수, double
		//System.out.println((int)(Math.random()*10)); //0~10사이의 정수
		System.out.println("45이하");
		getNumber(45);
		System.out.println("100이하");
		getNumber(100);
	}
}
