package com.multi.day15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
		
		String host = "www.naver.com";
		InetAddress[] arr = InetAddress.getAllByName(host);
		for(InetAddress addr : arr){
			System.out.println(addr.getHostName());
			System.out.println(addr.getHostAddress());
			System.out.println("---------------------");
		}
	}
}
