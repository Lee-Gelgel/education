package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// 1. DB 벤더가 제공하는 Driver를 메모리에 load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class load 성공");
			
			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userID = "hr";
			String userPW = "hr";
			conn = DriverManager.getConnection(url, userID, userPW);
			System.out.println("DB연결 성공");
			
			// 3. Statement생성
			//	통로생성
			statement = conn.createStatement();
			//	통로 통해서 sql문 전송
			String sql = "select employee_id, first_name from employees";
			//	resultSet에 sql문 결과 저장
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				int emp_id = resultSet.getInt(1);
				String fname = resultSet.getString(2);
				System.out.println(emp_id+"\t"+fname);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("class가 존재하지 않습니다.");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
		} finally {
			// DB연결해제
			//conn.close();
		}

	}
}
