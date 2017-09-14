package com.github.mahui53541.multithread.singleton_7;

public class Test {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
    	Test hsl = new Test();// 4
        hsl.x++;// 5
        Test hs2 = new Test();// 6
        hs2.x++;// 7
        hsl = new Test();// 8
        hsl.x++;// 9
        Test.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}