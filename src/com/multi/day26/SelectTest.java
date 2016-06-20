package com.multi.day26;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class SelectTest {
	public static void main(String[] args) {
		// db ����
		Connection conn = DBUtil.connect(); // �̸� ����� ���� �Լ� ���
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from member";
		try {
			// sql ����
			statement = conn.createStatement();
			resultSet = statement.executeQuery(sql);
			// result ���
			while(resultSet.next()){
				System.out.printf("%-3d%-20s%-20s%-20s%tY��%tm��%td��\n",
						resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
						resultSet.getString(4),resultSet.getDate(5),resultSet.getDate(5),resultSet.getDate(5));
			}
		} catch (SQLException e) {
			System.out.println("Error Message"+e.getMessage());
		} finally {
			DBUtil.disconnect(resultSet, statement, conn);
		}

	}
}
