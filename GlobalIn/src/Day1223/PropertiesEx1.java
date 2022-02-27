package Day1223;

import java.sql.*;
import java.io.*;
import Day1222.ConnUtil;
import java.util.*;   // Properties

public class PropertiesEx1 {
	public static void main(String[] args) throws SQLException, IOException {
      
		Properties pro = new Properties();
		// Properties 객체의 load() 메소드를 이용하여 설정된 파일을 불러온다.
		pro.load(new FileInputStream("src/department.properties"));
      
		Connection con = null;
		PreparedStatement pstmt = null;
      
		try {
			// Driver, DB 로드 및 연결
			con = ConnUtil.getConnection();
         
			//department.properties 파일에 정의된 쿼리문을 불러온다.
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
         
			// 바인딩 변수 지정
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
         
			// 쿼리 실행
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				s.printStackTrace();
			}
			
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
	}
}