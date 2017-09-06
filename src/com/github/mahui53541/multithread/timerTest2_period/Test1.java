package com.github.mahui53541.multithread.timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendatrRef=Calendar.getInstance();
		calendatrRef.add(Calendar.SECOND, 10);
		Date runDate=calendatrRef.getTime();
		MyTask task=new MyTask();
		Timer timer=new Timer();
		timer.schedule(task, runDate, 4000);
	}

}
