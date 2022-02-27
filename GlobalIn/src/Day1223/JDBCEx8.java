package Day1223;

import java.sql.*;
import Day1222.ConnUtil;

/*
	Transaction
	INSERT, UPDATE, DELETE 등의 작업들을 하나의 논리적인 작업 단위로 묶어서
	쿼리 실행 시 모든 작업이 정상적으로 처리된 경우에는 COMMIT을 실행해 DB에 반영하고
	쿼리 실행 중 하나라도 정상적으로 처리되지 않을 경우 ROLLBACK을 실행해 작업 단위 내의 모든 작업을 취소
*/

public class JDBCEx8 {
	public static void main(String[] args) {
		// 작업 1 : 추가
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?, ?, ?, ?)");
		
		// 작업 2 : 학과번호를 조건으로 하여 학과명, 호관 수정
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ?");
		
		// 작업 1과 작업 2를 하나로 묶어서 처리하는 것이 Transaction
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try { // Transaction 시작
			con = ConnUtil.getConnection();
			
			con.setAutoCommit(false); // autoCommit 기능 비활성화
			
			// 작업 1 시작
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			// 작업 1 종료
			
			// 작업 2 시작
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// 작업 2 종료
			
			con.commit(); // 쿼리가 정상적으로 실행된 경우 DB에 반영
			System.out.println("DB에 정상적으로 반영되었습니다.");
			
		} catch (SQLException s) {
			try {
				// 쿼리가 정상적으로 실행되지 않았을 경우 DB 반영 취소
				con.rollback();
				System.out.println("DB 반영이 취소되었습니다.");
			} catch (SQLException ss) {
				s.printStackTrace();
			}
		} finally { // 모든 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ss) {
				
			}
			
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException ss) {
				
			}
		}
	}
}