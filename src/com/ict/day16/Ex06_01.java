package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06_01 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 HashMap에 저장시키고
		// 원하는 나라가 key 값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		
		Scanner scan = new Scanner(System.in);
		Map<String , String> map1 = new HashMap<String, String>();
		
		map1.put("대한민국", "서울");
		map1.put("캐나다", "벤쿠버");
		map1.put("영국", "런던");
		map1.put("스위스", "베른");
		
		Set<String> keys = map1.keySet();
		
		ex:while (true) {
			System.out.print("나라 이름 : ");
			String str = scan.next();
			if(keys.contains(str)) {
				String res = map1.get(str);
				System.out.println(str + "의 수도는 " + res + " 입니다. ");
			}else {
				System.out.println("데이터가 없습니다.");
				
				
			}
			
			
			
			
			
			
			
			
			while (true) {
				System.out.print("계속할까요? (y  / n)>>>");
				String res = scan.next();
				if(res.equalsIgnoreCase("y")) {
					continue ex;
				} else if(res.equalsIgnoreCase("n")) {
					break ex;
				} else {
					System.out.println("제대로 입력해주세요.>>>>");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
		
		
				
	}
}
