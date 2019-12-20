package com.chen.pro.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import java.util.Date;

public class HttpAspect {
    /*
     * service层通过注解自动记录日志
     */
    @Around("execution(public * com.chen.pro.service.*.*(..))")
    public Object serviceAround(ProceedingJoinPoint pjp) throws Throwable {
        Date startDate = new Date();
        Object object = pjp.proceed();
        System.out.println("11111111");
        return object;
    }
}
