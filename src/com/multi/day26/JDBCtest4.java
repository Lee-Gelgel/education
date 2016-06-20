package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest4 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// 1. DB����
			conn = dbConnect();
			// 2. SQL�� ����
			resultSet = exec(conn, statement);
			// 3. ������
			print(resultSet);
		} catch (ClassNotFoundException e) {
			System.out.println("driver load ����");
		} catch (SQLException e) {
			System.out.println("�����޽���" + e.getMessage());
		} finally {
			// 4.�ڿ��ݳ�
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

	}

	public static Connection dbConnect() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("oracle.jdbc.OracleDriver");
		// System.out.println("driver load ����");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		conn = DriverManager.getConnection(url, user, password);
		// System.out.println("db connect ����");
		return conn;
	}

	public static ResultSet exec(Connection conn, Statement statement) throws SQLException {
		ResultSet resultSet = null;
		statement = conn.createStatement();
		// System.out.println("statement create ����");
		String sql = "select * from departments";
		resultSet = statement.executeQuery(sql);
		// .out.println("statement execute ����");
		return resultSet;

	}

	public static void print(ResultSet resultSet) throws SQLException {
		System.out.println("�μ��ڵ�\t�μ��̸�");
		while (resultSet.next()) {
			int department_id = resultSet.getInt("department_id");
			String depatment_name = resultSet.getString("department_name");
			System.out.println(department_id + "\t" + depatment_name);
		}
	}
}
