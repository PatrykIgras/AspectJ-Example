package com.example.aspectDemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.jar.JarEntry;

@Component
@Aspect
public class AspectAnnotation {

    @AfterReturning(value = "@annotation(com.example.aspectDemo.aspects.Logging)", returning = "value")
    public void actionAroundAnnotatedMethod(JoinPoint joinPoint, Object value){
//        System.out.println("Around Advice. Before annotated method execution");

        System.out.println("AfterReturning Advice. Annotated method " +joinPoint.getSignature().getName() + " execution returns: " + value.toString());
        System.out.println("");
    }

}
