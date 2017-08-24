package com.github.mahui53541.multithread.daemon;

public class MyThread extends Thread {
	/**
	 * 守护线程
	 */
	private int i=0;
	public void run() {
		try {
			while(true) {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("在沉睡中被停止，进入catch"+this.isInterrupted());
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			MyThread myThread=new MyThread();
			myThread.setDaemon(true);
			myThread.start();
			Thread.sleep(5000);
			System.out.println("我离开Thread对象也不在打印了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
