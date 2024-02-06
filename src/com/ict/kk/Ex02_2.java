package com.ict.kk;


import java.util.Scanner;

public class Ex02_2 {

	static int ran;
	static int totalCount;
	static int ballCount;
	static int strikeCount;
	static int outCount;
	static int number;
	static int[] com;
	static int[] num;
	static String user;
	static String res;
	static String error;
	static boolean playing;

	public static int ran() {
		ran = (int) (Math.random() * 10);
		return ran;
	}

	public static void resetAll() {
		totalCount = 10;
		number = 3;
		com = new int[number];
		user = "";
		res = "";
		playing = true;
	}

	public static void reset() {
		ballCount = 0;
		strikeCount = 0;
		outCount = number;
	}

	public static void error() {
		error = "다시 입력하세요";
		System.out.println(error);
	}
/////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		resetAll();
		while (playing) {

			// 랜덤숫자 만들기
			for (int i = 0; i < com.length; i++) {
				com[i] = ran();
				for (int j = 0; j < i; j++)
					if (com[i] == com[j]) {
						i--;
					}
			}

			// 게임 시작하기

			esc: while (totalCount >= 0 || strikeCount != number) {
				System.out.println("3 numbers: ");
				user = scan.next();
				totalCount--;
				// User 가 넣은 숫자를 어레이에 담기
				char[] arr = new char[user.length()];
				arr = user.toCharArray();
				num = new int[arr.length];

				for (int i = 0; i < num.length; i++) {
					while (arr.length != 3 || (arr[i] <= 'z' && arr[i] >= 'a')) {
						error();
						totalCount++;
						continue esc;
					}
					num[i] = Integer.parseInt(String.valueOf(arr[i]));

				}
				reset();

				// 숫자 비교

				for (int k = 0; k < arr.length; k++) {
					for (int j = 0; j < num.length; j++) {
						if (num[k] == com[j]) {
							if (k == j) {
								strikeCount++;
								outCount--;
							} else {
								ballCount++;
								outCount--;
							}
						} // if
					} // for j
				} // for i
				System.out.println(
						strikeCount + "strike!" + ballCount + "ball!" + outCount + "out!\n" + totalCount + "번 남았습니다. ");
				if (strikeCount == number) {
					res = "게임에서 이겼습니다:D";
					System.out.println(res);
					break;
				} else if (totalCount == 0) {
					res = "실패했습니다 ㅜㅜ ";
					System.out.println(res);
					break;
				}

			} // while
			System.out.print("다시 하시겠습니까?   >> 1.y /2.n");
			int game = scan.nextInt();

			if (game == 1)
				resetAll();
			else if (game == 2)
				playing = false;
			else
				error();

		} // 큰 while

	} // main

}
// Ex20
