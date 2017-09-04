package com.github.mahui53541.multithread.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar c=Calendar.getInstance();
		c.add(Calendar.SECOND, 10);
		Date runDate=c.getTime();
		
		MyTask task=new MyTask();
		//Timer timer=new Timer();
		Timer timer=new Timer(true);
		timer.schedule(task, runDate);
				
	}

}
