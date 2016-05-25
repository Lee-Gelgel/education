package com.multi.day10;

public class StringTest {
	public static void main(String[] args) {
		//String->고정문자열
		String s = "java";
		String s2 = "java";
		System.out.println(s==s2);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		//StringBuffer->가변문자열
		StringBuffer sb = new StringBuffer("java");
		sb.append("1");
		
		
	}
}
