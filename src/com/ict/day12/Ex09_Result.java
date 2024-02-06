package com.ict.day12;

public class Ex09_Result extends Ex09_Cale {
	double result;
	
	@Override
	public void plus(double k1, double k2) {
		result = k1 + k2;
	}

	@Override
	public void minus(double k1, double k2) {
		result = k1 - k2;
	}

	@Override
	public void multiplication(double k1, double k2) {
		result = k1 * k2;
	}

	@Override
	public void division(double k1, double k2) {
		result = k1 / k2;
	}

}
