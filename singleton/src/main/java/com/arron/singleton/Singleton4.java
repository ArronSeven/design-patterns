package com.arron.singleton;

/**
 * 4. 双重检查模式 （DCL）
 *
 * 这种写法在getSingleton方法中对singleton进行了两次判空，
 * 第一次是为了不必要的同步，第二次是在singleton等于null的情况下才创建实例。
 * 在这里用到了volatile关键字，不了解volatile关键字的可以查看Java多线程（三）volatile域这篇文章(http://blog.csdn.net/itachi85/article/details/50274169)
 * ，在这篇文章我也提到了双重检查模式是正确使用volatile关键字的场景之一。
 在这里使用volatile会或多或少的影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。
 DCL优点是资源利用率高，第一次执行getInstance时单例对象才被实例化，
 效率高。缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，
 虽然发生的概率很小。DCL虽然在一定程度解决了资源的消耗和多余的同步，
 线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效，
 在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
 * @author:arron
 * @date:2018/1/2/002 23:53
 */
public class Singleton4 {
    private static Singleton4 singleton;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        /** -- 第一个if ，为了让线程 没必要的等待，当 singleton==null才会去等待，如果不是null 直接就返回-- */
        /**
         * 如果这样写，每次线程进来都会等待
         * synchronized(Singleton4.class){
                 if(singleton==null){
                 singleton = new Singleton4();
                 }
            }
         *
         */
        if(singleton==null){
            /** --创建实例的唯一行 -- */
            synchronized(Singleton4.class){
                if(singleton==null){
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
