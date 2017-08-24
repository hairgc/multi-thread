package com.github.mahui53541.multithread.t119;

public class Run {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		Thread a=new Thread(myThread,"A");
		Thread b=new Thread(myThread,"B");
		Thread c=new Thread(myThread,"C");
		Thread d=new Thread(myThread,"D");
		Thread e=new Thread(myThread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
