package com.github.mahui53541.multithread.stack_1;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List list=new ArrayList();
	synchronized public void push() {
		try {
			if(list.size()==1) {
				this.wait();
			}
			
			list.add("anyString"+Math.random());
			this.notify();
			System.out.println("push="+list.size());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String returnValue="";
		try {
			if(list.size()==0) {
				System.out.println("pop操作"+Thread.currentThread().getName()+"线程成wait状态");
				this.wait();
			}
			returnValue=list.get(0)+"";
			list.remove(0);
			this.notify();
			System.out.println("pop="+list.size());
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return returnValue;
	}
}
