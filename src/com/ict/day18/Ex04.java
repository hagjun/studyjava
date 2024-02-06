package com.ict.day18;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 정수배열을 스트림으로 활용하기
		int[] arr = {1, 2, 3, 4, 5};
		int sumVal = Arrays.stream(arr).sum();
		
		// count 의 반환형이 long 이어서 int 로 형변환해야 함.
		int count = (int) Arrays.stream(arr).count(); 
		
		System.out.println("합계 :" + sumVal);
		System.out.println("총 갯수 :" + count);
	}
}
