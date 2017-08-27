package com.github.mahui53541.multithread.volatileTestThread;

public class MyThread extends Thread {
	volatile public static int count;
//	private static void addCount() {
//		for(int i=0;i<100;i++) {
//			count++;
//		}
//		System.out.println("count="+count);
//	}
	
	synchronized private static void addCount() {
		for(int i=0;i<100;i++) {
			count++;
		}
		System.out.println("count="+count);
	}
	public void run() {
		addCount();
	}
}
