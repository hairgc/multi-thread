package com.github.mahui53541.multithread;

public class MyThread extends Thread {
	/**
	 * 线程调用随机性
	 */
//	public void run() {
//		super.run();
//		System.out.println("MyThread");
//	}
	
	/**
	 * 线程随机性
	 */
//	public void run() {
//		try {
//			for(int i=0;i<10;i++) {
//				int time=(int)(Math.random()*1000);
//				Thread.sleep(time);
//				System.out.println("run="+Thread.currentThread().getName());
//			}
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	/**
	 * 线程安全
	 */
	private int count=5;
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
	}
}
