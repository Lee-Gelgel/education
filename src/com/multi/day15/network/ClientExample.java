package com.multi.day15.network;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		// socket = new Socket();
		try {
			System.out.println("Ŭ���̾�Ʈ�� ���� ��û");
			socket = new Socket("localhost", 5001);
			// socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("���� ������");

			SenderThread sender = new SenderThread(socket);
			ReceiverThread receiver = new ReceiverThread(socket);
			sender.start();
			receiver.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
