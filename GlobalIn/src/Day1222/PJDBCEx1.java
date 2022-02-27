package Day1222;

import java.sql.*;

public class PJDBCEx1 {
   public static void main(String[] args) {
	   // PreparedStatement 사용
	   // SQL 쿼리에서 실제 값으로 대체 될 부분을 바인딩 변수 (?)로 처리
	   // ? : DB 에서 SQL 실행 시  실제 값으로 대체된다.
      
	   StringBuffer sql = new StringBuffer();
	   sql.append("insert into professor values(?, ?, ?, ?, ?, sysdate, ?, ?)");
      
	   Connection con = null;
	   PreparedStatement pstmt = null;
      
	   /*
		CREATE TABLE PROFESSOR(
        PROFNO NUMBER(5) NOT NULL,
        NAME VARCHAR(10) NOT NULL,
        ENAME VARCHAR(20) NOT NULL,
        POSITION VARCHAR2(20) NOT NULL,
        SAL NUMBER(4) NOT NULL,
        HIREDATE DATE NOT NULL,
        AGE NUMBER(3) NOT NULL,
        DEPTNO NUMBER(3) NOT NULL,
        CONSTRAINT PROFNO_PK PRIMARY KEY(PROFNO),
        CONSTRAINT DEPTNO_FK FOREIGN KEY(DEPTNO) REFERENCES DEPARTMENT(DEPTNO)
		);
	    */
      
	   try {
		   con = ConnUtil.getConnection();
		   pstmt = con.prepareStatement(sql.toString());
         
		   // 바인딩 변수 설정 ( 쿼리의 ? 에 대체될 값 지정 )
		   // setInt(COL, 값)
		   // setString(COL, 값)
		   pstmt.setInt(1, 9920);
		   pstmt.setString(2, "박병준");
		   pstmt.setString(3, "PARK BYEONG JUN");
		   pstmt.setString(4, "전임교수");
		   pstmt.setInt(5, 500);
		   pstmt.setInt(6, 50);
		   pstmt.setInt(7, 206);
         
		   // 쿼리 실행
		   int result = pstmt.executeUpdate();
		   System.out.println(result + "개 행이 추가되었습니다.");
         
	   } catch (SQLException e) {
		   e.printStackTrace();
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
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
	   }
   }
}