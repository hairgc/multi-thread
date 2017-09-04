package com.github.mahui53541.multithread.Fair_noFair;

public class Run {

	public static void main(String[] args) {
		//final MyService service=new MyService(true);
		final MyService service=new MyService(false);
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("线程"+Thread.currentThread().getName()+"运行了");
				service.serviceMethod();
			}
		};
		
		Thread[] array=new Thread[10];
		for(int i=0;i<10;i++) {
			array[i]=new Thread(runnable);
		}
		for(int i=0;i<10;i++) {
			array[i].start();
		}
	}

}
