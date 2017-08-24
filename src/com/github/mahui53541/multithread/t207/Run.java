package com.github.mahui53541.multithread.t207;

public class Run {

	public static void main(String[] args) {
		 Task task=new Task();
		 ThreadA a=new ThreadA(task);
		 a.start();
		 ThreadB b=new ThreadB(task);
		 b.start();
	}

}
