package com.ict.kk;

import java.util.Scanner;

public class M01 {
	public static void main(String[] args) {
		int count = 0; // 총 횟수
		int mewin = 0; // 이긴 횟수
		int comp = 0;
		double avg = 0; // 승률
		String my = ""; // 나의 가위바위보
		String ct = ""; // 컴의 가위바위보
		
		Scanner scan = new Scanner(System.in);
		esc:while (true) {

			count ++;
			int com = (int)(Math.random()*3);
			System.out.println("나 : 1. 가위, 2. 바위, 3. 보");
			System.out.println("숫자를 선택하세요:");
			int me = scan.nextInt();
			
			// 사용자
			if (me==0) {
				my = "나 : 가위";
			} else if(me==1) {
				my = "나 : 바위";
			} else if(me==2) {
				my = "나 : 보";
			} else {
				System.out.println("제대로 입력하세요");
			}
			System.out.println(my);
			
			// 컴퓨터
			if (com==0) {
				ct = "컴 : 가위";
			} else if(com==1){
				ct = "컴 : 바위";
			} else if(com==2) {
				ct = "컴 : 보";
			} else {
				System.out.println("제대로 입력하세요");
				
			}
			System.out.println(ct);
			
			// 컴퓨터가 가위일때
			if (com==0) {
				if(me==0) {
					System.out.println("비김");
				}
				if(me==1) {
					System.out.println("Player가 이김!!");
					mewin++;
				}
				if(me==2) {
					System.out.println("컴퓨터가 이김!!");
				}
				System.out.println();
			} 
			// 컴퓨터가 바위일때
			if(com==1) {
				if(me==0) {
					System.out.println("com이 이김");
				}
				if(me==1) {
					System.out.println("비김");
				}
				if(me==2) {
					System.out.println("Player가 이김");
					mewin++;
				}
				
			}
			
			// 컴퓨터가 보일때
			if(com==2) {
				if(me==0) {
					System.out.println("Player가 이김");
					mewin++;
				}
				if(me==1) {
					System.out.println("com이 이김");
				}
				if(me==2) {
					System.out.println("비김");
				}
			}
			while (true) {
				System.out.println("계속 하시겠습니까? (y/n)");
				String st = scan.next();
				if (st.equalsIgnoreCase("y")) {
					continue esc;
				}
				if(st.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력해 주세요");
			
			
			}

		}
		avg = (int)(mewin/(count*1.0)*100*10)/10.0;
		System.out.println("총 횟수 : " + count);
		System.out.println("이긴 횟수 : " + mewin);
		System.out.println("승률 : " + avg + "%");
	}
}
