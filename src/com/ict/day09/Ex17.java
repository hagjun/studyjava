package com.ict.day09;

public class Ex17 {
	String name ;
	int age ;
	double result ;
	int res;
	
	// +(더하기)
	public void plus(int k1, int k2) {
		res = k1 + k2;
	}
	// -(빼기)
	public void sub(int k1, int k2) {
		res = k1 - k2 ;
	}
	// *(곱하기)
	public int mul(int k1, int k2) {
		res = k1 * k2;
		return res  ;
		
	}
	// /(나누기)
	public double div(int k1, int k2) {
		result = (int)((k1 * 1.0)/k2 * 10)/10.0 ;
		return result ;
	}
}
