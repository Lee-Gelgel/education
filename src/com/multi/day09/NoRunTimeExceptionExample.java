package com.multi.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoRunTimeExceptionExample {
	
	public static void method2() throws ClassNotFoundException{
			Class.forName("com.multi.day09.NoRunTimeExceptionExample2");
			System.out.println("성공");
	}
	
	
	public static void method3(){
		// FileInputStream 파일 읽어옴, 한글 못읽어옴 // FileReader 한글 읽어옴
		// FileInputStream fi = new FileInputStream("src/com/multi/day09/AnonymousExample.java");
		FileReader fi = null;
		try {
			fi = new FileReader("src/com/multi/day09/AnonymousExample.java");
			int i;
			
			while((i = fi.read())!=-1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류입니다.");
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

		System.out.println("함수호출 전");
		
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
//			System.out.println("연산오류");
//		}

		System.out.println("함수호출 후");
	}

	public static void method() {
		int a = 10 / 0;
		System.out.println(a);
	}
}
