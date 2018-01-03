package com.arron.singleton;

/**
 *  3.懒汉模式（线程安全）
 * @author:arron
 * @date:2018/1/2/002 22:46
 */
public class Singleton3Test implements Runnable{

    public static void main(String[] args) {
        Singleton3Test test = new Singleton3Test();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            Thread thread = new Thread(test);
            thread.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));// 1  CPU i7 7700
//        Singleton3 instance = Singleton3.getInstance();
//        Singleton3 instance1 = Singleton3.getInstance();
//        System.out.println(instance==instance1);
    }

    @Override
    public void run() {
        System.out.println(Singleton3.getInstance());
    }
}
