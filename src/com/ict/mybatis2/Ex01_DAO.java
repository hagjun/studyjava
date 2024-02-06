package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DAO : DB처리하는 놈
public class Ex01_DAO {
//	//	실제로 DB 처리하는 클래스

	// DB 처리하기 위해서 SQL 세션이 필요하다
	private static SqlSession ss;

	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// mapper 가기위해서 세션 사용
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}

	// DB 처리하는 메서드들

	// 전체 테이블 보는 메서드
	// List<Ex01_VO> list = Ex01_DAO.getList();
	// 메인에서 복사해서 가져와서 쓰자
	public static List<Ex01_VO> getList() {
		List<Ex01_VO> list = null;
		// 여러줄이면 selectList()
		// namespace.id
		// 테이블이름.메서드이름 가지고 메퍼로 가자
		list = getSession().selectList("Members.selectAll");
		// select 는 id, resultType, parameterType 3개가 있다.
		return list;
	}

	// idx 받아서 특정 데이터 보기
	public static Ex01_VO getOne(String idx) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("Members.selectOne", idx);
		return vo;
	}

	// 정보 받아서 데이터 삽입
	public static int getInsert(Ex01_VO vo2) {
		int res = 0;
		res = getSession().insert("Members.insert", vo2);
		// **삽입 성공하면 반드시 저장해주자
		if (res > 0) {
			ss.commit();
		}
		return res;
	}

	// idx 받아서 특정 데이터 삭제
	public static int getDelete(String idx3) {
		int res = 0;
		res = getSession().delete("Members.delete", idx3);
		// **삭제 성공하면 반드시 저장해주자
		if (res > 0) {
			ss.commit();
		}
		return res;
	}

	// VO 받아서 특정 데이터 삭제
	public static int getDelete(Ex01_VO vo3) {
		int res = 0;
		res = getSession().delete("Members.delete2", vo3);
		// **삭제 성공하면 반드시 저장해주자
		if (res > 0) {
			ss.commit();
		}
		return res;
	}

	// VO 받아서 특정 데이터 수정
	public static int getUpdate(Ex01_VO vo4) {
		int res = 0;
		res = getSession().update("Members.update", vo4);
		// **수정 성공하면 반드시 저장해주자
		if (res > 0) {
			ss.commit();
		}
		return res;
	}

	public static Ex01_VO getLogin(Ex01_VO vo5) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("Members.login", vo5);
		// pw를 얻어내자 (db에 암호화가 되어있다.)
		String pw = vo.getPw();
		if (vo != null) {

			// 우리가 입력한 pw를 암호화 하자(나중에)
			// String s_pw = vo5.getPw().암호화 메서드

			// db에서 꺼낸 pw와 암호화 된 pw를 비교하자 (나중에)
			// 이것이 true 성공, false이면 실패
			// true
			boolean res = true;

			if (res) {
				return vo;
			} else {
				return null;
			}
		} else {
			return null;

		}

	}

}
