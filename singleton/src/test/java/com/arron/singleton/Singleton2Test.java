package com.arron.singleton;

/**
 *  2.懒汉模式（线程不安全）
 * @author:arron
 * @date:2018/1/2/002 22:46
 */
public class Singleton2Test implements Runnable{

    public static void main(String[] args) {
        Singleton2Test test = new Singleton2Test();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getId());
            Thread thread = new Thread(test);
            thread.start();
        }
        long end = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());// 0 CPU i7 7700
        System.out.println("耗时："+(end-start));
//        Singleton2 instance = Singleton2.getInstance();
//        Singleton2 instance1 = Singleton2.getInstance();
//        System.out.println(instance==instance1);
    }

    @Override
    public void run() {
        System.out.println(Singleton2.getInstance());
    }
}
