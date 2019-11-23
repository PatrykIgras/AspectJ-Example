package com.example.aspectDemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAfterReturning extends AbstractAspect{

    @AfterReturning(value="getUserName()", returning="name")
    public void whatHappensAfterExecution(JoinPoint joinPoint, Object name){
        System.out.println("AfterReturning Advice. Method " + joinPoint.getSignature().getName() + "() execution returns: " + name);
    }
}
