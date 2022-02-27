package Day1222;

import java.sql.*;

public class JDBCEx3 { // DELETE
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from department where dname = '컴퓨터공학과' ");
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
			
			stmt = con.createStatement();
			
			// Query문 실행
			int i = stmt.executeUpdate(sql.toString());
			System.out.println(i + "개 행이 삭제되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
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