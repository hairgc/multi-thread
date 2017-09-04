package com.github.mahui53541.multithread.Fair_noFair;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock;
	public MyService(boolean isFair) {
		super();
		lock=new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		
		try {
			lock.lock();
			System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁");
		} finally {
			lock.unlock();
		}
	}
}
