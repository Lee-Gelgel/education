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
				System.out.println("서버가 연결기다림...");
				Socket socket = serverSocket.accept(); // 클라이언트 연결 수락
				InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("연결 수락함");
				
				byte[] bytes = null;
				String message = null;
				
				// 읽기
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("데이터 받기 성공 : "+message);
				
				
				// 쓰기
				OutputStream os = socket.getOutputStream();
				message = "Hello 클라이언트야";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				is.close();
				os.flush();
				os.close();
				System.err.println("서버 데이터전송성공");
				
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
