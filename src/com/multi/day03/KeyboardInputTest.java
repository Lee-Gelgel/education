package com.multi.day03;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputTest {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("입력하세요>>>>");
			String str = sc.nextLine();
			if(str.equals("exit")) break;
			System.out.println(str);
		}
	}
}
