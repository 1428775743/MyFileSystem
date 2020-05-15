package com.djx.filesystem.operator;

import com.djx.filesystem.constant.SingleCommend;

/**
 * @author admin_DJX
 *
 * 显示文件
 */
public class ShowOperator extends AbstractOperator implements SysRun{


    @Override
    public String getOperatorName() {
        return SingleCommend.CONSOLE_SHOW;
    }

    @Override
    public Object useCommandCharacter(String commandCharacter) {
        // TODO 解析操作符
        return null;
    }

    @Override
    public Object useCommandCharacter(String commandCharacter, String part) {
        // TODO 解析带参操作符
        return null;
    }

    @Override
    public String run() {
        return null;
    }
}
