package Day1222;

import java.sql.*;

public class JDBCEx2 { // UPDATE
	public static void main(String[] args) {
		// Query문 작성. 학과 번호를 조건으로 하여 학과명을 컴퓨터공학과로 수정
		StringBuffer sql = new StringBuffer();
		sql.append("update department ");
		sql.append("set dname = '컴퓨터공학과' ");
		sql.append("where deptno = 203");
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
			System.out.println("DB 연결 성공");
			
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개 행이 변경되었습니다");
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이브 로딩 실패");
		} catch (SQLException se) {
			System.out.println("DB 연결 실패");
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				
			}
			
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
}