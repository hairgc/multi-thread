package com.github.mahui53541.multithread.waitInterruptException;

public class Test {

	public static void main(String[] args) {
		try {
			Object lock=new Object();
			ThreadA a=new ThreadA(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
