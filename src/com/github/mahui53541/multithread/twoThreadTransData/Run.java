package com.github.mahui53541.multithread.twoThreadTransData;

public class Run {

	public static void main(String[] args) {
		Object lock=new Object();
		ThreadA a=new ThreadA(lock);
		a.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadB b=new ThreadB(lock);
		b.start();
	}

}
