package com.github.mahui53541.multithread.t19;

public class Test {
	public static void main(String [] args) {
		try {
			MyThread myThread=new MyThread();
			myThread.setName("myThread");
			myThread.start();
			for(int i=0;i<10;i++) {
				int time=(int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
