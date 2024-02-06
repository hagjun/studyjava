package com.ict.day06;


public class Ex04 {
	public static void main(String[] args) {
		// break와 break label
		// break : 현재 위치의 블록을 탈출
		// break label : 레이블이 지정한 블록을 탈출
		
		// 레이브 : 반복문 앞에 '이름' 붙이면 된다.
		
		//1 ~10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			if(i==6 ) break;
			System.out.print(i+ " ");
			
		}
		//1 ~10 출력
		// 반복문 앞에 label이름뒤 : 을 붙인다.
		// for문에는 break label를 붙일 이유가 없다.
		System.out.println();
		
		exit: for (int i = 1; i < 11; i++) {
			if(i==6) break exit;
			System.out.print(i+ " ");
			
		}
		System.out.println();
		
		System.out.println("다중 for문 break label 사용하기");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2) break;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		exit:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2) break exit;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
