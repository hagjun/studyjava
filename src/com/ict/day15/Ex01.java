package com.ict.day15;

public class Ex01 {
/*
	제네릭과 컬렉션(자료구조)
	제네릭 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체타입
	컬렉션 : 객체들을 모아서 저장 관리하는 인터페이스들을 말한다.
	
	 변수  => 하나의 데이터를 저장할 수 있는 공간
	 배열  => 같은종류의 자료형을 저장
	         크기를 먼저 지정해야 된다. 단점/변경 불가.
	        변수와 객체를 여러개를 저장할 수 있다.
	 클래스 => 배열은 같은 종류의 자료형을 저장하는 것이 불편해서 클래스에 저장하면
	         다양한 종류의 데이터를 저장할 수 있다.
	 컬렉션 => 다양한 종류의 데이터를 저장한 클래스를 하나의 객체로 만들고
	         그 객체를 컬렉션에 저장한 후 관리까지 할 수 있는 인터페이스들 이다.
	 형식) 컬렉션<제네릭>
	 API : <T> = T : 객체 타입(Type), <E> => 요소(Element), 컬렉션안에 존재하는 객체 하나 하나를 뜻함.
	      Map 형식 : <K,V> => Key(키값), Value(데이터값)
	      1(T) : 1(V) 대응 , **Key 를 호출하면 Value 이 나온다.
	 
	 최상위 컬렉션 Collection<E>, Map<K,V>
	 Collection<E> 를 상속 받은 인터페이스들 : Set<E>, List<E>, Queue<E>
	 
	 Collection 의 주요 메서드
	 add(E e) : boolean(결과) => 해당 컬렉션에 인자로 받은 요소를 추가, 성공하면 true, 실패하면 false
	 addAll(Collection< ? extends E> c) : boolean
	       => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	 clear() : void => 모든 요소 제거
	 contains(Object o) : boolean => 인자로 들어온 객체가 포함되어 있으면 true
	 isEmpty() : boolean => 비어져 있으면 true
	 remove(Object o) : boolean => 인자로 들어온 객체만 삭제, 성공하면 true
	 size() : int => 컬렉션 안에 존재하는 Element 의 수
	 toArray() : Object[] => 컬렉션을 배열로 만들어준다.
	             반대 개념 => Arrays.asList() => 배열을 ArrayList 컬렉션으로 만들어준다.
	 
	 ** iterator() : Iterator<E> => 컬렉션안에 존재하는 객체들을 순서대로 접근하기 위해서 
	 *                              Iterator 객체를 반환
	 *                              컬렉션안에 존재하는 객체들을 하나씩 꺼내서 작업할때 사용
   
 */
}
