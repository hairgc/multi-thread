package com.github.mahui53541.multithread.ReadWriteLockBegin3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	public void read() {
		try {
			try {
				lock.readLock().lock();
				System.out.println("获取读锁"+Thread.currentThread().getName()+System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				// TODO: handle finally clause
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public void write() {
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获取写锁"+Thread.currentThread().getName()+System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				// TODO: handle finally clause
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
