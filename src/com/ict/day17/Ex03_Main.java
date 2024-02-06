package com.ict.day17;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		// 스레드가 여러개일 경우 순서가 뒤죽박죽으로 된다.
		//                       임계 영역의 단점
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
		
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
