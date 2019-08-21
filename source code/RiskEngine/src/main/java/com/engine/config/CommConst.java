package com.engine.config;

import java.util.EnumMap;

public class CommConst {

    /**
     * 数据类包名
     */
    public final static  String BASE_DATA_PACKAGE = "com.engine.data.";


    /**
     * 枚举——调用结果
     */
    public enum EnumAPICallResult{
        Succ("Y"),Fail("N");

        private String flag ;

        EnumAPICallResult (String flag){
            this.flag = flag;
        }

        public String getFlag() {
            return flag;
        }
    }

    public EnumMap<EnumAPICallResult,String> e = new EnumMap(EnumAPICallResult.class){};

}
