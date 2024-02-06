package com.ict.mybatis2;

public class Ex01_VO {

	private String idx, id, pw, username, age, regdate;
	
	public Ex01_VO() {}

	public Ex01_VO(String idx, String id, String pw, String username, String age, String regdate) {
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.username = username;
		this.age = age;
		this.regdate = regdate;
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
	
}
