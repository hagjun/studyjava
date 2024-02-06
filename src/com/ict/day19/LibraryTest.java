package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	private String name;
	private int price;
	
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
}




public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 스트림 생성하고 출력하기
		Stream<Book> p1 = bookList.stream();
		// 모든 책의 가격의 합
		// mapToInt() : 스트림을 IntStream으로 변환해주는 메서드다.
		int sum = bookList.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println("모든 책의 합 : " + sum + "원 입니다.");
		System.out.println();
		
		// 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		bookList.stream().filter(i->i.getPrice()>=20000).map(i->i.getName())
		.sorted().forEach(i->System.out.println("20000원 이상의 책 : " + i));
		
	}
}
