package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정열이 안됨
		//      (단, TreeSet은 항상 오름차순을 유지한다.)
		//       주머니 구조라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>(생략가능);
		//      - 집어넣으면 정렬이 안되있기 때문에 나올때 들어간 순서대로 나오지 않는다.
		//      TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>(생략가능);
		//	    - 집어넣으면 정렬이 되어있기 때문에 나올때 들어간 순서대로 나온다.
		// 1. 컬렉션 생성
		
		// HashSet<int> h1 = new HashSet<int>(); <E> => <E>안에 기본자료형 못들어감.
		
		
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2. 컬렉션에 객체 넣기 (add(E e))
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		// int => Integer => 오토박싱 : 기본자료형을 객체로 변경
		h1.add(50);
		// 바로 String 안됨
		// h1.add("60");
		System.out.println(h1.add(10)); // 중복된건 못들어가서 결과값 : false 
		
		
		System.out.println(h1);// 들어간 순서대로 나오지 않음.
		
		// 일반 for 문을 사용 불가
//		for (int i = 0; i < h1.size(); i++) {
//			System.out.println(h1[i]);
//		}
		
		// 개선된 for 문 사용가능
		
		// h4 위치에 있는 것을 처음부터 끝까지 하나씩 Character 위치로 넘김
		// h4 에 있는 것이 두번째 character 로 하나씩 넘김
		// for (Character character : h4) {
		// }
		
		
		//제네릭타입 | 변수
		for (Integer k : h1) {
			System.out.println(k+1000);
		}
		System.out.println();
		
		// while 문 쓰는 방법
		// it 에서 h1에 있는 데이터를 순서대로 하나씩 끄집어냄.
		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) {// 데이터값을 hasNext에 넣었을때 있으면 true / 없으면 false
			int s = it.next(); // next() 로 값을 끄집어냄 => 다음 값이 있으면 끄집어내고 저장한다음 다음으로 넘어감
			System.out.println(s + 5000);
		}
		
		// HashSet<Double> h2 = new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
		
		// h2.add(10); => 오류 발생
		
		double d1 = 3.1;
		double d2 = 10 ;
		
		
		
		
		
		
		
		
		
		
	}
}
