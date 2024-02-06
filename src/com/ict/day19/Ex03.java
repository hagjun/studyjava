package com.ict.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 병렬처리 : parallelStream() 
		List<String> list = Arrays.asList("사원1", "사원2", "사원3", "사원4", "사원5");
		
		// 병렬처리 할 Stream생성
		Stream<String> ps1 = list.parallelStream();
		Stream<String> ps2 = list.parallelStream();
		
		// 병렬처리 유무를 체크 : isParallel() => 병렬처리하면 true.
		System.out.println("ps1 = " + ps1.isParallel());
		System.out.println("ps2 = " + ps2.isParallel());
		System.out.println();
		
		// 병렬처리를 직접처리로 변경
		Stream<String> ps3 = ps1.sequential();
		System.out.println("ps1 = " + ps1.isParallel());
		System.out.println("ps2 = " + ps2.isParallel());
		System.out.println("ps3 = " + ps3.isParallel());
		System.out.println();
	}
}
