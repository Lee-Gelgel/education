package com.multi.day09;
// 사용자정의 Exception
/*
 * 1.RuntimeException이다 ...처리 안해도 된다 
 * 2.RuntimeException아니다 
 * 3.
 */

class MyException extends RuntimeException {

	public MyException(String message) {
		super(message);
	}

}

public class ExceptionExample2 {
	public static void method1(int su) throws MyException {
		// 예외 강제발생 (throw)
		if (su >= 10)
			throw new MyException("10미만만 가능");
	}

	public static void main(String[] args) {
		try{
		method1(10);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

}
