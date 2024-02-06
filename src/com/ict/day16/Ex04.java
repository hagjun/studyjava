package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key 와 Value 를 1:1 매핑하는 구조
		// Key 는 중복 X (기존 Value 삭제)
		// Value 는 중복 O
		// Key 를 호출하면 Value 가 나온다.
		// Key 를 별도로 관리 => KeySet()
		// add() 로 추가 못함.
		// put(Key, Value)로 추가
		// 관련 클래스 : HashMap

		// Key 가 숫자인 경우
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "한국");
		map1.put(1, "중국");
		map1.put(2, "미국");
		map1.put(3, "태국");
		map1.put(10, "영국");
		map1.put(13, "일본");

		// Key 중복(덮어쓰기 가능)
		map1.put(1, "호주");
		// Value 중복(아무 상관없음)
		map1.put(16, "한국");

		System.out.println(map1);

		// 꺼내기를 하려면
		// 무조건 keySet() 사용해야 된다.
		for (Integer k : map1.keySet()) {
			// key 를 호출하면 value 가 나온다.
			System.out.println(map1.get(k));
		}
		System.out.println();

		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			// k 는 키
			Integer k = it.next();
			System.out.println(map1.get(k));

		}
		System.out.println("=================");

		// value 만 구하기
		Collection<String> var = map1.values();
		System.out.println(var);

		System.out.println("=================");

		// entrySet() 메서드는 key 와 value 가 모두 필요한 경우
		Set<Entry<Integer, String>> set1 = map1.entrySet();
		Iterator<Entry<Integer, String>> it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);

		}
	}
}
