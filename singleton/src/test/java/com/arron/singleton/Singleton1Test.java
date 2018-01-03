package com.arron.singleton;

/**
 * 饿汉模式 测试
 * @author:arron
 * @date:2018/1/2/002 22:17
 */
public class Singleton1Test implements Runnable{

    int num = 10;

    public static void main(String[] args) {

        Singleton1Test test = new Singleton1Test();
        for (int i = 0; i <10 ; i++) {
            Thread t = new Thread(test);
            t.start();
        }
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance==instance1); //true 是同一个实例  false  产生了俩个实例
    }

    @Override
    public synchronized void run() {
        num--;
        System.out.println(Singleton1.getInstance());
        System.out.println(num);
    }
}
