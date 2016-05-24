package com.multi.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoRunTimeExceptionExample {
	
	public static void method2() throws ClassNotFoundException{
			Class.forName("com.multi.day09.NoRunTimeExceptionExample2");
			System.out.println("����");
	}
	
	
	public static void method3(){
		// FileInputStream ���� �о��, �ѱ� ���о�� // FileReader �ѱ� �о��
		// FileInputStream fi = new FileInputStream("src/com/multi/day09/AnonymousExample.java");
		FileReader fi = null;
		try {
			fi = new FileReader("src/com/multi/day09/AnonymousExample.java");
			int i;
			
			while((i = fi.read())!=-1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ���������ʽ��ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� �����Դϴ�.");
			e.printStackTrace();
		} finally {
			if(fi!=null){
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("�Լ�ȣ�� ��");
		
			method3();
			
		
		// try {
		// method2();
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		
		
//		try {
//			method();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("�������");
//		}

		System.out.println("�Լ�ȣ�� ��");
	}

	public static void method() {
		int a = 10 / 0;
		System.out.println(a);
	}
}
