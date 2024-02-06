package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
   스트림 : 데이터를 원하는 목적지 까지 입/출력하는 방법
   종류 : 바이트 스트림, 문자 스트림,객체 스트림(오브젝트스트림)
   1. 바이트 스트림 : 모든 처리를 1byte 처리
             대상 : 바이트로 이루어진 모든 파일(사진, 동영상, 소리 등)
             최상위 클래스 : = InputStream(입력), OutputStream(출력)
   2. 문자 스트림 : 모든 처리를 2Byte 처리 (사람위주)
           대상 : 세계 모든 문자로 구성된 파일을 입출력에 적합
           최상위 클래스 : Reader(입력), Writer(출력)
           
   1-2. 결합 스트림 : 바이트 스트림 => 문자 스트림
              기계를 통해 입/추력 된 적보를 사람이 알아볼 수 있도록 입/출력 한다.
           최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
   3. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입/출력
           대상 : 객체
           최상위 클래스 : ObjectInputStream(readObjce() : 객체 역직렬화)
                       ObjectInputStream(writedObjec() : 객체 직렬화)
*/
public class Ex08 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : OutputStream 자식클래스 FileOutputStream 사용
		//                FileOutputStream : 해당 파일에 내용을 1byte 쓰기 (출력)
		//     주요메서드 : write(int b) : int => 숫자(아이키코드(0~255), 한글자
		//                              ** 아스키코드 (숫자, 소문자, 대문자, 일부 특수만 가능);
		//               write(byte[] b) : 배열 b에 존재하는 아스키코드 출력
		//                             ** String 클래스에 getBytes()를 이용하면 byte[]로 만들어진다.
		//               flush() : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만드는 메서드
		//               close() : 출력 스트림 닫기
		
		// 파일 만들 위치 지정
		
		String pathname = "D:/HJ/util/tes01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try { // FileOutputStream 은 try 밖으로 못나감 선언은 밖에서
			// 파일이 존재하면 덮어쓰기가 된다. 파일이 존재하지 않으면 생성된다.
			fos = new FileOutputStream(file);
			fos.write(106 ); // j
			fos.write(97);   // a
			fos.write(118);  // v
			fos.write(97);   // a
			fos.write(13);   // 줄바꾸기
			
			
			fos.write('H'); 
			fos.write('e'); 
			fos.write('l'); 
			fos.write('l'); 
			fos.write('o'); 
			fos.write(13); // 줄바꾸기
			
			// String.getBytes() 여러글자 사용 가능
			String msg = "Hi~~~\n안녕\n大韓\nBye~~~";
			byte[] b = msg.getBytes();
			fos.write(b);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}


















