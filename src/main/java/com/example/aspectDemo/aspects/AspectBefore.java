package com.example.aspectDemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectBefore extends AbstractAspect{

    @Before("anySetMethod() && args(name)")
    public void actionBeforeExecution(JoinPoint joinPoint, String name){
        System.out.println("Before Advice. Method " + joinPoint.getSignature().getName() + " will set name: " + name);
    }
}

