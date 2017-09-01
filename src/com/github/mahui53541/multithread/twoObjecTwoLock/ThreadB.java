package com.github.mahui53541.multithread.twoObjecTwoLock;

public class ThreadB extends Thread {
	private HasSelfPrivateNum numSelf;
	public ThreadB(HasSelfPrivateNum numSelf) {
		super();
		this.numSelf=numSelf;
	}
	@Override
	public void run() {
		super.run();
		numSelf.addI("b");
	}
}
