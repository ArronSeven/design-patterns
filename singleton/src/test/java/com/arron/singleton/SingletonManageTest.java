package com.arron.singleton;

/**
 *
 * 单例管理 对象
 * @author:arron
 * @date:2018/1/3/003 0:45
 */
public class SingletonManageTest {
    public static void main(String[] args) {

        SingletonManage.putObject("s1",Singleton1.getInstance());
        SingletonManage.putObject("s2",Singleton2.getInstance());
        SingletonManage.putObject("s3",Singleton3.getInstance());
        SingletonManage.putObject("s4",Singleton4.getInstance());
        SingletonManage.putObject("s5",Singleton5.getInstance());

        System.out.println(SingletonManage.getObject("s1"));
        System.out.println(SingletonManage.getObject("s2"));
        System.out.println(SingletonManage.getObject("s3"));
        System.out.println(SingletonManage.getObject("s4"));
        System.out.println(SingletonManage.getObject("s5"));

    }
}
