package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA testA = new Ex09_TestA();
		Ex09_TestB testB = new Ex09_TestB();
		
		
		// Runnable() 은 start()가 없으므로 사용불가
		// 하지만 start 를 사용해야 하기 때문에
		// Thread 를 사용해서 start 를 써줘야 한다.
		// start / run 순서
		// testA.start();
		
		// Runnable 을 상속받은 클래스를 인자로 넣자.
		// Thread 는 start 를 갖고 있다.
		Thread t1 = new Thread(testA); 
		t1.start();// => Runnable 이 가지고 있느 run으로 간다.
		
		// 익명
		new Thread(testB).start();
		
		// 익명 : 안드로이드 식
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : " + Thread.currentThread().getName());
				}
			}
		}).start();
		
	}
}
