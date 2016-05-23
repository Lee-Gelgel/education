package com.multi.day03;

public class ConstTest {
	public static void main(String[] args) {
		//c는 const는 상수, java는 const라는 예약서사용안함
		//상수->값이 setting된후 변경불가
		//변수->값변경가능
		
		String dept ="개발부";
		System.out.println(dept);
		
		dept = "SM사업부";
		System.out.println(dept);
		
		final double PI = 3.14;
		System.out.println(PI);
		
	}
}
