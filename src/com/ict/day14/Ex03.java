package com.ict.day14;

// Local 내부클래스
public class Ex03 {
	String name = "둘리";
	private int age = 3;
	
	public Ex03() {
		System.out.println("외부 : " + this);
	}
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	// 내부클래스를 가지고 있는 메서드
	public void play() {
		int age = 147;
		int cnt = 10;
		
		class Inner02{
			String addr = "서울"; // => addr (전역변수)
			public Inner02() {
				System.out.println("내부 : " + this);
			}
			
			public void like() { 
				System.out.println(name);
				System.out.println(age); // => age(지역변수)
				// 외부클래스의 this 와 내부클래스의 this 가 다르다.
				//System.out.println(this.age); => 여기의 this 는  Inner02 를 가지고 온다.
				//                                 Ex02 의 this 는 가지고 올 수 없다.
				System.out.println(this.addr);
				
				// 외부클래스의 메서드 사용 가능
				 sound();
				
			}// 내부 메서드 끝
			public void setA(int k) {
				System.out.println(k);
			}
			// 외부클래스의 메서드 사용 불가
			//sound(); // 오류발생 (body 추가)/ 메서드 생성해야됨
	
		}// 내부 클래스 끝
		Inner02 inner02 = new Inner02();
		// System.out.println(name);
		// System.out.println(this.age); // this 를 붙이면 외부클래스를 가지고 올 수 있다.
		inner02.like(); 
		System.out.println("================");
		inner02.setA(this.age);
	}// 외부 메서드 끝

}// 외부 클래스 끝









