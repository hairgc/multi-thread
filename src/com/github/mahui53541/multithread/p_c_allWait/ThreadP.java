package com.github.mahui53541.multithread.p_c_allWait;

public class ThreadP extends Thread {
	private P p;
	public ThreadP(P p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		while(true) {
			p.setValue();
		}
	}
}
