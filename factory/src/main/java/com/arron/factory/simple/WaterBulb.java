package com.arron.factory.simple;

import com.arron.factory.simple.ann.BulbAnno;

/***
 * 水灯泡
 * @author Arron Zhang
 * @date 2018-12-11 11:18
 * @version 1.0
 */
@BulbAnno("water")
public class WaterBulb implements Bulb {

    @Override
    public void off() {
        System.out.println("Water off 关灯！");
    }

    @Override
    public void on() {
        System.out.println("Water on 开灯！");
    }
}
