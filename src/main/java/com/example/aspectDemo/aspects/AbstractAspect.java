package com.example.aspectDemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class AbstractAspect {

    @Pointcut("execution(* com.example.aspectDemo.service.*.set*(*))")
    protected void anySetMethod(){}

    @Pointcut("execution(* com.example.aspectDemo.service.*.setUser*(*))")
    protected void anySetUserMethod(){}

    @Pointcut("execution(* com.example.aspectDemo.service.*.getUserName())")
    protected void getUserName(){}

    @Pointcut("execution(* com.example.aspectDemo.service.*.setBirthDate(*))")
    protected void setBirthDate(){}
}
