package com.arron.factory.StaticFactory;

/***
 *  静态工厂
 * @author Arron Zhang
 * @date 2018-12-11 11:05
 * @since  1.0
 */
public class StaticFactory {

    private StaticFactory(){}

    public StaticFactory getInstance(){
        return new StaticFactory();
    }
}
