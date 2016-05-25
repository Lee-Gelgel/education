package com.multi.day10;

import java.io.IOException;
import java.io.InputStream;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		byte[] by = new byte[100];
		System.out.print("ют╥б>>");
		int numberOfByte = is.read(by);
		String s = new String(by,0,numberOfByte-2);
		System.out.println(s);
		System.out.println(numberOfByte);
//		int i;
//		while((i=is.read())!=13){
//			System.out.print((char)i);
//		}
	}
}