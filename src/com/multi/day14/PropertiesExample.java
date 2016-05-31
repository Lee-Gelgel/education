package com.multi.day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
			pro.load(new FileReader("src/com/multi/day14/database.properties"));
			String country = pro.getProperty("country");
			System.out.println(country);
			String language = pro.getProperty("language");
			System.out.println(language);
			String driver = pro.getProperty("driver");
			System.out.println(driver);
			String url = pro.getProperty("url");
			System.out.println(url);
			String username = pro.getProperty("username");
			System.out.println(username);
			String password = pro.getProperty("password");
			System.out.println(password);
			pro.setProperty(password, "manager");
			System.out.println(pro.getProperty(password));
	}
}
