package com.github.mahui53541.multithread.stack_1;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyStack myStack=new MyStack();
		P p=new P(myStack);
		C c=new C(myStack);
		ThreadP pThraed=new ThreadP(p);
		ThreadC cThread=new ThreadC(c);
		pThraed.start();
		cThread.start();
	}

}
