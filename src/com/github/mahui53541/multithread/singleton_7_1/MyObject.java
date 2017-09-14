package com.github.mahui53541.multithread.singleton_7_1;

import java.io.Serializable;

public class MyObject implements Serializable{
	/**   
	 * @Fields serialVersionUID : TODO
	 */  
	private static final long serialVersionUID = 1L;

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
