package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		//db connect
		conn = dbConnect();
		
		//execute
		resultSet = exec(conn,statement);
		
		//print result
		print(resultSet);
	}
	
	public static Connection dbConnect(){
		Connection conn = null;
		try {
			// driver load
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver load ����");
			
			// db connect
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userID = "hr";
			String userPW = "hr";
			conn= DriverManager.getConnection(url, userID, userPW);
			System.out.println("db connection ����");
		} catch (ClassNotFoundException e) {
			System.out.println("driver load ����");
		} catch (SQLException e) {
			System.out.println("db connection ����");
		}
		return conn;
	}
	
	public static ResultSet exec(Connection conn,Statement statement){
		ResultSet resultSet = null;
		try {
			statement = conn.createStatement();
			System.out.println("statement create ����");
			String sql = "select * from departments";
			resultSet = statement.executeQuery(sql);
			System.out.println("statement execute ����");
		} catch (SQLException e) {
			System.out.println("statement error");
		}
		return resultSet;
	}
	
	public static void print(ResultSet resultSet){
		try {
			System.out.println("�μ��ڵ�\t�μ��̸�");
			while(resultSet.next()){
				int department_id = resultSet.getInt("department_id");
				String department_name = resultSet.getString("department_name");
				System.out.println(department_id+"\t"+department_name);
			}
		} catch (SQLException e) {
			System.out.println("resultSet error");
		}
	}
}
