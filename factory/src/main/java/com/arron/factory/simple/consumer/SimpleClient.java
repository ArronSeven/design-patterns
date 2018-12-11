package com.arron.factory.simple.consumer;

import com.arron.factory.simple.Bulb;
import com.arron.factory.simple.BulbFactory3;

/***
 *  客户
 * @author Arron Zhang
 * @date 2018-12-11 11:28
 * @version 1.0
 */
public class SimpleClient {
    public static void main(String[] args) {
        /** -- 买个手机灯泡  -- **/
       /* Bulb bulb = BulbFactory1.buyBulb(BulbFactory1.BulbName.PHONE);
        bulb.off();
        bulb.on();

        Bulb waterBulb = BulbFactory1.buyBulb(BulbFactory1.BulbName.WATER);
        waterBulb.off();
        waterBulb.on();*/
        for (String arg : args) {
            System.out.println(arg);
        }
        Bulb waterBulb1 = BulbFactory3.buyBulb(args[0]);
        waterBulb1.on();
        waterBulb1.off();
    }
}
