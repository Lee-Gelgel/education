package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	// DB연결
	public static Connection connect() {
		Connection conn = null;
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/util/dbinfo.properties"));
			Class.forName(pro.getProperty("driver"));
			String url = pro.getProperty("url"); 
			String user =pro.getProperty("user"); // db user id
			String password = pro.getProperty("passwrod");; // db user password
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("db connect 실패" + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("file load 실패"+e.getMessage());
		} catch (IOException e) {
			System.out.println();
		}
		return conn;
	}

	// DB해제 (매개변수 3개) ... select
	public static void disconnect(ResultSet resultSet, Statement statement, Connection conn) {
		try {
			if (resultSet != null)
				resultSet.close();
			if (statement != null)
				statement.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DB해제 (매개변수 2개) ... insert, delete, update
	public static void disconnect(Statement statement, Connection conn) {
		try {
			if (statement != null)
				statement.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
