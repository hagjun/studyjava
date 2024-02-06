package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// Scanner 로 번호, 이름, 주소, 전화번호 받아서 customer 테이블에 삽입하기

		

		Scanner scan = new Scanner(System.in);

		System.out.println("정보를 입력하세요");
		System.out.println("번호 : ");
		int num = scan.nextInt();
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("주소 : ");
		String add = scan.next();
		
		System.out.println("전화번호 : ");
		String phone = scan.next();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into customer values (?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			;
			pstmt.setString(3, add);
			;
			pstmt.setString(4, phone);
			;

			res = pstmt.executeUpdate();

			if (res > 0) {
				System.out.println("삽입 완료");
				sql = "select * from customer";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("삽입 실패");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {
			}
		}

	}
}