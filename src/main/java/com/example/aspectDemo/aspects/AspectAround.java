package com.example.aspectDemo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAround extends AbstractAspect{

    @Around("anySetUserMethod()")
    public void actionAroundMethodSet(ProceedingJoinPoint pjp){
        System.out.println("Around Advice. Before method " + pjp.getSignature().getName() + " execution");

        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("Around Advice. After method " + pjp.getSignature().getName() + " execution");
        System.out.println("");
    }


}
