package com.github.mahui53541.multithread.stack_1;

public class C {
private MyStack myStack;
	
	public C(MyStack myStack) {
		this.myStack=myStack;
	}
	
	public void popService() {
		System.out.println("pop="+myStack.pop());
	}
}
