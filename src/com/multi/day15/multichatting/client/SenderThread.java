package com.multi.day15.multichatting.client;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
class SenderThread extends Thread {
    Socket socket;
    String name;
    SenderThread(Socket socket, String name) { 
        this.socket = socket;
        this.name = name;
    }
    public void run() {
        try {
        	
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(name);
            writer.flush();
            while (true) {
            	System.out.print(name+">>");
                String str = reader.readLine();
                if (str.equals("bye"))
                    break;
                writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try { 
                socket.close(); 
            } 
            catch (Exception ignored) {
            }
        }
    }
}
