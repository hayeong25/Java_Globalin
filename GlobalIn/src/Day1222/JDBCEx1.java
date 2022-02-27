package Day1222;

// 1단계
import java.sql.*;

public class JDBCEx1 { // INSERT
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			// 2단계 : 특정 드라이버 검색
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브가 정상적으로 검색되었습니다.");
			
			// 3단계 : DB 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
			System.out.println("DB 연결 성공");
			
			// 4단계 : Query문 작성. Statement 클래스 객체 얻기
			stmt = con.createStatement();
			
			// SQL 작성
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(203, '제어계측공학과', 200, '7호관')");
			
			// Query 실행
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개 행이 추가되었습니다.");
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이브 검색 실패");
		} catch (SQLException ss) {
			System.out.println("DB 연결 실패");
		} finally {
			// 6단계 : 연결 해제
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