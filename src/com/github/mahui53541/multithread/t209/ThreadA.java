package com.github.mahui53541.multithread.t209;

public class ThreadA extends Thread {
	private MyOneList list;
	public ThreadA(MyOneList list) {
		super();
		this.list=list;
	}
	public void run() {
		super.run();
		MyService ms=new MyService();
		ms.addServiceMethod(list, "A");
	}
}
