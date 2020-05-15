package com.djx.filesystem;


import com.djx.filesystem.constant.SingleCommend;
import com.djx.filesystem.constant.SysInfoConstant;
import com.djx.filesystem.factory.EasyMultiplexFactory;

import java.util.Properties;
import java.util.Scanner;

/**
 * @author admin_DJX
 * 控制台启动
 */
public class Console {

    // 控制台单例控制
    private static Console console = null;

    public static Console newInstance(){
        if (null == console){
            console = new Console();
        }
        return console;
    }

    //控制台
    /**
     * 当前路径
     */
    private String nowPath = "";
    /**
     * 系统信息
     */
    private Properties sysInfo;

    public Console(){
        //初始化 获取系统信息
        sysInfo = System.getProperties();
        String userName = sysInfo.getProperty(SysInfoConstant.USER_NAME);
        String userHome = sysInfo.getProperty(SysInfoConstant.USER_HOME);
        String userDir = sysInfo.getProperty(SysInfoConstant.USER_DIR);
        System.out.println("userName:"+userName+"\nuserHome:"+userHome+"\nuserDir:"+userDir);
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

            if (SingleCommend.CONSOLE_EXIT.equalsIgnoreCase(str)){
                System.out.println("谢谢使用");
                System.out.println("=================================================");
                break;
            }
        }
    }
}
