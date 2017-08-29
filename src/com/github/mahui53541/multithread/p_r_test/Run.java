package com.github.mahui53541.multithread.p_r_test;

public class Run {

	public static void main(String[] args) {
		String lock=new String("");
		P p=new P(lock);
		C c=new C(lock);
		ThreadP pThraed=new ThreadP(p);
		ThreadC cThread=new ThreadC(c);
		pThraed.start();
		cThread.start();
	}

}
