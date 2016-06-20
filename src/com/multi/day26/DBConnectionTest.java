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
			// 1. DB ������ �����ϴ� Driver�� �޸𸮿� load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class load ����");
			
			// 2. DB����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userID = "hr";
			String userPW = "hr";
			conn = DriverManager.getConnection(url, userID, userPW);
			System.out.println("DB���� ����");
			
			// 3. Statement����
			//	��λ���
			statement = conn.createStatement();
			//	��� ���ؼ� sql�� ����
			String sql = "select employee_id, first_name from employees";
			//	resultSet�� sql�� ��� ����
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				int emp_id = resultSet.getInt(1);
				String fname = resultSet.getString(2);
				System.out.println(emp_id+"\t"+fname);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("class�� �������� �ʽ��ϴ�.");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
		} finally {
			// DB��������
			//conn.close();
		}

	}
}
