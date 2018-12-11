package com.arron.factory.simple;

import com.arron.factory.simple.ann.BulbAnno;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/***
 *  灯泡制造工厂,一个工厂可以制造任何一家的灯泡
 * @author Arron Zhang
 * @date 2018-12-11 11:17
 * @version 1.0
 */
public class BulbFactory3 {

   private static Map<String, Class> classMap = new HashMap<>();

    static {
        String packageName = "com.arron.factory.simple";
        try {
            Enumeration<URL> resources = BulbFactory3.class.getClassLoader().getResources(packageName.replace(".", "/"));
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                String protocol = url.getProtocol();
                System.out.println(protocol);
                if (protocol.equals("file")) {
                    File f = new File(url.getPath());
                    File[] files = f.listFiles();
                    for (File file : files) {
                        String path = file.getPath();
                        if(path.endsWith(".class")){
                            path = path.replaceAll("\\\\", "/");
                            String pkgName = path.substring(path.indexOf("/classes/") + 9, path.lastIndexOf("."));
                            Class<?> aClass = Class.forName(pkgName.replace("/", "."));
                            BulbAnno[] bulbAnnos = aClass.getAnnotationsByType(BulbAnno.class);
                            for (BulbAnno bulbAnno : bulbAnnos) {
                                classMap.put(bulbAnno.value(), aClass);
                            }
                        }
                    }
                }
            }
            System.out.println(classMap);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /***
     * 选择性购买方式
     * @return
     */
    public static Bulb buyBulb(String name) {
        if (classMap.containsKey(name)) {
            try {
                return (Bulb) classMap.get(name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
