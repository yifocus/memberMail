package com.wakedata.wk.member.common.wrappInfo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 胡海峰
 * @date 2020/2/5
 */
@Aspect
@Component
@Slf4j
public class WrapInfoAspect {

    @Resource
    WrapInfoService wrapInfoUtil;

    @Pointcut("@annotation(com.wakedata.wk.member.common.wrappInfo.WrapInfo)")
    public void wrapNamePoint() {

    }

    @Around("wrapNamePoint()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        WrapInfo wrapAnnotation = signature.getMethod().getAnnotation(WrapInfo.class);
        Object result = joinPoint.proceed();
        if (null == wrapAnnotation) {
            return result;
        }
        wrapInfoUtil.wrapInfo(result);
        return result;
    }

}
