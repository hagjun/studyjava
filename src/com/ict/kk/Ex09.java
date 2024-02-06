package com.ict.kk;

public class Ex09 {
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	public Ex09() {
		System.out.println("기본생성자사용");
		name = "호돌";
		addr = "LA";
	}

	public Ex09(String name) {
		this.name = name;
	}

	public Ex09(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Ex09(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// getter / setter
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
	
}
