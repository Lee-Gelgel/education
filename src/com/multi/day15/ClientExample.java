package com.multi.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		System.out.println("Ŭ���̾�Ʈ�� ���� ��û");
		try {
			socket.connect(new InetSocketAddress("70.12.110.92", 5001));
			System.out.println("���� ������");
			
			byte[] bytes = null;
			String message = null;
			
			// ����
			OutputStream os = socket.getOutputStream();
			message = "Hello ����";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.err.println("Ŭ���̾�Ʈ ���������ۼ���");
			
			// �б�
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("������ �ޱ� ���� : "+message);
			os.close();
			is.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!socket.isClosed()){
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
