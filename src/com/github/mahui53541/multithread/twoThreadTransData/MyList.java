package com.github.mahui53541.multithread.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private static List list=new ArrayList<>();
	public static void add() {
		list.add("马辉");
	}
	
	public static int size() {
		return list.size();
	}
}
