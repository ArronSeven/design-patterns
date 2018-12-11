package com.arron.factory.method.consumer;


import com.arron.factory.method.Bulb;
import com.arron.factory.method.PhoneBulbFactory;
import com.arron.factory.method.WaterBulbFactory;

/***
 *  客户
 * @author Arron Zhang
 * @date 2018-12-11 11:28
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        /** -- 买个手机灯泡  -- **/
        PhoneBulbFactory phoneBulbFactory = new PhoneBulbFactory();
        Bulb bulb = phoneBulbFactory.buyBulb();
        bulb.on();
        bulb.off();
        /** -- 买个水灯泡  -- **/
        WaterBulbFactory waterBulbFactory = new WaterBulbFactory();
        Bulb water = waterBulbFactory.buyBulb();
        water.on();
        water.off();
    }
}
