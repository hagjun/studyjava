package com.ict.day16;

public class Ex10 implements Runnable {
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000); // => 3000 = 3초
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("11111111111111111111");
		}
		
	}
}
