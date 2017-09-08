package com.github.mahui53541.multithread.singleton_2_2;

public class MyObject {
	private static MyObject myObject;
	private MyObject() {
		
	}
	public static MyObject getInstance() {
		try {
			if(myObject!=null) {
				
			}else {
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					//if(myObject==null) {
						myObject=new MyObject();
					//}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
