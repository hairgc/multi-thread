package com.github.mahui53541.multithread.twoObjecTwoLock;

public class Run {

	public static void main(String[] args) {
		 HasSelfPrivateNum numSelf1=new HasSelfPrivateNum();
		 HasSelfPrivateNum numSelf2=new HasSelfPrivateNum();
		 ThreadA a=new ThreadA(numSelf1);
		 a.start();
		 ThreadB b=new ThreadB(numSelf2);
		 b.start();
	}

}
