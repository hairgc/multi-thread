package com.github.mahui53541.multithread.synLockIn;

public class MyThread extends Thread {
	public void run() {
		Service s=new Service();
		s.service1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		myThread.start();
	}
}
