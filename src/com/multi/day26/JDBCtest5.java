package com.multi.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest5 {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		JDBCtest5 test = new JDBCtest5();

		try {
			// db 연결
			conn = test.dbConnect();
			// sql문 실행
			resultSet = test.sqlExecute(conn, statement);
			// 결과 출력
			test.resultPrint(resultSet);
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패");
		} catch (SQLException e) {
			System.out.println("error" + e.getMessage());
		} finally {
			// 연결 종료
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

	Connection dbConnect() throws ClassNotFoundException, SQLException {
		// Connection conn = null;
		Class.forName("oracle.jdbc.OracleDriver");
		// System.out.println("class load 성공");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		return DriverManager.getConnection(url, user, password);
		// System.out.println("db connect 성공");
		// conn = DriverManager.getConnection(url, user, password);
		// return conn;
	}

	ResultSet sqlExecute(Connection conn, Statement statement) throws SQLException {
		// ResultSet resultSet = null;
		statement = conn.createStatement();
		String sql = "select employee_id, first_name, department_name "
				+ "from employees join departments using (department_id) " + "order by employee_id";
		return statement.executeQuery(sql);
		// resultSet = statement.executeQuery(sql);
		// return resultSet;
	}

	void resultPrint(ResultSet resultSet) throws SQLException {
		System.out.println("직원번호\t직원이름\t부서이름");
		while (resultSet.next()) {
			int employee_id = resultSet.getInt("employee_id");
			String first_name = resultSet.getString("first_name");
			String department_name = resultSet.getString("department_name");
			System.out.printf("%5d%20s%20s\n", employee_id, first_name, department_name);
			// System.out.println(employee_id + "\t" + first_name + "\t" +
			// department_name);
		}

	}

}
