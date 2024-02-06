package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Car {
	// 차를 판매할때 사용하는 carList
	// 판매할 차를 가지고 있는 공간
	private List<String> carList = null; // Ex06_Car 생성하자마자 carList가 만들어진다.
	
	// 객체를 생성하면 carList 컬렉션이 만들어진다.
	public Ex06_Car() {
		carList = new ArrayList<String>();
	}
	
	// 해당 메서드를 실행하면 carName을 반환한다.
	// 차 생산
	public String getCar() {
		String carName = null; // 리턴값 String
		switch ((int)(Math.random() * 3)) {// 0, 1, 2 = 0부터 2까지 나옴
		case 0: carName = "SM5"; break;
		case 1: carName = "매그너스"; break;
		case 2: carName = "카렌스"; break;
			
			
		}
		
		return carName;
		
	}
	// 판매하는 놈
	public synchronized String pop() {
		String carName = null; // 리턴값 String 
		if(carList.size()==0) { // carList의 크기가 0이면 wait()
			try {
				System.out.println("차가 없어요 생산할때 까지" + " 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// carList가 0이 아니면 실행
		// carList.size() -1 : carList가 가지고 있는 것 중에 맨 마지막에 있는 놈 삭제(판매된것)
		carName = (String)carList.remove(carList.size() -1);
		
		System.out.println("손님이 차를 사갔습니다.. " + 
							"손님이 구입한 차이름은=>\" " + carName+"\"");
		return carName;
	}
	
	public synchronized void push(String car) {
		carList.add(car); // 리스트에 추가(add)
		System.out.println("차가 만들어 졌습니다. " +
						"차이름은\" " + car +"\"");
		
		if(carList.size()==5) { // carList의 크기가 5가될때 깨워라
			this.notify();
		}
		
		
	}

}
