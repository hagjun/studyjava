package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/HJ/util/image01.jpg 파일을 D:/HJ/image01 로 복사 하자
public class Ex12 {
	public static void main(String[] args) {
		String inputPath = "D:/HJ/util/image01.jpeg";
		String outputPath = "D:/HJ/img-02.jpeg";
		
		
		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		File out_file = new File(outputPath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while((b=bis.read()) != -1) {
				bos.write(b);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// 원본 삭제 하면 이동
			boolean s = in_file.delete();
			if(s) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		
		}
						
	}

}
