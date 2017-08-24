package com.github.mahui53541.multithread.t201;

public class ThreadA extends Thread {
	private HasSelfPrivateNum numSelf;
	public ThreadA(HasSelfPrivateNum numSelf) {
		super();
		this.numSelf=numSelf;
	}
	public void run() {
		super.run();
		numSelf.addI("a");
	}
}
