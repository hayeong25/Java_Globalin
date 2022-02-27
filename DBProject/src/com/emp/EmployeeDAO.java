package com.emp;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {
	// 1. 새로운 사원 등록 메소드
	public EmployeeVO getEmployeeRegister(EmployeeVO evo) throws Exception {
		// 2. 데이터 등록 처리를 위한 쿼리문 작성
		String DML = "insert into employee values(employee_seq.nextval, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		
		try {
			// 3. DBUtil 클래스의 getConnection() 메소드로 DB와 연결
			con = DBUtil.getConnection();
			
			// 4. 입력받은 사원정보를 처리하기 위한 쿼리문 생성
			pstmt = con.prepareStatement(DML);
			
			// 각 바인딩 변수에 자료형을 맞춰 값 지정
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			// 5. 쿼리문 수행 후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			
			retval.setStatus(i + " "); // 쿼리문 수행 후 결과를 EmployeeVO에 저장
			
		} catch (SQLException se) {
			System.out.println("se = [" + se + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e2) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				
			}
		}
		return retval;
	}
	    
	// 사원번호, 사원이름을 입력받아 사원정보를 조회하는 메소드
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {
	       
		String DML = "select * from employee where no = ? and name = ?";
	       
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
	       
		// DB 연결
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(DML);
	          
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
	          
			rs = pstmt.executeQuery();
	          
			if(rs.next()) {
				// DB에 저장되어 있는 값을 가져옴
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException s) {
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				
			}
	    	   
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				
			}
		}
		return retval;
	}
	
	// 사원의 사원번호를 입력받아 정보를 조회하는 메소드
	public EmployeeVO getEmployeeNo(int no) throws Exception {
		String DML = "select * from employee where no = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(DML);
			
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception s) {
			s.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				
			}
	    	   
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				
			}
		}
		return retval;
	}
	
	// 사원의 이름을 입력받아 정보를 조회하는 메소드
	public EmployeeVO getEmployeeName(String name) throws Exception {
		
		String DML = "select * from employee where name = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(DML);
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception s) {
			s.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				
			}
	    	   
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				
			}
		}
		return retval;
	}
	
	// 전체 사원의 정보 출력하는 메소드
	public ArrayList<EmployeeVO> getEmployeetotal() {
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		String DML = "select * from employee";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO emVO = null;
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(DML);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				emVO = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				list.add(emVO);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception s) {
			s.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				
			}
	    	   
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				
			}
		}
		return list;
	}
	
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<String>();
		
		String sql = "select * from employee";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for (int i = 1; i <= cols; i++) {
				columnName.add(rsmd.getColumnName(i));
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception s) {
			s.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
				
			}
	    	   
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
				
			}

			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException s) {
				
			}
		}
		return columnName;
	}
}