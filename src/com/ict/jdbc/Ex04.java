package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// customer 테이블 이강인 데이터 삭제하고 화면에 보이기
		// 자바는 오토커밋 자동으로 커밋이 된다.
		// 오라클에서 커밋을 안하게 되면 자바에서는 데이터값이 다르게 보인다.
		
		// 오라클에 접속을 위한 초기값 설정
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from customer where custid = 6 ";
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			if (result>0) {
				System.out.println("삭제 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			} else {
				System.out.println("삭제 실패");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
