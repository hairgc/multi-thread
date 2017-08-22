package com.github.mahui53541.multithread;

public class Run {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		myThread.start();
		System.out.println("运行结束");
	}
}
