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
//	private int count=5;
//	synchronized public void run() {
//		super.run();
//		count--;
//		System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
//	}
	
	/**
	 * isAlive
	 */
//	public void run() {
//		System.out.println("run="+this.isAlive());
//	}
	
	/**
	 * 终止线程异常
	 */
//	public void run() {
//		try {
//			super.run();
//			for(int i=0;i<500000;i++) {
//				if(this.interrupted()) {
//					System.out.println("已经是停止了");
//					throw new InterruptedException();
//				}
//				System.out.println("i="+i);
//			}
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	/**
	 * 终止线程沉睡
	 */
	public void run() {
		try {
			super.run();
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		}catch(InterruptedException e) {
			System.out.println("在沉睡中被停止，进入catch"+this.isInterrupted());
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		myThread.start();
		try {
			Thread.sleep(2000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
