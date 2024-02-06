package com.ict.day06;

public class Ex08 {
	public static void main(String[] args) {
		String str = "ICT 인재개발원 5강의장";
		
		// 1. charAt(int index) : char
		// 위치정보(index, 0부터 시작)가 숫자로 들어오면 해당 위치에 존재하는 문자를 반환한다.
		
		char c1 =str.charAt(7);
		System.out.println(c1);
		
		System.out.println();
		// str.length() : str의 길이를 알려준다.
		str = "대한민국 I Love You 1004 ♥" ;
		// str의 모든 글자를 대문자로 만들자 (소문자는 대문자에 -32)
		
		// 해당 문자의 위치정보를 가지고 하나씩 꺼내서 검사 할 수 있다.
		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if(c2 >= 'a' && c2 <= 'z') {
				c2 = (char)(c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();
		// 2.concat(String str) : String
		// 입력된 문자열을 현재문자열과 합친다. ("문자열" + "문자열" 과 같은 결과)
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);
		
		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		
		// 3. contains(CharSequence s) : boolean
		// 	  CharSequence는 char 값을 순서대로 읽을 수 있다.
		//    지금은 String 이라고 생각하자.
		//    String을 넣어주면 해당 문자열에 입력된 String이 존재하면 true, 존재하지 않으면 false 
		
		String s5 = "wol02095@gmail.com";
		boolean res = s5.contains("@");
		//boolean res = s5.contains('@'); // char는 사용 불가
		System.out.println("res = "+ res);
		System.out.println("결과 = " + s5.contains(".com"));
		System.out.println("결과 = " + s5.contains(".COM")); // 대,소문자 구분
		
		// 4. equals(Object anObject) : boolean
		//    입력된 문자열과 현재 문자열이 같으면 true, 다른면 false (대소문자 구별한다.)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		//    입력된 문자열과 현재 문자열이 같으면 true, 다른면 false (대소문자 구별 안한다.)
		// ** 문자열과 문자열을 같다고 비교할때는 == 를 사용하지 않는다.
		
		String s6 = "Korea";
		String s7 = "KOREA";
		
		if(s6.equals(s7)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(s6.equalsIgnoreCase(s7)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		// 6. format(String format, Object... args) :static String 
		//    형식을 지정하고 형식에 맞춰서 문자열 생성
		String s8 = "한국 ICT 인재 개발원";
		
		// %s 문자열
		String s9 = String.format("@@ %s !! 화이팅", s8);
		System.out.println(s9);
		
		// %30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		String s10 = String.format("%30s", s8);
		System.out.println(s10);
		// -는 왼쪽 정렬이 된다.
		String s11 = String.format("%-30s", s8);
		System.out.println(s11);
		
		String s12 = String.format("%6s !!", s8);
		System.out.println(s12);
		
		// %d 정수형식
		int k1 = 2134;
		String s13 = String.format("%d &&", k1);
		System.out.println(s13);

		String s14 = String.format("%5d @@", k1);
		System.out.println(s14);
		
		String s15 = String.format("%-5d @@", k1);
		System.out.println(s15);
		
		// %f 실수형식 지정
		double s16 = 123.445678;
		String s17 = String.format("%f", s16);
		System.out.println(s17);
		
		String s18 = String.format("%.1f", s16);
		System.out.println(s18);

		String s19 = String.format("%.4f", s16);
		System.out.println(s19);
		
		// 7.getByte() : byte[]
		// 해당 문자열을 byte[]로 변환 시킨다.
		// 보통 입/출력할 때 사용한다. (대소문자, 숫자 가능, 영어이외에 글자는 안됨)
		// 나중에 []배열을 배운 후에 한다.
		
		
		// 8. indexOf(int ch), indexOf(String str) : int
		// 	  입력된 문자(ch), 문자열(str)의 위치값을 알려준다.
		//    문자나 문자열이 없으면 -1 반환한다.
		
		String h1 = "BufferedReader";
		int h2 = h1.indexOf('R');
		System.out.println(h2);
		
		h2= h1.indexOf("er");
		System.out.println(h2);
		
		h2= h1.indexOf("err");
		System.out.println(h2);
		
		// 9. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		//    fromIndex는 시작 위치를 말한다.
		// 2번째, 3번째 문자나 글자를 찾기 위함이다.
		
		// 두번째 e를 찾어라 (우선, 첫번째 e를 찾아라 )
		int h3 = h1.indexOf('e'); // 4
		System.out.println(h3);
		
		int h4 = h1.indexOf('e',h3+1);
		System.out.println(h4);
		
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용
		int h5 = h1.lastIndexOf('e');
		System.out.println(h5);
		
		// 11. length() : int 
		// 문자열의 길이를 구한다. (1부터 시작한다.)
		String str1 = "Hello";
		System.out.println("길이 : "+str1.length());
		
		
		// 12. replace(char oldChar, char newChar) : String
		//     replace(CharSequence target, CharSequence replacement) : String
		// 지금은 replace(String oldString, String newString) : String : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		
		String str2 = "대한민국";
		String str3 = str2.replace('민', '民');
		System.out.println(str3);
		
		String str4 = str2.replace("민", "민 ♥ ");
		System.out.println(str4);
		
		// 13. isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true, 내용이 있으면 false;
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());
		
		String str6 = "";
		System.out.println(str6.isEmpty());
		
		// 오류 발생 : Exception
		// String str7 = null;
		// System.out.println(str7.isEmpty());
		
		// 14. split(String regex)            : String[] 
		//     split(String regex, int limit) : String[]
		// 배열 배운 이후에 한다.
		
		// 15. subString(int beginIndex)               : String
		//     입력된 시작위치 부터 끝까지 문자열 추출
		
		//     substring(int beginIndex, int endIndex) : String
		//	   입력된 시작위치 부터 입력된 끝위치 전까지 문자열 추출(끝위치는 포함하지 않는다.)
		//     endIndex - beginIndex = 추출할 문자의 갯수
		String t1 = "010-8454-0338";
		String t2 = t1.substring(4);
		System.out.println(t2); //8454-0338
		
		t2 = t1.substring(9);
		t2 = t1.substring(t1.lastIndexOf('-')+1);
		System.out.println(t2); // 0338
		
		String t3 = t1.substring(4, 8);
		System.out.println(t3);
		
		// 010-7777-9999 => 010-7777-****, 010-****-9999
		String t4 = "010-7777-9999";
		String t5 = "****";
		System.out.println(t4.replace(t4.substring(9), t5));
		System.out.println(t4.replace(t4.substring(4,8), t5));
		
		// 16. toLowerCase() : String => 해당 문자열 모두 소문자로 변경
		// 17. toUpperCase() : String => 해당 문자열 모두 대문자로 변경
		
		String t6 = "대한민국 I Love You @ 1004";
		System.out.println(t6.toLowerCase());
		System.out.println(t6.toUpperCase());
		
		// 18. toString : String
		// 모든 클래스의 toString : 모든 객체(클래스)에서 사용가능.
		//                      객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		//						문자열로 만들어서 변환하는 메서드
		// String 의 toString은 문자열 자체를 반환
		String t7 = "java 17 자바 17";
		String t8 = t7.toString();
		System.out.println(t7);
		System.out.println(t8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
