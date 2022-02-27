package Day1222;

import java.sql.*;

public class PJDBCEx3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// Drive 로딩 및 DB 연결
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement("select a.name, a.profno, a.position, " + "b.dname from professor a, " + "department b where " + "a.deptno = b.deptno and a.deptno = ?");
			
			// ?(바인딩 변수)에 대체할 실제 값을 지정
			pstmt.setInt(1, 206);
			
			// 쿼리 실행 후 결과 집합 얻기
			rs = pstmt.executeQuery();
			
			// 결과 집합에서 값 추출
			while(rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("position") + "\t");
			}
			
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
	}
}