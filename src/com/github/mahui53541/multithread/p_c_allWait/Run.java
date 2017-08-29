package com.github.mahui53541.multithread.p_c_allWait;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		String lock=new String("");
		P p=new P(lock);
		C c=new C(lock);
		ThreadP[] pThraed=new ThreadP[2];
		ThreadC[] cThread=new ThreadC[2];
		for(int i=0;i<2;i++) {
			pThraed[i]=new ThreadP(p);
			pThraed[i].setName("生产者"+(i+1));
			cThread[i]=new ThreadC(c);
			cThread[i].setName("消费者"+(i+1));
			pThraed[i].start();
			cThread[i].start();
		}
		Thread.sleep(5000);
		Thread[] threadArray=new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i=0;i<threadArray.length;i++) {
			System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
		}
	}

}
