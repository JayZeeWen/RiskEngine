package com.engine.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志帮助类
 */
public class LoggerHelper {

    private static Logger helperLogger = LoggerFactory
            .getLogger(LoggerHelper.class);

    public static void info(String message,String fullClassName){
        helperLogger.info(fullClassName +" info :" +message);
    }

    public static void error(String message,String fullClassName){
        helperLogger.error(fullClassName +" error :" + message);
    }

    public static void error(Logger logger,String msg ){
        logger.error(msg);
    }

    public static void error(Logger logger,Exception e){
        String msg = ExceptionUtils.getStackTrace(e);
        error(logger,msg);
    }

    public static void error(Logger logger,Exception e,String msg ){
        msg += "  /n ";
        msg += ExceptionUtils.getStackTrace(e);
        error(logger,msg);
    }
}
