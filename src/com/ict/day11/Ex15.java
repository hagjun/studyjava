package com.ict.day11;

public class Ex15 {
	// static 초기화
	/*
		static {
		  초기화 내용 ;
		}
	 */
	
	int s1 = 100 ;
	private int p1 = 300 ;
	static int s2 ;       // 초기값 : 50000
	static int s3 ;       // 초기값 : 0
	
	public static int k2 = 300 ;
	static int k3 = 300 ;  
	private static int k4 = 500 ; 
	
	// 블록의 위치에 따라 값이 달라진다.
	// 현위치를 기준으로 아래의 값들은 설정을 안해준다.
	// 현위치를 기준으로 값을 바꿔준다 (초기화)
	static {
		s2 = 50000 ;
		k2 = 20000 ;
		m2 = 60000 ;
		j2 = 40000 ;
	}
	// 값 설정 안됨
	static int m2 ; // 값이 들어가 있지 않음(선언만 되있는 상태) / 초기값 60000
	static int j2 = 400 ; // 값이 들어 있음  / 초기값에서 400으로 변경
	

}
