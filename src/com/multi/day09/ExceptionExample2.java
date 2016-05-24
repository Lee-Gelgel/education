package com.multi.day09;
// ��������� Exception
/*
 * 1.RuntimeException�̴� ...ó�� ���ص� �ȴ� 
 * 2.RuntimeException�ƴϴ� 
 * 3.
 */

class MyException extends RuntimeException {

	public MyException(String message) {
		super(message);
	}

}

public class ExceptionExample2 {
	public static void method1(int su) throws MyException {
		// ���� �����߻� (throw)
		if (su >= 10)
			throw new MyException("10�̸��� ����");
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
