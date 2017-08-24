package com.github.mahui53541.multithread.t202;

public class Run {

	public static void main(String[] args) {
		 HasSelfPrivateNum numSelf=new HasSelfPrivateNum();
		 ThreadA a=new ThreadA(numSelf);
		 a.start();
		 ThreadB b=new ThreadB(numSelf);
		 b.start();
	}

}
