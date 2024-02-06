package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng : " + k1);
		System.out.println("COM : " + k2);
		
		
		// Ex01 클래스를 객체로 만들자
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자로 만든다.
		// 클래스이름() => 인자가 없는 생성자를 기본생성자라고 한다.
		
		// Ex01 t = new 생성자([인자]);
		// 인스턴스는 객체 t를 생성해야지만 호출가능 하다.
		   Ex01 t = new Ex01();
		   System.out.println(t);
		   System.out.println(t.name);
		   System.out.println(t.kor);
		   System.out.println(t.MATH);
		   
		   // ** 권장 사항
		   // 클래스 이름
		   System.out.println("eng : " + k1);
		   System.out.println("com : " + k2);
		   System.out.println();
		   
		   // 참조 변수
		   System.out.println(t.eng);
		   System.out.println(t.COMPUTER);
		   System.out.println();
		   
	    // 변수와 상수
		// 	  변수이므로 데이터 변경가능
		   t.kor = 90;
		   System.out.println(t.kor);
		   
		//    상수이므로 데이터 변경불가
		//    t.MATH = 100;
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
