package com.ict.kk;



import java.util.Random;
import java.util.Scanner;

public class King02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("!o!o!o!o!o!o!o!o!o!o!o!o!o!");
		System.out.println("******** 야 구 게 임 ********");
		System.out.println("!o!o!o!o!o!o!o!o!o!o!o!o!o!");
		Random ran = new Random();

		int[] game = new int[10]; // 게임 수
		int[] p = new int[3]; // 플레이어 저장 
		int[] c = new int[3]; // 컴 저장
		int out = 0; // 아웃 카운트
		
		// 컴 투수
		for (int q = 0; q < c.length; q++) {
            c[q] = ran.nextInt(10);
            for (int w = 0; w < q; w++) {
                if (c[q] == c[w]) {
                    q--;
                }
            }
		}
		esc: for (int i = 0; i < game.length; i++) {
			System.out.println();
			System.out.println(i + 1 + "번째 도전!!");
			System.out.print("첫번째 숫자 : ");
			p[0] = scan.nextInt();
			System.out.print("두번째 숫자 : ");
			p[1] = scan.nextInt();
			System.out.print("세번째 숫자 : ");
			p[2] = scan.nextInt();

			System.out.println();
			System.out.println("선택번호\t1번\t2번\t3번");
			System.out.println("You :\t" + p[0] + "\t" + p[1] + "\t" + p[2] + "\n"); // 플레이어 숫자 출력
//			System.out.println("com :\t" + c[0] + "\t" + c[1] + "\t" + c[2]); // 컴 숫자 출력

			int st = 0;
			int ball = 0;
			for (int j = 0; j < p.length; j++) {
				for (int k = 0; k < p.length; k++) {
					if(p[j] == c[k]) {
						if(j == k) {
							st++;
						}else {
							ball++;
						}
					}
				}
			}
			System.out.println("결과  : " + st + " Strike\t" + ball + " ball\n"); // 스트라잌 볼 출력

			if (st == 3) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("You Win  You Win  You Win  You Win");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break esc;
			} else if (i == 9) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("You lose  You lose  You lose  You lose");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

			if (st == 0 && ball == 0) {
				out++;
				switch (out) {
				case 1:
					System.out.println("----------" + out + " 아웃" + "----------");
					continue esc;
				case 2:
					System.out.println("----------" + out + " 아웃" + "----------");
					continue esc;
				case 3:
					System.out.println("----------" + out + " 아웃" + "----------\n");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("You lose  You lose  You lose  You lose");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break esc;
				}
			}
		} // 큰 for 문

	}
}

