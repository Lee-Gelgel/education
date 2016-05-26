package com.multi.day10;

public class StringExample {
	public static void main(String[] args) {
		// 암호화할 문자열 : everyday we have is one more than we deserve
		// 암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		String value = "everyday we have is one more than we deserve";
		caesarCipher(value, 3);
		
	}
	public static void caesarCipher(String value, int shift){
		char[] c = new char[value.length()];
		for(int i=0;i<value.length();i++){
			c[i] = value.charAt(i);
			if(c[i]==' ') continue;
			c[i] = (char)(c[i]+shift);
			if(c[i]>'z') c[i] = (char)(c[i]-('z'-'a'+1));
		}
		for(char b : c){
			System.out.print(b);
		}	
	}
}
