package com.ict.kk;

import java.util.Scanner;

public class study {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int s = sc.nextInt();
		String res = "";
		if(s%2==0) {
			res = "짝수";
		} else {
			res = "홀수";
		}
		System.out.println(s + "는 " + res + "입니다.");
	}
}
