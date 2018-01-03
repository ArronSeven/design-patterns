package com.arron.singleton;

/**
 * 2. 懒汉模式（线程不安全）
 *懒汉模式申明了一个静态对象，在用户第一次调用时初始化，
 * 虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
 *
 *为什么线程不安全
 * 因为getInstance 被多个线程访问时，可能会返回多个实例
 * @see com.arron.singleton.Singleton2Test
 *
 * @author:arron
 * @date:2018/1/2/002 22:20
 */
public class Singleton2 {
    /** -- 声明一个静态变量  为null -- */
    private static Singleton2 singleton;

    /** -- 构造器私有化 -- */
    private Singleton2(){}

    /**
     * 提供实例方法
     * @return
     */
    public static Singleton2 getInstance(){
        if(singleton==null){
            singleton = new Singleton2();
        }
        return singleton;
    }
}
