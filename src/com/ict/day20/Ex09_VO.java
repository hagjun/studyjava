package com.ict.day20;

import java.io.Serializable;

// 객체의 정보를 담을 수 있는 멤버변수로 구성
// 1. Serializable 인터페이스를 구현(추상메서드가 없다.)
//    멤버필드가 모두 객체 직렬화 대상이 된다.
//    직렬화 대상에서 제외 시키려면 멤버앞에 transient 예약어 사용. 
//    transient 사용하면 객체나 String => null, int => 0, double => 0.0, boolean => false
public class Ex09_VO implements Serializable {
	private String name;
	private int age;
	private double weight;
	private boolean gender;

	public Ex09_VO() {
	}

	public Ex09_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
