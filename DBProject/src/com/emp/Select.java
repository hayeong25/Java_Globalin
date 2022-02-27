package com.emp;

import java.sql.*;

// select
public class Select {
   public static void main(String[] args) {
      StringBuffer sql = new StringBuffer();
      sql.append("select no, name, jobgrade, department, email from employee");
      
      
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;

      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버에 성공적으로 연결했습니다.");
         
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
         System.out.println("DB 연결 성공");
         stmt = con.createStatement();
         
         rs = stmt.executeQuery(sql.toString());

         while(rs.next()) {
            int no = rs.getInt(1);
            String name = rs.getString(2);
            String jobgrade = rs.getString(3);
            int department = rs.getInt(4);
            String email = rs.getString(5);
            
            System.out.println("사원번호\t이름\t직급\t부서\t이메일\t");
            System.out.println(no + "\t" + name + "\t" + jobgrade + "\t" + department + "\t" + email);
         }
         
      } catch (ClassNotFoundException e) {
         System.out.println("드라이브 연결 실패");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("DB 연결 실패");
         e.printStackTrace();
      } finally {
         try { if(rs != null) rs.close(); } catch (SQLException e2) { e2.printStackTrace(); }
         try { if(stmt != null) stmt.close(); } catch (SQLException e2) { e2.printStackTrace(); }
         try { if(con != null) con.close(); } catch (SQLException e2) { e2.printStackTrace(); }
      }
   }
}