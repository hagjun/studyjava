package com.ict.kk;

import java.util.Scanner;

public class King01 {

	static int ran;
	static int totalCount;
	static int ballCount;
	static int strikeCount;
	static int outCount;
	static int out;
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
		outCount = 0;
	}

	public static void reset() {
		ballCount = 0;
		strikeCount = 0;
		out = 0;
	}

	public static void error() {
		error = "잘못입력했습니다. 다시 입력하세요";
		System.out.println(error);
	}

	public static void res(String res) {
		System.out.println(res);
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
				try {
					System.out.println("3 numbers: ");
					user = scan.next();
					totalCount--;
					// User 가 넣은 숫자를 어레이에 담기
					char[] arr = new char[user.length()];
					arr = user.toCharArray();
					num = new int[com.length];

					for (int i = 0; i < num.length; i++) {

						num[i] = Integer.parseInt(String.valueOf(arr[i]));

					} // for i
					reset();

					// 숫자 비교

					for (int k = 0; k < arr.length; k++) {
						for (int j = 0; j < num.length; j++) {
							if (num[k] == com[j]) {
								if (k == j)
									strikeCount++;
								else
									ballCount++;
							} // if
							else
								out++;
						} // for j
					} // for k

					// 결과 값
					if (strikeCount == number) {
						res = "게임에서 이겼습니다:D";
						res(res);
						break;
					} else if (totalCount == 0) {
						res = "실패했습니다 ㅜㅜ ";
						res(res);
						break;
					} else if (out > 8) {
						outCount++;
						if (outCount == number) {
							res = outCount + "out! 실패했습니다 ㅜㅜ";
							res(res);
							break;
						} else {
							res = outCount + "out\n" + totalCount + "번 남았습니다. ";
							res(res);
						}
					}

					else if (strikeCount != 0 || ballCount != 0) {
						res = strikeCount + "strike!" + ballCount + "ball!\n" + totalCount + "번 남았습니다.";
						res(res);

					}
				} // try
				catch (Exception e) {
					error();
					totalCount++;
					continue esc;
				} // catch
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
