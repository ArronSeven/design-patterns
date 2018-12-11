package com.arron.factory.simple.ann;

import java.lang.annotation.*;

/***
 *
 * @author Arron Zhang
 * @date 2018-12-11 13:11
 * @version 1.0
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BulbAnno {

    String value();

}
