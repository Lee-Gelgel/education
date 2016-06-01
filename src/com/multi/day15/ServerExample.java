package com.multi.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5001);
			while(true){
				System.out.println("������ �����ٸ�...");
				Socket socket = serverSocket.accept(); // Ŭ���̾�Ʈ ���� ����
				InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("���� ������");
				
				byte[] bytes = null;
				String message = null;
				
				// �б�
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("������ �ޱ� ���� : "+message);
				
				
				// ����
				OutputStream os = socket.getOutputStream();
				message = "Hello Ŭ���̾�Ʈ��";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				is.close();
				os.flush();
				os.close();
				System.err.println("���� ���������ۼ���");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()){
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
