package com.ict.kk;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01("호빵맨", 1);
	
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
		System.out.println();
		
		ex01.setName("식빵맨");
		ex01.setAge(12);
		ex01.setAddr("서울시");
		
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
		System.out.println();
	}
}
