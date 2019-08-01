package com.risk.engine.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 计算单元注解
 * @author JayZee 文
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.FIELD})  
public @interface RiskCell {

}
