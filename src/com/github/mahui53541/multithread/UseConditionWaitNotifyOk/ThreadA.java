package com.github.mahui53541.multithread.UseConditionWaitNotifyOk;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		this.service=service;
	}
	
	public void run() {
		service.await();
	}
}
