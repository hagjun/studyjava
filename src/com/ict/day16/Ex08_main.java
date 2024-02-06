package com.ict.day16;

public class Ex08_main {
	public static void main(String[] args) {
		System.out.println("main : " +Thread.currentThread().getName());
		
		// 병행 처리 (결과 : 뒤죽박죽)
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();
		
		
		testA.start(); // 스레드를 상속받아서 start()(사용가능) 
					   // => Ex08_TestA의 run()으로 가서 일(Thread)을 만들어 주고 다시 돌아온다. 
				       // 이때, Ex08_TestA의 run()은 계속 돌고 있는 상태
		               // => main 은 이미 일(Thread)이 끝난 상태 
		
		
		testB.start();
		testC.start();
		
		
		
		
		
		System.out.println("수고하셨습니다.");
	}
}
