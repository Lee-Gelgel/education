package com.multi.Pratice.network;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("[Ŭ���̾�Ʈ] �����û");
			socket = new Socket("localhost", 5001);
			System.out.println("[Ŭ���̾�Ʈ] ���Ἲ��");

			SenderThread sender = new SenderThread(socket);
			RecieverThread reciever = new RecieverThread(socket);
			sender.start();
			reciever.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
