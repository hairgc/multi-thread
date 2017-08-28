package com.github.mahui53541.multithread.waitOld;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		String lock=new String("");
		Add add=new Add(lock);
		Subtract subtract=new Subtract(lock);
		ThreadSubtract ts1=new ThreadSubtract(subtract);
		ts1.setName("ts1");
		ts1.start();
		ThreadSubtract ts2=new ThreadSubtract(subtract);
		ts2.setName("ts2");
		ts2.start();
		Thread.sleep(1000);
		
		ThreadAdd ta=new ThreadAdd(add);
		ta.setName("tAdd");
		ta.start();
	}

}
