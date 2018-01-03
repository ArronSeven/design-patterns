package com.arron.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 5. 静态内部类单例模式
 *第一次加载Singleton类时并不会初始化sInstance，
 * 只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，
 * 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 * @author:arron
 * @date:2018/1/3/003 0:04
 */
public class Singleton5 implements Serializable{

    private Singleton5(){}

    public static Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    /**
     * 如果该对象没有实例Serializable 接口则无法序列化
     *
     * 上述讲的几种单例模式实现中，有一种情况下他们会重新创建对象，
     * 那就是反序列化，将一个单例实例对象写到磁盘再读回来，
     * 从而获得了一个实例。反序列化操作提供了readResolve方法
     * ，这个方法可以让开发人员控制对象的反序列化。
     * 在上述的几个方法示例中如果要杜绝单例对象被反序列化是重新生成对象，就必须加入如下方法：
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.INSTANCE;
    }
}
