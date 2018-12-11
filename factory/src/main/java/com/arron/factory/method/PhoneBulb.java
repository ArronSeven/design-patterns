package com.arron.factory.method;



/***
 *  手机灯泡
 * @author Arron Zhang
 * @date 2018-12-11 11:19
 * @version 1.0
 */
public class PhoneBulb implements Bulb {

    @Override
    public void off() {
        System.out.println("工厂方法构建，Phone bulb 关灯");
    }

    @Override
    public void on() {
        System.out.println("工厂方法构建，phone bulb 开灯！");
    }
}
