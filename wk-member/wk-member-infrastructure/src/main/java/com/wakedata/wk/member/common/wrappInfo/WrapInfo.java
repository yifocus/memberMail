package com.wakedata.wk.member.common.wrappInfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 包装返回结果中的appName, epName, storeName字段
 * @author hhf
 * @date 2021/2/5
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface WrapInfo {
    String value() default "";
}