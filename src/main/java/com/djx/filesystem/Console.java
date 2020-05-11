package com.djx.filesystem;


import com.djx.filesystem.constant.SingleCommend;
import com.djx.filesystem.factory.EasyMultiplexFactory;

import java.util.Scanner;

/**
 * @author admin_DJX
 * 控制台启动
 */
public class Console {

    private static Console console = null;

    public static Console newInstance(){
        if (null == console){
            console = new Console();
        }
        return console;
    }


    /**
     * 程序启动
     */
    public void start(){
        Scanner scan = (Scanner)EasyMultiplexFactory.getInstance("scanner");
        System.out.println("欢迎使用文件管理系统");
        System.out.println("=========================================");
        while (scan.hasNextLine()){
            String str = scan.nextLine();
            System.out.println(str);
            if (SingleCommend.CONSOLE_EXIT.equalsIgnoreCase(str)){
                System.out.println("谢谢使用");
                break;
            }
        }
    }
}
