package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야 사용가능
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		
		System.out.println(t.name);
		
		// Ex04에 있는 play01메서드를 호출하자.
		// play01이 void이기 때문에 데이터를 가져오지 않는다.
		// System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
		// System.out.println(4);
		
		t.play02();
		// 지역변수에 있는 메서드는 호출하고 되돌아올때 값이 사라져서 데이터를 가져오지 않는다.
		// System.out.println(t.sum);
		
		int k = t.play03() ;
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
	}
}
