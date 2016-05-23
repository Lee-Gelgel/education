package com.multi.day01;

//dos>java VariableTest
public class VariableTest {
	public static void main(String[] args) {
		System.out.println("Variable practice");
		//변수=>값 저장소
		//1.변수선언
		int score = 50;
		//2.변수초기화(할당)
		score += 100;
		//3.변수사용
		System.out.println("점수는 " + score);

		
		//자바의 기본형 타입
		//1.char -> 단일문자열 ' '
		//String =>" ",기본형아님
		char c = 'A';//c변수에 'A'문자값을 저장한다.
		//2byte크기
		System.out.println(c);//c변수에 저장된 값을 읽기
		c++;
		System.out.println(c);
		//2.boolean -> true, false
		boolean b = false;
		System.out.println(b);
		
		//3. 정수 -> byte(1byte), short(2byte), int(4byte), long(8byte)
		//4. 실수 -> 							float(4byte), double(8byte)
		byte by = 127;
		by++;
		by++;
		by++;
		System.out.println(by);
		
		short s = 32767;
		s++;
		System.out.println(s);
		
		//4byte ...... 정수 literal의 기본은 int
		int i = 2147483647;
		i++;
		System.out.println(i);
		
		//8byte
		long aa = 2147483648L; //L, l 모두가능
		aa++;
		System.out.println(aa);
		
		//float(4byte)
		float f = 3.14F; // F, f 모두가능
		f++;
		System.out.println(f);
		
		//double(8byte) ...... 실수의 literal의 기본은 double
		double d = 3.14;
		d++;
		System.out.println(d);
	}
}
