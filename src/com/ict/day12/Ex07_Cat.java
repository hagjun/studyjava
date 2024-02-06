package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal {
	int id = 124123;
	
	public Ex07_Cat() {
		// super(); 생략되어 있다.
		// super : 부모 클래스의 주소를 참조 
		// super([인자]) : 부모클래스의 생성자
		// 생성자를 만들경우
		// 생성자에 맞는 super을 사용해야 됨
		super("짜오", 3);
		System.out.println("자식생성자");
		
	}
	// 모든 자식 클래스는 부모클래스의 생성자를 참조해야 한다.
	public Ex07_Cat(String name) {
		// super()와 this(([인자]))는  둘다 첫줄에만 사용가능
		// 즉, 둘 중에 하나만 사용가능
		super(name, 7);
		// this();
	}
	
	public Ex07_Cat(int age) {
		this(); //  
	}
}
