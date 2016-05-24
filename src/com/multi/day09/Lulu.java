package com.multi.day09;

class OutterClass{
	String a = "a";
	static String b = "b";
	void printA(){
		System.out.println(b); // printA 메소드는 생성하고 사용가능하기때문에 static 변수인 b 사용가능
	}
	static void printB(){
		System.out.println(b);
	}
	
	class Inner{
		String c = "c";
		String d = a; // 1-3 인스턴스 멤버 클래스 내부에서 바깥 클래스 필드사용
	}
	
	static class StaticInner{
		static String d = "d";
	}
}


public class Lulu {
	public static void main(String[] args) {
		OutterClass.Inner aa = new OutterClass().new Inner();
		System.out.println(aa.c); // 1-1 인스턴스 멤버 클래서는 바깥클래스의 객체가 있어야(생성을 해야) 사용 될 수 있다
		System.out.println(OutterClass.StaticInner.d); // 1-2 정적 멤버 클래스는 바깥 클래스의 객체가 없어도(생성하지 않아도) 사용 될 수 있다.
	}
}
