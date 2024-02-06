package com.ict.day09;

public class Ex15 {
	String name = "";
	int sum = 0 ;
	double avg = 0.0;
	String hak = "" ;
	
	// 반환형이 있는 메서드
	public String play01(String k1) {
		name = k1 ;
		return name;
	}
	
	// 지역변수 : 값이 사라짐
	public int play02(int kor, int eng, int math) {
		int total = kor + eng + math ;
		return total;
	}
	// 전역변수 
	public int play03(int kor, int eng, int math) {
		sum = kor + eng + math ;
		return sum ;
	}
	
}
