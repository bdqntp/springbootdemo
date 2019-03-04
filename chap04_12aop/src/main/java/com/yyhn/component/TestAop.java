package com.yyhn.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAop {
    @Pointcut(value = "execution(* com.yyhn.service.*.*(..))")
    public void plc(){}
    @Before(value = "plc()")
    public void before(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法正在执行");
    }
    @After(value = "plc()")
    public void after(JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法正在执行");
    }
    @AfterReturning(value = "plc()",returning = "result")
    public void afterreturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName()+"方法正在执行");
        System.out.println("该方法的返回值是："+result);
    }
    @AfterThrowing(value = "plc()",throwing = "e")
    public void afterthrowing(JoinPoint jp,Exception e){
        System.out.println(jp.getSignature().getName()+"方法报错");
        System.out.println("错误的原因是："+e);
    }
    @Around("plc()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        return pjp.proceed();
    }
}
