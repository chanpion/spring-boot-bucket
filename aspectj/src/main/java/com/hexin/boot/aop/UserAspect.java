package com.hexin.boot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* com.hexin.boot.aop.UserService.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("enter");
        joinPoint.proceed();
        System.out.println("exit");
    }
}
