package com.ict.day17;

public class Ex06_Customer implements Runnable {
	private Ex06_Car car;
	public Ex06_Customer (Ex06_Car car) {
		this.car = car; // 구입하고자 하는 car 를 받는다.
	}
	// 이놈을 실행하므로써 Car 클래스에 있는 pop()에 있는 가장 최신거를 가지고 온다.
	@Override
	public void run() { // void => 리턴값 없음
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
