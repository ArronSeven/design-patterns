package com.arron.factory.abs.consumer;


import com.arron.factory.abs.*;

/***
 *  客户
 * @author Arron Zhang
 * @date 2018-12-11 11:28
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        IFactory iFactory = new PhoneBulbFactory();
        Bulb bulb = iFactory.createBulb();
        bulb.on();
        bulb.off();


        Bike bike = iFactory.createBike();
        bike.run();
        bike.stop();

        Computer computer = iFactory.createcomputer();
        computer.on();
        computer.off();
    }
}
