package com.ict.my01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 입력: ");
		String msg = scan.next();
		
		try {
			socket = new Socket("192.168.0.213", 7000);
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg+"\n");
			bw.flush();
			
			String re_msg = br.readLine();
			System.out.println("받은 정보 : " + re_msg);
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				bw.close();
				osw.close();
				os.close();
				is.close();
				isr.close();
				br.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
