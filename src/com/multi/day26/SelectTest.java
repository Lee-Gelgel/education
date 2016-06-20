package com.multi.day26;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class SelectTest {
	public static void main(String[] args) {
		// db 연결
		Connection conn = DBUtil.connect(); // 미리 만들어 놓은 함수 사용
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from member";
		try {
			// sql 실행
			statement = conn.createStatement();
			resultSet = statement.executeQuery(sql);
			// result 출력
			while(resultSet.next()){
				System.out.printf("%-3d%-20s%-20s%-20s%tY년%tm월%td일\n",
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
