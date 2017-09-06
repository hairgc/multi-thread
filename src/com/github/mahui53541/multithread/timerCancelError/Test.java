package com.github.mahui53541.multithread.timerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		int i=0;
		Calendar calendarRef1=Calendar.getInstance();
		Date runDate1=calendarRef1.getTime();
		while(true) {
			i++;
			Timer timer=new Timer();
			MyTaskA task=new MyTaskA(i);
			timer.schedule(task, runDate1);
			timer.cancel();
		}
	}

}
