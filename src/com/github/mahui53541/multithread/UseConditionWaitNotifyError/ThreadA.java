package com.github.mahui53541.multithread.UseConditionWaitNotifyError;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		this.service=service;
	}
	
	public void run() {
		service.await();
	}
}
