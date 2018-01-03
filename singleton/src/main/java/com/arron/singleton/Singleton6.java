package com.arron.singleton;

/**
 *
 * 6. 枚举单例
 * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例，
 *
 * 枚举单例的优点就是简单，但是大部分应用开发很少用枚举，可读性并不是很高，不建议用。
 * @author:arron
 * @date:2018/1/3/003 0:11
 */
public enum Singleton6 {
    INSTANCE;

    public void doSomeThing(){
        System.out.println("枚举单例模式");
    }

}
