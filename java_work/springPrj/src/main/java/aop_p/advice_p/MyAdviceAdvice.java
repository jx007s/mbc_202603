package aop_p.advice_p;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class MyAdviceAdvice {

    Object arounddd(ProceedingJoinPoint joinPoint){
        Object res = null;
        System.out.println("arounddd 실행");
        try {
                res = joinPoint.proceed();  // 실제 메소드 실행
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return res;  // 메소드 실행 후 리턴값 주기
    }
}
