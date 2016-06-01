package com.multi.Pratice.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	Socket socket;

	public SenderThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			while(true){
				String str = br.readLine();
				if(str.equals("bye")) break;
				pw.println(str);
				pw.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
//		finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
	}
	
}
