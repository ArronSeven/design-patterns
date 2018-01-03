package com.arron.singleton;

/**
 * 4. 双重检查模式 （DCL）
 * @author:arron
 * @date:2018/1/2/002 22:46
 */
public class Singleton4Test implements Runnable{

    public static void main(String[] args) {
        Singleton4Test test = new Singleton4Test();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            Thread thread = new Thread(test);
            thread.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));// 1  CPU i7 7700
    }

    @Override
    public void run() {
        System.out.println(Singleton4.getInstance());
    }
}
