package com.engine.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志帮助类
 */
public class LoginHelper {

    private static Logger helperLogger = LoggerFactory
            .getLogger(LoginHelper.class);

    public static void info(String message,String fullClassName){
        helperLogger.info(fullClassName +" info :" +message);
    }

    public static void error(String message,String fullClassName){
        helperLogger.error(fullClassName +" error :" + message);
    }

    public static void error(Logger logger,String msg ){
        logger.error(msg);
    }
}
