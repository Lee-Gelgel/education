package com.multi.day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import util.DBUtil;

public class InsertTest {
	
	//java.util.sql
//	public static void insertMember(int mno, String mname, String phone, String email, Date birthdate) {
//		Connection conn = null;
//		Statement statement = null;
//		String sql = "insert into member (mno,mname,phone,email,birthdate) "
//				+ "values ("+mno+",'"+mname+"','"+phone+"','"+email+"',"+birthdate+")";
//		// db����
//				conn = DBUtil.connect();
//				try {
//					statement = conn.createStatement();
//					// insert
//					int result = statement.executeUpdate(sql);
//					System.out.println(result + "�� �Էµ�");
//				} catch (SQLException e) {
//					System.out.println("error message : " + e.getMessage());
//				} finally {
//					DBUtil.disconnect(statement, conn);
//				}
//	}
	public static void insertMember(int mno, String mname, String phone, String email, Date birthdate) {
		Connection conn = null;
		PreparedStatement statement = null;
		String sql = "insert into member (mno,mname,phone,email,birthdate) "
				+ "values (?,?,?,?,?)";
		// db����
				conn = DBUtil.connect();
				try {
					statement = conn.prepareStatement(sql);
					statement.setInt(1, mno);
					statement.setString(2, mname);
					statement.setString(3, phone);
					statement.setString(4, email);
					//java.sql.Date
					java.sql.Date d= new java.sql.Date(birthdate.getTime()); 
					statement.setDate(5, d);
					// insert
					int result = statement.executeUpdate();
					System.out.println(result + "�� �Էµ�");
				} catch (SQLException e) {
					System.out.println("error message : " + e.getMessage());
				} finally {
					DBUtil.disconnect(statement, conn);
				}
	}

	public static void main(String[] args) {
		Date d = new Date();
		insertMember(14,"gelgel","gel-gel","gel@gel",d);
		Calendar cal = Calendar.getInstance();
		//cal�� month�� 0���ͽ���
		cal.set(1988, 11, 17);
		d = cal.getTime();
		insertMember(15,"lulu","lu-lu","lu@lu",d);
	}
}
