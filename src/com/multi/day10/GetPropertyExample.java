package com.multi.day10;

import java.util.Properties;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);

		Properties pro = System.getProperties();
		for (Object obj : pro.keySet()) {
			String key = (String) obj;
			System.out.println("[" + key + "] : [" + pro.getProperty(key) + "]");
		}
		String path = System.getenv("path");
		System.out.println(path);
	}
}
