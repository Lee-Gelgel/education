package com.multi.day10;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String s = "123/123//123/";
		StringTokenizer st = new StringTokenizer(s, "/");
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken()+"*");
		}
		
		System.out.println();
		String[] sp = s.split("/");
		for(String str : sp){
			System.out.print(str+"*");
		}
	}
}
