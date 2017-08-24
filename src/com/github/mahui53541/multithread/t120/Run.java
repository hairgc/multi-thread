package com.github.mahui53541.multithread.t120;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 thread1=new MyThread1();
		thread1.setPriority(5);
		thread1.start();
		MyThread2 thread2=new MyThread2();
		thread2.setPriority(6);
		thread2.start();
	}

}
