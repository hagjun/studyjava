package com.ict.kk;

public class Ex11 {
	private String name = "홍길동";
	private int age = 37;
	
	public Ex11() {
		System.out.println("기본생성자 : " + this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
