package com.example.aspectDemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAfterThrowing extends AbstractAspect{

    @org.aspectj.lang.annotation.AfterThrowing(value = "setBirthDate())", throwing = "ex")
    public void actionAfterSetWrongDate(JoinPoint joinPoint, IllegalArgumentException ex){
        System.out.println("AfterThrowing Advice. Method " + joinPoint.getSignature().getName() + " execution throws: " + ex);

    }
}
