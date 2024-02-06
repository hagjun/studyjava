package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		t1.play02("일지매", 80, 85, 85);
		
		
		Ex13 t2 = new Ex13();
		t2.play02("임꺽정", 100, 95, 95);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		t2.play02(name, kor, eng, math);
	
		
		
	}
}
