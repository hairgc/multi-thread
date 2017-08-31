package com.github.mahui53541.multithread.jointest1;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread t=new MyThread();
			t.start();
			t.join();
			System.out.println("我想等t对象执行完后我再执行，我做到了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
