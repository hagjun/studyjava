package com.ict.kk;

import java.util.Random;
import java.util.Scanner;

public class M02 {
	public static void main(String[] args) {
		// 야구게임 규칙 :
		// random 을 사용
		// 배열 사용
		// 총 10번 돌려야됨
		// 랜덤으로 나온 숫자가 자리값이 일치할 경우 스트라이크 (0)
		// 랜덤으로 나온 숫자가 자리값이 다른 하나라도 불일치 할경우 볼(1)
		// 랜덤으로 나온 숫자가 겹치는 번호가 없으면 아웃 (2)

		// 3칸에 숫자가 랜덤으로 돌아가는데 나는 숫자를 모른다.
		// 3칸에 숫자는 모두 다른 숫자로 들어가게 해야함
		// 사람이 숫자를 맞춰야 됨

		// 첫시도
		// 첫번째 숫자, 두번째 숫자, 세번째 숫자를 입력하게 하고
		// 3개의 숫자가 다 틀리면 아웃
		// 두번째 시도
		// 첫번째 숫자, 두번쨰 숫자, 세번째 숫자를 입력하게 하고
		// 3개의 숫자가 다 틀리면 아웃
		// 세번째 시도
		// 첫번째 숫자를 맞추면 스트라이크, 두번째, 세번째 자리는 바꿔서 숫자를 부르면 볼 = 1스트라이크 2볼

		// 총 10번 돌려서 맞추면 win
		// 못 맞추면 lose


		int stc = 0; // 스트라이크카운트
		int bac = 0; // 볼카운트
		int ouc = 0; // 아웃카운트
		int gamecount = 0; // game횟수
		
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] m = new int[3];
		int[] c = new int[3];
		
		// 컴퓨터순서의 숫자 중복처리
		for (int i = 0; i < m.length; i++) {
			c[i] = ran.nextInt(10);
			for (int j = 0; j < i; j++) {
				
				if(c[i]==c[j]) {
					i--;
					
				}
			}
		}
		
		
		

		ex: while (gamecount<10) {
			for (int l = 1; l < 11; l++) {
				
			
			System.out.println("행운의 번호 출력");
			System.out.println( c[0] +" /"+ c[1] +" /"+ c[2]);
			
			System.out.println("================");
			System.out.println("=== My Turn ====");
			System.out.println("================");
			System.out.println("첫번째 숫자 : " );
			m[0] = scan.nextInt();
			System.out.println("두번째 숫자 : ");
			m[1] = scan.nextInt();
			System.out.println("세번째 숫자 : ");
			m[2] = scan.nextInt();
			System.out.println("");
			
			System.out.println(l + "번째시도 : " + m[0] + " /" + m[1] + " /" + m[2]);
			
			// 스트라이크 카운트 / 볼카운트
			int st = 0;
			int ba = 0;
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if(m[i]==c[j]) {
						if(i==j) {
							st++;
						} else {
							ba++;
						} 
					} 
					
						
					
				}
			}
			System.out.println("결과: " + st + "스트라이크" +"\t"+ ba + "볼"); 
			System.out.println();
			
			gamecount++;

		
			
			 	
				// 3스트라이크 게임승리!!
				if (st == 3) {
					System.out.println("게임 Win"); break ex; 
					
				//10번 돌렸을때 3아웃을 못맞췄을때 게임실패!!
				} else if(st==0 && ba==0 && gamecount==10) {
					System.out.println("게임 Lose"); 
					System.out.println("3아웃!!!");break ex;
				}
				
				
				
			}
			

		}
		
		System.out.println("수고하셨습니다.");



	}
}