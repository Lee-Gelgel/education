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
		//System.out.println(Math.random()); //0~1������ �Ǽ�, double
		//System.out.println((int)(Math.random()*10)); //0~10������ ����
		System.out.println("45����");
		getNumber(45);
		System.out.println("100����");
		getNumber(100);
	}
}
