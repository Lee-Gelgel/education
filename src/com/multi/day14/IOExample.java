package com.multi.day14;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IOExample {
	public static void main(String[] args) throws IOException {

		// 키보드 입력
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		String data;
		
		while(sc.hasNext()){
			data = sc.next();
			System.out.println(data);
		}
		
		
		
		// Console console = System.console();
		// System.out.print("입력>>");
		// String id = console.readLine();
		// System.out.print("입력>>");
		// char[] pw = console.readPassword();
		//
		// System.out.println("----------");
		// System.out.println(id);
		// System.out.println(pw);

		// InputStream is = System.in;
		// InputStreamReader isr = new InputStreamReader(is);
		// int i;
		// while((i = isr.read())!=13){
		// System.out.print((char)i);
		// }
		// int i;
		// byte[] bytes = new byte[100];
		// i = is.read(bytes); //1byte 읽는다.
		// System.out.println(i+"==>"+Arrays.toString(bytes));

		// is.close(); // 자원반납

	}
}
