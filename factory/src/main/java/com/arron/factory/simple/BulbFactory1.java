package com.arron.factory.simple;

/***
 *  灯泡制造工厂
 * @author Arron Zhang
 * @date 2018-12-11 11:17
 * @version 1.0
 */
public class BulbFactory1 {

    public enum BulbName{
        PHONE("PhoneBulb"),WATER("WaterBulb");

        public String value;

        BulbName(String value) {
            this.value = value;
        }

    }

    /**
     * 默认购买方式
     * @return
     */
    public static Bulb buyBulb(){
        return buyBulb(BulbName.PHONE);
    }

    /***
     * 选择性购买方式
     * @param bulbName
     * @return
     */
    public static Bulb buyBulb(BulbName bulbName){
        String name = BulbFactory1.class.getName();
        String pre = name.substring(0,name.lastIndexOf(".")+1);
        try {
            return (Bulb)Class.forName(pre + bulbName.value).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
