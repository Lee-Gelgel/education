package com.multi.Pratice.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		aa: while (true) {
			try {
				System.out.println("[서버] 연결기다림");
				serverSocket = new ServerSocket(5001);
				socket = serverSocket.accept();
				System.out.println("[서버] 연결됨");

				SenderThread sender = new SenderThread(socket);
				RecieverThread reciever = new RecieverThread(socket);
				sender.start();
				reciever.start();
				continue aa;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
