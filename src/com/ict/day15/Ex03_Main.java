package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03 p1 = new Ex03();
		
		p1.setName("둘리");
		p1.setAge(24);
		
		Ex03 p2 = new Ex03("희동이", 3);
		Ex03 p3 = new Ex03("마이콜", 20);
		
		// 같은 클래스로 만든 여러개 객체들을 모으는 방법은 : 배열, 컬렉션
		// 1. 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		// 2. 컬렉션을 이용
		HashSet<Ex03> set01 = new HashSet<Ex03>();
		set01.add(p1);
		set01.add(p2);
		set01.add(p3);
		set01.add(new Ex03("공실이", 24));
		set01.add(new Ex03("도우너", 14));
		
		// 3. 이름 꺼내기
		// 3-1. 배열
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+"님");
		}
		System.out.println();
		
		// 3-2. 배열(일반적인 for)
		for (Ex03 k : arr) {
			System.out.println(k.getName() + "님께" );
		}
		System.out.println();
		
		// 3-3. 컬렉션(개선된 for 문)
		for (Ex03 k : set01) {
			System.out.println("환영합니다. " + k.getName());
		}
		
		// 3-4. 컬렉션 (Iterator)
		Iterator<Ex03> it = set01.iterator();
		while (it.hasNext()) {
			Ex03 ex03 = it.next();
			System.out.println(ex03.getName()+" ^^");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
