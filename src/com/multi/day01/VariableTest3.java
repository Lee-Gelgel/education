package com.multi.day01;

public class VariableTest3 {
	public static void main(String[] args) {
		int a=10;
		a++;//증감연산자
		a = a+1; //읽어서 더해서 넣어라
		a += 10 ; //복합대입연산자
		System.out.println(a);
		
		System.out.println(++a); //증가하고 출력
		System.out.println(a++); //출력하고 증가

		System.out.println("현재a="+a);
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b); //논리부정연산자 '!' 
		
		
	}
}
