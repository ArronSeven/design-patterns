package com.arron.singleton;

import java.io.*;

/**
 * 5. 静态内部类单例模式
 * @author:arron
 * @date:2018/1/2/002 22:46
 */
public class Singleton5Test implements Runnable{

    public static void main(String[] args) throws FileNotFoundException {
        Singleton5Test test = new Singleton5Test();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10 ; i++) {
            Thread thread = new Thread(test);
            thread.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));// 1|0  CPU i7 7700


        /** -- 序列化 -- */
        Singleton5 instance = Singleton5.getInstance();
        FileOutputStream out = new FileOutputStream("test");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(out);
            oos.writeObject(instance);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /** -- 使用反序列化创建个实例 -- */
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test");
            ois = new ObjectInputStream(fis);
            Singleton5 singleton = (Singleton5) ois.readObject();
            /** -- 如果不写readResolve() 方法 则会返回两个不同的实例 -- */
            System.out.println(instance==singleton); // false
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(Singleton5.getInstance());
    }
}
