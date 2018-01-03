package com.arron.singleton;

/**
 *  3.懒汉模式（线程安全）
 *  这种写法能够在多线程中很好的工作，
 *  但是每次调用getInstance方法时都需要进行同步，
 *  造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 * @author:arron
 * @date:2018/1/2/002 22:55
 */
public class Singleton3 {
    private static Singleton3 singleton;
    private Singleton3(){}
    public static synchronized Singleton3 getInstance(){
        if(singleton==null){
            singleton = new Singleton3();
        }
        return singleton;
    }
}
