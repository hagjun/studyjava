package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		// 학생 수 :
		System.out.print("학생수 : ");
		int su = scan.nextInt();
		// 전체
		double[][] arr = new double[su][8];
		
		for (int i = 0; i < arr.length; i++) {
			// 새로만들어서 넣어주기 / 자료형은 double로 만들어짐.
			// 한사람의 정보를 담고 있는 배열.
			double[] p = new double[8];
			
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			p[4] = p[1] + p[2] + p[3];
			
			p[5] = (int)(p[4]/3.0*10)/10.0;
			
			// 학점
			if(p[5]>=90) {
				p[6] = 'A' ;
				
			} else if (p[5]>=80) {
				p[6] = 'B';
			} else if (p[5]>=70){
				p[6] = 'C';
			} else {
				p[6] = 'F';
			}
			// 순위에 초기값은 무조건 1이다.
			p[7] = 1;
			// ** 다차원배열에넣기
			arr[i] = p;
			
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				// 남(j)이 커야됨
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++ ;
				}
			}
		}
		// 정렬
		// 임시 저장할 배열
		double[] tmp = new double[8];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국어, 영어, 수학 출력에서 제외
				if(j==1 || j==2 || j==3) continue;
				
				// 평균 이므로 실수
				if(j ==5) {
					System.out.print(arr[i][j]+"\t");
				// 학점은 char
				} else if(j==6) {
					System.out.print((char)(arr[i][j])+"\t");
				} else {
					System.out.print((int)(arr[i][j])+"\t");
				}
			
				
			}
			System.out.println();
		}
		
//		
//		
//		for (i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i ;
//				System.out.print("국어 : ");
//				arr[i][j] = scan.nextInt();
//				System.out.print("영어 : ");
//				arr[i][j] = scan.nextInt();
//				System.out.print("수학 : ");
//				arr[i][j] = scan.nextInt();
				
//				students[i][4] = students[i][1] + students[i][2] + students[i][3];
//				students[i][5] = (int) ((int)(students[i][4] / 3.0 * 10) / 10.0);
//				if (students[i][5] >= 90) {
//					students[i][6] = 'A';
//				} else if (students[i][5] >= 80) {
//					students[i][6] = 'B';
//				} else if (students[i][5] >= 70) {
//					students[i][6] = 'C';
//				} else {
//					students[i][6] = 'F';
//				}
//				students[i][7] = 1;
			}
//			
//			

					

		// 출력



	
}
