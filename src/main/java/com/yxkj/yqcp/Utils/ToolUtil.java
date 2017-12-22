package com.yxkj.yqcp.Utils;

import com.yxkj.yqcp.TestMain;

import org.apache.commons.logging.impl.Log4JLogger;

import java.util.logging.Logger;

/**
 * Created by u on 2017/12/22.
 */

public class ToolUtil {
    /*
        1 真机 真机系统安全权限太高 不建议用
        2 模拟器 建议用天天模拟器调试
     */
    public static int DeviceType = 2;

    /*
        log日志
     */
    public static Logger log = Logger.getLogger(TestMain.class.toString());
}
