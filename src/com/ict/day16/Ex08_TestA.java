package com.ict.day16;

// 스레드 만들어서 처리 할려면
public class Ex08_TestA extends Thread {
	// main 에 있는 start()도 있고 Ex08_testA에 똑같은 start()가 있으면 start() 로 간다.
	// 싱글스레드
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}
}
