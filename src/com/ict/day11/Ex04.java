package com.ict.day11;


public class Ex04 {
	public static void main(String[] args) {
		// 객체 생성할 떄 큰뿔소, 3살, 살아있음을 만들자
		Ex03 ex03 = new Ex03();
		
		System.out.println("이름 : " + ex03.getName());
		System.out.println("나이 : " + ex03.getAge());
		if(ex03.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		
	}
}
