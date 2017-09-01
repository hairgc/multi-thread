package com.github.mahui53541.multithread.t202;

public class ThreadA extends Thread {
	private HasSelfPrivateNum numSelf;
	public ThreadA(HasSelfPrivateNum numSelf) {
		super();
		this.numSelf=numSelf;
	}
	@Override
	public void run() {
		super.run();
		numSelf.addI("a");
	}
}
