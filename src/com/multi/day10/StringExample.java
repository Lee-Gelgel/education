package com.multi.day10;

public class StringExample {
	public static void main(String[] args) {
		// ��ȣȭ�� ���ڿ� : everyday we have is one more than we deserve
		// ��ȣȭ�� ���ڿ� : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		
		String str = "everyday we have is one more than we deserve";
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ') {
				System.out.print((str.charAt(i)));
			} else {
				System.out.print((char)(str.charAt(i)+3));
			}
		}
	}
}
