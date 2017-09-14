package com.github.mahui53541.multithread.singleton_7;


public class MyObject {
	private static class MyObjectHandler{
		private static MyObject myObject=new MyObject();
	}
	private MyObject() {
		
	}
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}
