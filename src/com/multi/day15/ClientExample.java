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
		System.out.println("클라이언트가 연결 요청");
		try {
			socket.connect(new InetSocketAddress("70.12.110.92", 5001));
			System.out.println("연결 성공함");
			
			byte[] bytes = null;
			String message = null;
			
			// 쓰기
			OutputStream os = socket.getOutputStream();
			message = "Hello 루루야";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.err.println("클라이언트 데이터전송성공");
			
			// 읽기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("데이터 받기 성공 : "+message);
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
