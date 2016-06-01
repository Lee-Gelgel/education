package com.multi.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOExample {
	public static void main(String[] args) throws IOException {
		//자바의 기본형타입 IO
		//1.출력
		FileOutputStream fos = new FileOutputStream("src/com/multi/day15/data.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeInt(100);
		dos.writeChar('a');
		dos.flush();
		dos.close();
		fos.close();
		
		//2.읽기
		FileInputStream fis = new FileInputStream("src/com/multi/day15/data.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		Boolean b = dis.readBoolean();
		if(b) System.out.println("참입니다."+b);
		int i = dis.readInt();
		System.out.println(i+200);
		char c = dis.readChar();
		System.out.println(c);
		
		dis.close();
		fis.close();
	}
}
