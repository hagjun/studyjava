package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 처음에 전체 테이블 보고싶다.
		// DB 갈려면 먼저 DAO 에 가야한다.
		// 전체보기 - 여러줄 - List<VO> 로 나온다.
		List<Ex01_VO> list = Ex01_DAO.getList();
		prn(list);
		// 메서드가 스태틱이 아닐 경우
//		Ex01_Main test = new Ex01_Main();
//		test.prn2(list);

		System.out.println("선택하세요");
		System.out.println("1. members 테이블에 특정 테이터 보기");
		System.out.println("2. members 테이블에 특정 테이터 삽입");
		System.out.println("3. members 테이블에 특정 테이터 삭제");
		System.out.println("4. members 테이블에 특정 테이터 변경");
		System.out.println("5. 로그인 하기");
		System.out.print(">>>>>>>>>>>>>>>>>>   ");

		int menu = scan.nextInt();
		scan.nextLine();
		switch (menu) {
		case 1:
			System.out.print("검색할 idx : ");
			String idx = scan.nextLine();
			// idx 검색 - 기본키 - 하나 - VO 로 나온다.
			// 하나인지 여러개인지 모를때는 여러개로 받자 - 리스트로 받아서 size() 를 체크하자
			Ex01_VO vo = Ex01_DAO.getOne(idx);
			// vo 받는 prn 메서드를 만들자(오버로딩)
			prn(vo);
			break;
		case 2:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("idx : ");
			String idx2 = scan.nextLine();
			System.out.print("id : ");
			String id = scan.nextLine();
			System.out.print("pw : ");
			String pw = scan.nextLine();
			System.out.print("username : ");
			String username = scan.nextLine();
			System.out.print("age : ");
			String age = scan.nextLine();
			// 가입날짜는 오늘 날짜로 sysdate 사용
			// 파라미터가 여러개 - VO 로 만들자
			Ex01_VO vo2 = new Ex01_VO();
			// setter 를 이용하여 받은 정보 넣어주자
			vo2.setIdx(idx2);
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setUsername(username);
			vo2.setAge(age);
			// insert, delete, update 는 결과가 무조건 int
			int res = Ex01_DAO.getInsert(vo2);
			// 삽입 성공 시 테이블 전체 데이터 보기
			if (res > 0) {
				// 위에 있는 list 를 사용하면 DB 갔다온게 아니기 때문에
				// 삽입 성공 후 변경된 테이블을 볼 수 없다.
				// 다시 DB 에 가서 리스트를 가져오자
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			} else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			// 파라미터 - 하나 - String 사용
//			System.out.print("삭제할 idx : ");
//			String idx3 = scan.nextLine();
//			int res2 = Ex01_DAO.getDelete(idx3);
//			if (res2 > 0) {
//				List<Ex01_VO> list3 = Ex01_DAO.getList();
//				prn(list3);
//			}else {
//				System.out.println("삭제 실패");
//			}
//			break;
			// 파라미터 - 하나 - VO 사용
			System.out.print("삭제할 idx : ");
			String idx3 = scan.nextLine();
			// VO 객체를 만들어서 받은 정보를 넣어주자
			Ex01_VO vo3 = new Ex01_VO();
			vo3.setIdx(idx3);
			int res2 = Ex01_DAO.getDelete(vo3);
			if (res2 > 0) {
				prn(Ex01_DAO.getList());
			} else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("idx : ");
			String idx4 = scan.nextLine();
			System.out.print("username : ");
			String username2 = scan.nextLine();
			System.out.print("age : ");
			String age2 = scan.nextLine();
			// 파라미터 - 2개 - VO
			Ex01_VO vo4 = new Ex01_VO();
			vo4.setIdx(idx4);
			vo4.setUsername(username2);
			vo4.setAge(age2);
			int res3 = Ex01_DAO.getUpdate(vo4);
			if (res3 > 0) {
				prn(Ex01_DAO.getList());
			} else {
				System.out.println("수정 실패");
			}
			break;
		case 5:
			System.out.print("id : ");
			String id2 = scan.nextLine();
			System.out.print("pw : ");
			String pw2 = scan.nextLine();
			// 파라미터 - 2개 - VO
			Ex01_VO vo5 = new Ex01_VO();
			vo5.setId(id2);
			vo5.setPw(pw2);
			Ex01_VO vo6 = Ex01_DAO.getLogin(vo5);
			if (vo6 != null) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			break;
		}

	}

	// **static 은 static 만 호출할 수 있다.
	// List<VO> 받는 prn 메서드
	public static void prn(List<Ex01_VO> list) {
		System.out.println("idx\tid\tpw\tusername\tage\tregdate");
		// 리스트면 foreach
		for (Ex01_VO k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getUsername() + "\t");
			System.out.print(k.getAge() + "\t");
			System.out.print(k.getRegdate() + "\n");
		}
	}
	// 스태틱이 싫다면 main 메서드 안에서 객체생성 후 메서드 호출하면 된다.
//	public void prn2(List<Ex01_VO> list) {
//		System.out.println("idx\tid\tpw\tusername\tage\tregdate");
//		//	리스트면 foreach
//		for (Ex01_VO k : list) {
//			System.out.print(k.getIdx()+"\t");
//			System.out.print(k.getId()+"\t");
//			System.out.print(k.getPw()+"\t");
//			System.out.print(k.getUsername()+"\t");
//			System.out.print(k.getAge()+"\t");
//			System.out.print(k.getRegdate()+"\n");
//		}
//	}

	// VO 받는 prn 메서드(오버로딩)
	public static void prn(Ex01_VO vo) {
		System.out.println("idx\tid\tpw\tusername\tage\tregdate");
		System.out.print(vo.getIdx() + "\t");
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getPw() + "\t");
		System.out.print(vo.getUsername() + "\t");
		System.out.print(vo.getAge() + "\t");
		System.out.print(vo.getRegdate() + "\n");
	}
}
