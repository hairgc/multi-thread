package com.github.mahui53541.multithread.t20;

import java.util.Random;

public class MyThread1 extends Thread {
	public void run() {
		long beginTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			Random random=new Random();
			random.nextInt();
		}
		long endTime=System.currentTimeMillis();
		System.out.println("thread 1 use time="+(endTime-beginTime));
	}
}
