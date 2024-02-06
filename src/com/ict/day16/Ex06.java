package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.Set;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 HashMap에 저장시키고
		// 원하는 나라가 key 값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		// 1. 방법1
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		// 방법2
//		map.put("대한민국", "대한민국의 수도는 서울입니다.");
//		map.put("캐나다", "캐나다의 수도는 오타와입니다.");
//		map.put("영국", "영국의 수도는 런던입니다.");
//		map.put("스위스", "스위스의 수도는 베른입니다.");

		Set<String> keys = map.keySet();

		ex: while (true) {

			System.out.println("나라 입력 : ");
			String str = scan.next();
			// 방법 1
			if (keys.contains(str)) { // contains => 검색해서 찾는 기능
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다. ");
			} else {
				System.out.println("데이터가 없는 나라");
			}
//			if(map.get(str) != null ) {
//				System.out.println(map.get(str));
//
//			} else {
//				
//				System.out.println("데이터가 없습니다."); 
//			}

			while (true) {

				System.out.println("계속할까요? (1.yes / 2.no)");
				int k = scan.nextInt();
				if (k == 1) {
					continue ex;
				} else if (k == 2) {
					break ex;
				} else {
					System.out.println("제대로 입력해주세요");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.!!!");

	}

}
