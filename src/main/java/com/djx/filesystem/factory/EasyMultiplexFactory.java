package com.djx.filesystem.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author admin_DJX
 * 简单对象复用工厂实现
 * 保证某些对象实例不需要一直创建
 */
public class EasyMultiplexFactory{

    private static Map<String,Object> multiplexObj = new HashMap<>();

    /**
     * 获取复用的对象
     * @param name 复用对象名称
     * @return 复用对象
     */
    public static Object getInstance(String name) {
        Object obj;
        obj = multiplexObj.get(name);
        if (obj == null){
            obj = createInstance(name);
            multiplexObj.put(name,obj);
        }
        return obj;
    }

    /**
     * 复用对象初始化
     * 目前为止有scanner
     * @param name 初始化对象的名称
     * @return 初始化完成的对象
     */
    private static Object createInstance(String name) {

        switch (name){
            case "scanner":return new Scanner(System.in);
            default:
                return null;
        }
    }
}
