package com.djx.filesystem.operator;

/**
 * @author admin_DJX
 * 抽象的操作符对象
 * 必须实现 getOperatorName;
 *          useCommandCharacter;
 */
public abstract class AbstractOperator {

    /**
     * 获取操作符的名称
     * @return 获取操作符名称
     */
    public abstract String getOperatorName();

    /**
     * 使用命令符
     * @param commandCharacter 命令符
     * @return 一个未知的参数
     */
    public abstract Object useCommandCharacter(String commandCharacter);

    /**
     * 使用命令符
     * @param commandCharacter 命令符
     * @param part 入参数据
     * @return 一个未知的参数
     */
    public abstract Object useCommandCharacter(String commandCharacter,String part);
}
