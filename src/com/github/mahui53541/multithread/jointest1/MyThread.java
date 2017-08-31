package com.github.mahui53541.multithread.jointest1;

public class MyThread extends Thread {
	public void run() {
		try {
			int secondValue=(int)(Math.random()*10000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
