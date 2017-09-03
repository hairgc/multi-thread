package com.github.mahui53541.multithread.MustUseMoreCondition_Error;

public class ThreadB extends Thread {
	private MyService service;
	public ThreadB(MyService service) {
		super();
		this.service=service;
	}
	@Override
	public void run() {
		service.awaitB();
	}
}
