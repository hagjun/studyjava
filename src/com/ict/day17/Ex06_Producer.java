package com.ict.day17;

public class Ex06_Producer implements Runnable {
	private Ex06_Car car; // 전역변수
	
	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}
	//차를 생산해서 push에 삽입
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar(); // getCar 하는 순간 Ex06_Car 에 있는 값 아무거나 가지고 온다.
			car.push(carName); // 이름을 받아와서 차를 만듦 / carName 추가
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
