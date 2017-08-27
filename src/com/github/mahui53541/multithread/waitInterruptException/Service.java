package com.github.mahui53541.multithread.waitInterruptException;

public class Service {
	public void testMetnod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait");
				lock.wait();
				System.out.println("end wait");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出异常");
		}
	}
}
