package com.multi.day14;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IOExample {
	public static void main(String[] args) throws IOException {

		// Ű���� �Է�
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		String data;
		
		while(sc.hasNext()){
			data = sc.next();
			System.out.println(data);
		}
		
		
		
		// Console console = System.console();
		// System.out.print("�Է�>>");
		// String id = console.readLine();
		// System.out.print("�Է�>>");
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
		// i = is.read(bytes); //1byte �д´�.
		// System.out.println(i+"==>"+Arrays.toString(bytes));

		// is.close(); // �ڿ��ݳ�

	}
}
