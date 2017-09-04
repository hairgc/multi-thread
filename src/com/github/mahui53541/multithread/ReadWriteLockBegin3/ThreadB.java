package com.github.mahui53541.multithread.ReadWriteLockBegin3;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service=service;
	}
	@Override
	public void run() {
		super.run();
		service.write();
	}
}
