package com.github.mahui53541.multithread.ReadWriteLockBegin1;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service=service;
	}
	@Override
	public void run() {
		super.run();
		service.read();
	}
}
