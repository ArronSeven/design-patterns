package com.arron.factory.abs;


import com.arron.factory.method.Bulb;

/***
 * 水灯泡
 * @author Arron Zhang
 * @date 2018-12-11 11:18
 * @version 1.0
 */
public class WaterBulb implements Bulb {

    @Override
    public void off() {
        System.out.println("工厂方法构建，Water off 关灯！");
    }

    @Override
    public void on() {
        System.out.println("工厂方法构建，Water on 开灯！");
    }
}
