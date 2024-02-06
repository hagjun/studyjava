package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Ex09 coff = new Ex09();
		coff.sName("커피음료");
		coff.sPrice(1500);
		
		Ex09 ion = new Ex09();
		ion.sName("이온음료");
		ion.sPrice(2300);
		
		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);
		
		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);
		
		Ex09[] arr = {coff,ion,cola,juice};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		int output = 0 ;
		// 1. 1500 을 직접 입력하지 말고 비교해서 찾자 
		// 살수없는 제품을 선택하면 - 계산이 된다.( 살수없다고 표시하고 다시 메뉴가 나와야 된다.)
		esc: while(true) {
			System.out.println("남은 돈 : " + input);
			if(input < 1500) {
				 output =  input ;
				break esc;
			}else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].gPrice() <= input) {
						System.out.print(" O\t");
					}else {
						System.out.print(" X\t");
					}
				}
				System.out.println();
				System.out.print("선택하세요 >> ");
				String drink = scan.next();
				switch (drink) {
					case "커피": output = input - arr[0].gPrice(); break;
					case "이온": output = input - arr[1].gPrice(); break;
					case "탄산": output = input - arr[2].gPrice(); break;
					case "과일": output = input - arr[3].gPrice(); break;
					case "반환": output = input ; break esc;
				}
			}
			// 잔돈을 물건을 살 수 있는 input으로 전환 
			input =output ;
		}
		System.out.println("잔돈 : " + output);
	}
}













