package com.github.mahui53541.multithread.p_r_test;

public class ThreadP extends Thread {
	private P p;
	public ThreadP(P p) {
		this.p=p;
	}
	
	public void run() {
		while(true) {
			p.setValue();
		}
	}
}
