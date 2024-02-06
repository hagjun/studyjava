package com.ict.day13;



class Ex11_Sport {
	
	String addr = "서울";
	int count = 11;
	
	public void addr(String str) {
		addr = str; 
	}
	public void count(int su) {
		count = su;
	}
}

class Ex11_Soccer extends Ex11_Sport implements Ex11_IBehavior{

	@Override
	public void play() {
		System.out.println("축구 시작 ~~~");
	}
	
}