package com.ict.day13;

enum Type{
	// 객체
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex13 {
	String name ;
	int size ;
	Type type ;
	public static void main(String[] args) {
		Ex13 shose = new Ex13();
		// 값을 삽입시킨 상태
		shose.name = "나이키";
		shose.size = 275;
		shose.type = Type.RUNNING;
		
		
		// shose에 저장된 데이터를 호출할 수 있다.
		System.out.println("이름 : " + shose.name);
		System.out.println("사이즈 : " + shose.size);
		System.out.println("종류 : " + shose.type);
		
	}
}
