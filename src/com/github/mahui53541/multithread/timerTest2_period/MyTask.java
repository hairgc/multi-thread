package com.github.mahui53541.multithread.timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("任务执行了，时间为"+new Date());
	}

}
