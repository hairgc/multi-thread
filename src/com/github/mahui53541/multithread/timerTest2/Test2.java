package com.github.mahui53541.multithread.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar c1=Calendar.getInstance();
		c1.add(Calendar.SECOND, 10);
		Date runDate1=c1.getTime();
		System.out.println("计划时间是"+runDate1);
		
		Calendar c2=Calendar.getInstance();
		c2.add(Calendar.SECOND, 15);
		Date runDate2=c2.getTime();
		System.out.println("计划时间是"+runDate2);
		MyTask task1=new MyTask();
		MyTask task2=new MyTask();
		Timer timer=new Timer();
		//Timer timer=new Timer(true);
		timer.schedule(task1, runDate1);
		timer.schedule(task2, runDate2);
	}

}
