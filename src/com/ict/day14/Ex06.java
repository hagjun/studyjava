package com.ict.day14;



interface Ex06 {
	int DATA = 1000;
	public void printData();
}
// 상속받은 상태
class Ex06_Test implements Ex06{
	@Override
	public void printData() {
		int data1 = DATA + 100;
		System.out.println("data1 : " + data1);
	}
	
}
// 상속받지 않은 상태 => 내부클래스 이용하는 방법
class Ex06_Test2{
	public void prn() {
		new Ex06() {
			int data2 = DATA + 100;
			@Override
			public void printData() {
				System.out.println("data2 : " + data2);
			}
		}.printData(); // 클래스의 끝(끝나자마자 printData(); 호출)
	} // 메서드
}
