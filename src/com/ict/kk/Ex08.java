package com.ict.kk;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수 : ");
		int su = scan.nextInt();
		
		Ex07[] arr = new Ex07[su];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = scan.next();

			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();

			Ex07 p = new Ex07(name, kor, eng, math);
			
			arr[i] = p;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j)
					continue;
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		
		Ex07 tmp = new Ex07();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.print(arr[i].rank + "\t");
		}
	}
}
