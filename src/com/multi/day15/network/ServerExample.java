package com.multi.day15.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			while(true){
			serverSocket = new ServerSocket(5001);
			System.out.println("서버가 연결기다림...");
			socket = serverSocket.accept(); // 클라이언트 연결 수락
			// InetSocketAddress inetSocketAddress = (InetSocketAddress)
			// socket.getRemoteSocketAddress();
			System.out.println("연결 수락함");

			SenderThread sender = new SenderThread(socket);
			ReceiverThread receiver = new ReceiverThread(socket);
			sender.start();
			receiver.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			serverSocket.close();
		} catch (Exception ignored) {
		}
	}
}
