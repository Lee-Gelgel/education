package com.multi.day09;

class OutterClass{
	String a = "a";
	static String b = "b";
	void printA(){
		System.out.println(b); // printA �޼ҵ�� �����ϰ� ��밡���ϱ⶧���� static ������ b ��밡��
	}
	static void printB(){
		System.out.println(b);
	}
	
	class Inner{
		String c = "c";
		String d = a; // 1-3 �ν��Ͻ� ��� Ŭ���� ���ο��� �ٱ� Ŭ���� �ʵ���
	}
	
	static class StaticInner{
		static String d = "d";
	}
}


public class Lulu {
	public static void main(String[] args) {
		OutterClass.Inner aa = new OutterClass().new Inner();
		System.out.println(aa.c); // 1-1 �ν��Ͻ� ��� Ŭ������ �ٱ�Ŭ������ ��ü�� �־��(������ �ؾ�) ��� �� �� �ִ�
		System.out.println(OutterClass.StaticInner.d); // 1-2 ���� ��� Ŭ������ �ٱ� Ŭ������ ��ü�� ���(�������� �ʾƵ�) ��� �� �� �ִ�.
	}
}
