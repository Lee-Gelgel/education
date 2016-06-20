package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class load 성공");
			// DB connect
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userID = "hr";
			String userPW = "hr";
			conn = DriverManager.getConnection(url,userID,userPW);
			System.out.println("DB connection 성공");
			// statement create
			statement = conn.createStatement();
			// resultSet 
			String sql = "select * from employees";
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				int employee_id = resultSet.getInt(1);
				String first_name = resultSet.getString(2);
				System.out.println(employee_id+"\t"+first_name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패");
		} catch (SQLException e) {
			System.out.println("DB connection 실패");
		}
	}
}
