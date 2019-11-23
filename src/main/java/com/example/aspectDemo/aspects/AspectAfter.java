package com.example.aspectDemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAfter extends AbstractAspect{

    @After("anySetMethod()")
    public void actionAfterExecution(JoinPoint joinPoint){
        System.out.println("After Advice. Method " + joinPoint.getSignature().getName() + "() was executed");
        System.out.println("");
    }

}
