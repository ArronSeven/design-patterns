package com.arron.factory.abs;

/***
 *
 *  每个具体的产品都有自己的工厂
 * @author Arron Zhang
 * @date 2018-12-11 14:56
 * @version 1.0
 */
public class WaterBulbFactory implements IFactory {

    @Override
    public com.arron.factory.abs.Bulb createBulb() {
        return null;
    }

    @Override
    public Bike createBike() {
        return null;
    }

    @Override
    public Computer createcomputer() {
        return null;
    }
}
