package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toPlay2("홍길동");
		
		// 인터페이스는 객체로 생성 못함
		// Ex11_IBehavior ibe = new Ex_IBehavior();
		
//		Ex11_Soccer soccer = new Ex11_Soccer();
//		Ex11_BaseGuitar baseGuitar = new Ex11_BaseGuitar();
		
		Ex11_IBehavior soccer = new Ex11_Soccer();
		Ex11_IBehavior baseGuitar = new Ex11_BaseGuitar();
		toPlay(baseGuitar);
		System.out.println();
		
		toPlay(new Ex11_Soccer());
	}
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}
	public static void toPlay2(String str) {
		System.out.println(str + " 님 성공");
	}
}
