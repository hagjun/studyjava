package com.ict.kk;

import java.util.Scanner;

public class M02_1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			int size = 3; // 배열크기
			int count = 0; // 게임수 카운트


			// 컴퓨터 배열 중복 피해 채우기
			int[] com = new int[size]; // 컴퓨터값배열선언초기화
			com[0] = (int) (Math.random() * 10); // 0이상 9미만 난수
			for (int i = 1; i < com.length; i++) {
				boolean dup = true; // 중복체크
				esc: while (dup) {
					com[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						if (com[j] == com[i]) {
							dup = true;
							continue esc;
						} else {
							dup = false;
						}
					}
				}
			}

			// 컴퓨터 난수배열 출력(나중에 감추기)
			System.out.print("<com>\t");
			for (int i = 0; i < com.length; i++) {
				System.out.print(com[i] + " ");
			}
			System.out.println();

			//게임시작
			exit: while (count < 10) {
				// 사용자 인풋
				int[] input = new int[size];
				for (int i = 0; i < com.length; i++) {
					System.out.print("0~9:");
					input[i] = scan.nextInt();
				}
				System.out.print("<input>\t");
				for (int i = 0; i < input.length; i++) {
					System.out.print(input[i] + " ");
				}

				// 컴퓨터와 나의 값 비교
				int st = 0; // 스카운트
				int ba = 0; // 볼카운트
				int out = 0; // 아웃카운트
				for (int i = 0; i < input.length; i++) {
					for (int j = 0; j < input.length; j++) {
						if (com[i] == input[j]) {
							if (i == j) {
								st++;
							} else {
								ba++;
							}
						}
					}
				}
				out = size - (st + ba);
				count++;

				System.out.println();
				System.out.println("시행수" + count + "(S:" + st + ",B:" + ba + ",O:" + out + ")");

				// 3스트라이크면 종료
				if (st == size) {
					System.out.println("이겼습니다<끝>");
					break exit;
				}

			}//while10번
			
			//10회다실패
			if(count==10) {
				System.out.println("졌습니다<끝>");
			}
			
		}// main
	}// class}
