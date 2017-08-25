package com.github.mahui53541.multithread.t209;

public class ThreadB extends Thread {
	private MyOneList list;
	public ThreadB(MyOneList list) {
		super();
		this.list=list;
	}
	public void run() {
		super.run();
		MyService ms=new MyService();
		ms.addServiceMethod(list, "B");
	}
}
