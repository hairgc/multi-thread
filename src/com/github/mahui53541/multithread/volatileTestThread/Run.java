package com.github.mahui53541.multithread.volatileTestThread;

public class Run {

	public static void main(String[] args) {
		MyThread[] list=new MyThread[100];
		for(int i=0;i<100;i++) {
			list[i]=new MyThread();
		}
		for(int i=0;i<100;i++) {
			list[i].start();
		}
	}

}
