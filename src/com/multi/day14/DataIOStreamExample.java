package com.multi.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStreamExample {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/com/multi/day14/primitive.txt"));
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.writeUTF("�ű��ϴ�");
		dos.writeUTF("�ű��ϴ�2");
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		dos.writeUTF("�ű��ϴ�");
		dos.writeUTF("�ű��ϴ�2");
		
		dos.flush(); dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("src/com/multi/day14/primitive.txt"));
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			String str = dis.readUTF();
			String str2 = dis.readUTF();
			System.out.println(name+" : "+score+" : "+order+" : "+str+" : "+str2);
		}
		dis.close();
	}
}
