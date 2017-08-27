package com.github.mahui53541.multithread.t210;

public class PrintString implements Runnable{
	private boolean isContinuePrint=true;
	
	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while(isContinuePrint) {
				System.out.println("run threadName="+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		PrintString ps=new PrintString();
		new Thread(ps).start();
		System.out.println("我要停止他！stopThread"+Thread.currentThread().getName());
		ps.setContinuePrint(false);
		
	}

	@Override
	public void run() {
		printStringMethod();
	}

}
