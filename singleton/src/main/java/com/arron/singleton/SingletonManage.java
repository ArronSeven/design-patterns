package com.arron.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 7.单例管理 对象
 *
 * 用SingletonManager 将多种的单例类统一管理，
 * 在使用时根据key获取对象对应类型的对象。这种方式使得我们可以管理多种类型的单例，
 * 并且在使用时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度
 * @author:arron
 * @date:2018/1/3/003 0:41
 */
public class SingletonManage {

    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManage(){}

    public static void putObject(String key , Object o){
        if(!objectMap.containsKey(key)){
            objectMap.put(key, o);
        }
    }

    public static Object getObject(String key){
        return objectMap.get(key);
    }
}
