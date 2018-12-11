package com.arron.factory.method;

/***
 *
 *  每个具体的产品都有自己的工厂
 * @author Arron Zhang
 * @date 2018-12-11 14:56
 * @version 1.0
 */
public class WaterBulbFactory extends AbstractBulbFactory {
    @Override
    public Bulb buyBulb() {
        return new WaterBulb();
    }
}
