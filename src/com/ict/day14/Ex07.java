package com.ict.day14;

interface Ex07 {
	public void play();
}
class Ex07_Car implements Ex07{
	@Override
	public void play() {
		System.out.println("운전하기");
	}
}
class Ex07_Baseball implements Ex07{

	@Override
	public void play() {
		System.out.println("야구하기");
	}
}
// 인터페이스를 인자로 받는 클래스가 1개 있음.
class Ex07_Land{
	void autoPlay(Ex07 t) {
		t.play();
	}
}
