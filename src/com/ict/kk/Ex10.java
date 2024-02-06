package com.ict.kk;

public class Ex10 {
	public static void main(String[] args) {
		
	Ex09 ex09 = new Ex09();
	System.out.println("이름 : "+ ex09.getName());
	System.out.println("나이 : "+ ex09.getAge());
	System.out.println("주소 : "+ ex09.getAddr());
	System.out.println();
	
	Ex09 ex092 = new Ex09("땡구");
	System.out.println("이름 : "+ ex09.getName());
	System.out.println("나이 : "+ ex09.getAge());
	System.out.println("주소 : "+ ex09.getAddr());
	System.out.println();

	Ex09 ex093 = new Ex09("땡구");
	System.out.println("이름 : "+ ex09.getName());
	System.out.println("나이 : "+ ex09.getAge());
	System.out.println("주소 : "+ ex09.getAddr());
	System.out.println();
	}

}
