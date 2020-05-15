package com.djx.filesystem.operator;

/**
 * @author admin_DJX
 *
 * 这个是个系统运行的接口,系统只会去调用有这个接口的进行运行
 */
public interface SysRun {
    /**
     * 实际运行的功能
     * @return 系统打印的字符串
     */
    String run();
}
