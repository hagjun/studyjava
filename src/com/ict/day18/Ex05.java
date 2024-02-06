package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList를 Stream 으로
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.print(i + " "));
		System.out.println();
		
		// 중간처리 : 정렬 = sorted()(오름차순), sorted(Comparator.reverseOrder())(내림차순)
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i-> System.out.print(i + " "));
		System.out.println();

		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 정렬 오름차순 : 순서 (한글 => 소문자 => 대문자 => 숫자)
		Stream<String> stream4 = Stream.of(new String[] {"bb", "a", "0", "CC", "3", "dd", "BB", "aaa", "가", "라", "마"});
		stream4.sorted().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		// 정렬 내림차순 : 순서 (숫자 => 대문자 => 소문자 => 한글)
		Stream<String> stream5 = Stream.of(new String[] {"bb", "a", "CC", "dd", "BB", "aaa", "마", "라", "가", "0", "3",});
		stream5.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 정렬 오름차순  
		// 같은 단어에 대소문자만 다를 때는 먼저 생성된 것이 먼저 나온다. reversed() 상관없이!!!
		Stream<String> stream6 = Stream.of(new String[] {"BB", "a", "CC", "dd", "bb", "aaa", "마", "라", "가", "0", "3",});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 정렬 내림차순  
		// 같은 단어에 대소문자만 다를 때는 먼저 생성된 것이 먼저 나온다.
		Stream<String> stream7 = Stream.of(new String[] {"BB", "a", "CC", "dd", "bb", "aaa", "마", "라", "가", "0", "3",});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
