package com.multi.day15.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket socket;

	public SenderThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		//BufferedReader br;
		try {
			//키보드 입력받은 문자를 라인으로 읽기위해
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// 네트웍에 출력
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			while(true){
				String str = br.readLine();
				if(str.equals("bye")) break;
				pw.println(str);
				pw.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
