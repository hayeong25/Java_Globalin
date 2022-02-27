package Day1223;

import java.io.*;
import java.sql.*;
import Day1222.ConnUtil;

/*
	ResultSetMetaData
	MetaData는 데이터의 구성요소를 나타냄
	ResultSetMetaData는 ResultSet을 구성하는 모든 요소를 알아낼 수 있는 메소드를 제공
*/

public class JDBCEx9 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 쿼리를 키보드로 입력받아서 처리
		
		System.out.print("쿼리문 입력 : ");
		String sql = br.readLine();
		
		// DB 연결
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		// 쿼리 실행 결과 집합의 부가 정보를 가지고 있는 ResultSetMetaData 객체 얻기
		ResultSetMetaData rsmd = rs.getMetaData();
		
		// 컬럼 개수가 몇 개인지
		System.out.println("컬럼의 개수 : " + rsmd.getColumnCount());
		System.out.println();
		
		// 컬럼의 이름 알아보기
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		
		// 컬럼 타입 알아보기
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		
		int ColumnCnt = rsmd.getColumnCount();
		
		while(rs.next()) {
			for(int ColNum = 1; ColNum <= ColumnCnt; ColNum++) {
				int ColType = rsmd.getColumnType(ColNum);
				switch(ColType) {
				case Types.NUMERIC :
					System.out.print(rs.getInt(ColNum) + "\t");
					break;
				case Types.VARCHAR :
					System.out.print(rs.getString(ColNum) + "\t");
					break;
				case Types.DATE :
					System.out.print(rs.getDate(ColNum) + "\t");
					break;
				}
			}
			System.out.println();
		}
		
		br.close();
		rs.close();
		pstmt.close();
		con.close();
	}
}