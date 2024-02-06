package com.ict.day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClients implements Runnable {
	Socket s; 
	Ex07_Server server;
	
	BufferedReader in;
	PrintWriter out;
	String ip ;
	
	public ServerClients(Socket s, Ex07_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if(msg.equalsIgnoreCase("exit")) {
					// 자기 자신에게 보낸다.
					String exit = "bye";
					// PrintWriter는 끝 표시 안함
					//exit += System.lineSeparator();
					out.println(exit);
					break;
				}
				server.sendMsg(ip + ":" + msg);
			} catch (Exception e) {
			}
		}
		// 자기 자신을 제외 시킨다.
		server.removeClient(this);
		String msg2 = ip + "님 퇴장" ;
		// PrintWriter는 끝 표시 안함
		//msg2 += System.lineSeparator();
		// 리스트에게 보내다.
		server.sendMsg(msg2);
	}

}
