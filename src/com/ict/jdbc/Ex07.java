package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner scan = new Scanner(System.in);
		int result = 0;
		try {
			System.out.println("검색번호 받기 : ");
			int custid = scan.nextInt();

			// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다르다.
			// oracle.jdbc.driver : 패키지 명
			// OracleDriver : 클래스명
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 회사에서 제공하는 driver

			// 5. 오라클과 연결하기 위한 정보
			// 영어 대/소문자 구별 localhost: DB주소가 들어감
			String Url = "jdbc:oracle:thin:@localhost:1521:xe";// 회사에서 지정함.
			String user = "c##ictedu";
			String password = "1111";
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(Url, user, password);

			// String sql = "select * from customer";
			// ? : 동적 바인딩 변수 => 지금은 값을 모르고 실행할 때 값을 알 수 있다.
			String sql = "select * from customer where custid = ?";

			pstmt = conn.prepareStatement(sql);

			// ?를 처리하자.
			// Scanner 일때 변수값을 넣고 아니면 보고 싶은 인덱스를 넣어준다.
			pstmt.setInt(1, custid);

			// 9. 보내서 결과 받기
			// 9-1. select 문인 경우 (select문인 경우 Resultset 으로 받아야 됨)
//			rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			// 9-2. insert, update, delete인 경우
			// result = pstmt.executeUpdate();

			while (rs.next()) {// next() : 다음꺼 있니 물어봄
				// rs.getInt(필드 갯수)
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}

		}
	}
}
