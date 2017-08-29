package com.github.mahui53541.multithread.stack_1;

public class ThreadC extends Thread {
	private C c;
	public ThreadC(C c) {
		this.c=c;
	}
	public void run() {
		while (true) {
			c.popService();
		}
	}
}
