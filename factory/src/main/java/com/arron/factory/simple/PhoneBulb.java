package com.arron.factory.simple;

import com.arron.factory.simple.ann.BulbAnno;

/***
 *  手机灯泡
 * @author Arron Zhang
 * @date 2018-12-11 11:19
 * @version 1.0
 */
@BulbAnno("phone")
public class PhoneBulb implements Bulb {

    @Override
    public void off() {
        System.out.println("Phone bulb 关灯");
    }

    @Override
    public void on() {
        System.out.println("phone bulb 开灯！");
    }
}
