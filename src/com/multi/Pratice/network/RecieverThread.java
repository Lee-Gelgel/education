package com.multi.Pratice.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieverThread extends Thread {
	Socket socket;

	public RecieverThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				String str = br.readLine();
				if(str==null) break;
				System.out.println("¼ö½Å>>"+str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
