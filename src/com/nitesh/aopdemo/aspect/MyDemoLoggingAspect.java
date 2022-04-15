package com.nitesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {


    // Pointcut declaration to enable aspect to be executed before add* method inside com.nitesh.aopdemo.dao package
    @Pointcut("execution(* com.nitesh.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    // Advice
    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n======>>>> Executing @Before advice on method()");
    }

    // reusing pointcut declaration on another Advice
    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n======>>>> Performing api analytics");
    }
}
