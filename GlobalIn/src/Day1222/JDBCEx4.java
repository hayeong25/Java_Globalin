package Day1222;

import java.sql.*;

public class JDBCEx4 { // SELECT
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("select deptno, dname, college, loc from department order by college desc");

		Connection con = null;
		Statement stmt = null;
	      
		// select 쿼리의 수행결과 집합과 데이터를 추출할 수 있는 메소드를 가지고 있는 객체
		ResultSet rs = null;
	      
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버에 성공적으로 연결했습니다.");
	         
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
			System.out.println("DB 연결 성공");
			stmt = con.createStatement();
	         
			// 실행하고자 하는 sql문이 select 인 경우
			// executeQuery() : 쿼리 실행의 결과 집합을 리턴
			rs = stmt.executeQuery(sql.toString());
	         
			// ResultSet 객체로부터 데이터 추출
			// boolean next() : 커서를 다음행으로 이동, 이동한 위치에 row 값이 존재하면 true, 존재하지 않으면 false 반환
	         
			// rs.next()가 true인 동안 ResultSet으로부터 데이터를 추출
			System.out.println("deptno\tdname\t\tcollege\t\tloc");
			while(rs.next()) {
				// 커서가 위치한 행 각각의 컬럼 값 추출
				// ResultSet의 getXXX(컬럼위치), getXXX(컬럼이름) 메소드를 이용해서 컬럼 값을 추출한다.
				int deptno = rs.getInt("DEPTNO");
	            String dname = rs.getString("DNAME");
	            int college = rs.getInt(3);
	            String loc = rs.getString(4);
	            
	            System.out.println(deptno + "\t" + dname + "\t" + college + "\t\t" + loc); 
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if(stmt != null) {
	               stmt.close();
	            }
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}