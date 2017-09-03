package com.github.mahui53541.multithread.MustUseMoreCondition_OK;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service=service;
	}
	@Override
	public void run() {
		service.awaitA();
	}
}
