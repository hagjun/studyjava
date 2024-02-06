package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {
		// Ex12 t = s -> System.out.println(s + "님 환영");
		Ex12 t = returnString();
		t.showString("Hello"); // "Hello" => s

		showMyString(t);

		// 자바식-1
		showMyString(new Ex12() {

			@Override
			public void showString(String str) {
				System.out.println(str + "님 방가방가");
			}
		});
		// 자바식-2
	    Ex12 t2 = returnString2();
	    t2.showString("lamda ");
	}

	// 매개변수로 전달하는 람다식
	public static void showMyString(Ex12 k) {
		k.showString("word");

	}

	// 반환값으로 쓰이는 람다식
	public static Ex12 returnString() {
		return s -> System.out.println(s + " 님 환영"); // 반환값(Ex12)으로 return 한다.
	}
	
	// 자바식-2
	public static Ex12 returnString2() {
		return new Ex12() {

			@Override
			public void showString(String str) {
				System.out.println(str+ "님 Hi");
			}
		};
	}
	
}
