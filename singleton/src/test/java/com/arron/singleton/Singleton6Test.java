package com.arron.singleton;

import java.io.*;

/**
 * 6. 枚举单例
 * @author:arron
 * @date:2018/1/2/002 22:46
 */
public class Singleton6Test implements Runnable{

    public static void main(String[] args) throws FileNotFoundException {
        Singleton6Test test = new Singleton6Test();
        Thread thread = new Thread(test);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(Singleton6.INSTANCE);
    }
}
