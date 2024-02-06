package com.ict.day12;

public class Ex04_Main {
	public static void main(String[] args) {
		// 자식 클래스를 객체 생성하면 (생성자 호출)
		// 자식 클래스의 부모클래의 생성자를 호출
		Ex04_Game t1 = new Ex04_Game();
		
		
		// 게임하기
		t1.play();
		// 자식클래스에게 없지만 부모클래스에 있으므로 사용 가능
		t1.sound();
		// 부모의 부모클래스에 존재해도 사용 가능
		t1.call();
		t1.sms();
		
		System.out.println(t1.number);
		
		
	} 
	
}
