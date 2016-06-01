package com.multi.day15.network;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		// socket = new Socket();
		try {
			System.out.println("클라이언트가 연결 요청");
			socket = new Socket("localhost", 5001);
			// socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공함");

			SenderThread sender = new SenderThread(socket);
			ReceiverThread receiver = new ReceiverThread(socket);
			sender.start();
			receiver.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
