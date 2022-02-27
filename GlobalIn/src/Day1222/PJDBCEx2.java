package Day1222;

import java.sql.*;

public class PJDBCEx2 {
   public static void main(String[] args) {
	   StringBuffer sql = new StringBuffer();
	   sql.append("update professor set sal = ? where name = ?");
      
	   Connection con = null;
	   PreparedStatement pstmt = null;
      
	   try {
		   con = ConnUtil.getConnection();
		   pstmt = con.prepareStatement(sql.toString());

		   // setXXX(바인딩 변수의 인덱스, 값)
		   pstmt.setInt(1, 50);
		   pstmt.setString(2, "박병준");
         
		   int result = pstmt.executeUpdate();
		   System.out.println(result + "개의 행이 변경되었습니다.");
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