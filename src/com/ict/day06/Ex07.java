package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0; //전체횟수
		int even = 0; //짝수횟수
		
		esc:while (true) {
			count ++;
			System.out.println("숫자 입력: ");
			int su = scan.nextInt();
			String result = "";
			if (su%2==0) {
				even ++;
				result = "짝수";
			}else {
				result = "홀수";
			}
			System.out.println(su+ "는 " + result + "입니다.");
			
			while (true) {
				System.out.print("계속할까요? (1.yes, 2.no) >> ");
				int res = scan.nextInt();				
				if(res == 1)continue esc;
				if(res == 2)break esc;
				
				System.out.println("제대로 입력하세요.");
			}// 안쪽 while
		}// 밖 while
		System.out.println("수고하셨습니다.");
		double per = (even/(count*1.0)*100);
		
		System.out.println("전체횟수: " + count);
		System.out.println("짝수횟수: " + even);
		System.out.println("퍼센트: " + ((int)(per*100)/100.0) +"%");
		
		
		
		
		
		// 전체횟수, 짝수횟수, 퍼센트(소수점 첫째자리까지)
	}
}
