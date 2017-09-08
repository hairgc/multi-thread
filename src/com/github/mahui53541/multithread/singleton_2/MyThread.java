package com.github.mahui53541.multithread.singleton_2;

public class MyThread extends Thread {
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
