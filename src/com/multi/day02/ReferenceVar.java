package com.multi.day02;

public class ReferenceVar {
	public static void main(String[] args) {
		//int a = 10, b = 10;
		int a=10,b=8;b+=2;
		System.err.println(a == b);// 값을 비교

		String s1 = "java";// compile시에 생성 주소 할당
		s1 += "pro";
		String s2 = "java";// 이미 생성된 문자가있다면 그 주소를 저장
		s2 += "pro";
		String s3 = new String("java");// runtime시에 생성
		String s4 = new String("java");
		System.out.println(s1 == s2);// 주소 비교
		System.out.println(s1.equals(s2));// 내용 비교
		System.out.println(s3 == s4);// 주소 비교
		System.out.println(s3.equals(s4));// 내용 비교
	}
}

