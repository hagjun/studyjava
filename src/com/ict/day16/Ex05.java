package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("주소", "충청북도");
		map.put("취미", "운동");
		
		System.out.println(map.get("이름")); // value 값
		System.out.println(map.get("주소")); // value 값
		System.out.println();
		
		for (String k : map.keySet()) {
			System.out.println(k); // key 값
			System.out.println(map.get(k)); // value 값
		}
		System.out.println();
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k =  it.next(); // 키값
			System.out.println(k + ":" + map.get(k));
			
		}
		
		
	}
}
