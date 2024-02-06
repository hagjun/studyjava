package com.ict.day22;

public class Ex01_02_Protocol {
	int cmd;
	String msg;
	
	public Ex01_02_Protocol() {}

	
	public Ex01_02_Protocol(int cmd, String msg) {
		this.cmd = cmd;
		this.msg = msg;
	}


	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
