package com.ict.day02;

public class Ex05 {
	public static void main(String[] args) {
		// 크기 비교 ( boolean 만 제외)
		// byte < short < char < int < long < float < double

		// 큰자료형은 작은 자료형을 저장할 수 있다.
		// 작은자료형은 큰 자료형을 저장할 수 없다.

		// 데이터 100 이 int s1에 저장된다.
		int s1 = 100;

		// 변수 s1안에 있는 데이터(100)가 long s2에 저장
		long s2 = s1;

		// 변수 s1안에 있는 데이터(100)가 double s3에 저장
		double s3 = s1;

		char s4 = 'a';

		int s5 = 'a';
	}
}
