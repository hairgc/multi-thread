package com.github.mahui53541.multithread.t209;

public class Run {

	public static void main(String[] args) {
		 MyOneList list=new MyOneList();
		 ThreadA a=new ThreadA(list);
		 a.setName("A");
		 a.start();
		 ThreadB b=new ThreadB(list);
		 b.setName("B");
		 b.start();
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("listsize="+list.getSize());
	}

}
