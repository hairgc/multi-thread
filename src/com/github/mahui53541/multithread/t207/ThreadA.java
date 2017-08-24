package com.github.mahui53541.multithread.t207;

public class ThreadA extends Thread {
	private Task numSelf;
	public ThreadA(Task numSelf) {
		super();
		this.numSelf=numSelf;
	}
	public void run() {
		super.run();
		numSelf.doLongTimeTask();;
	}
}
