package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class load 성공");
			// db connect
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userId = "hr";
			String userPW = "hr";
			conn = DriverManager.getConnection(url,userId,userPW);
			System.out.println("DB connect 성공");
			// statement reate
			statement = conn.createStatement();
			// resultSet
			String sql = "select * from employees order by employee_id";
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				int employee_id = resultSet.getInt(1);
				String First_name = resultSet.getString(2);
				System.out.println(employee_id+"\t"+First_name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패");
		} catch (SQLException e) {
			System.out.println("DB connect 실패");
		}
	}
}
