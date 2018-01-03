package com.arron.singleton;

/**
 * 1.饿汉模式
 *
 *  这种方式基于classloder机制避免了多线程的同步问题，
 *  不过，instance在类装载时就实例化，
 *  虽然导致类装载的原因有很多种，
 *  在单例模式中大多数都是调用getInstance方法，
 *  但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 *  这时候初始化instance显然没有达到lazy loading的效果。(这句话来自：http://cantellow.iteye.com/blog/838473)
 *
 *
 * 为什么这种写法可以避免多线程的同步问题？
 *
 * 因为 static修饰的变量只占有一块内存
 *
 *
 *
 * @author:arron
 */
public class Singleton1 {
    /** --类装载时就实例化   初始化实例 -- */
    private static Singleton1 singleton = new Singleton1();
    /** -- 构造方法私有化 -- */
    private Singleton1(){}

    /**
     * 提供实例 的方法
     * @return singleton
     */
    public static Singleton1 getInstance(){
        return singleton;
    }
}
