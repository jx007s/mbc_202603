package aop_p.advice_p;

import org.aspectj.lang.JoinPoint;
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

    void beforeee(JoinPoint point){
        System.out.println("beforeee : "+point.getSignature().getName());
    }

    void afterRet(JoinPoint point, Object oo){
        // Object oo : 메소드 리턴값
        System.out.println("afterRet : "+point.getSignature().getName()+","+oo);
    }

    void afterThrow(JoinPoint point, Throwable ee){
        System.out.println("afterThrow : "+point.getSignature().getName()+","+ee);
    }
    void afterrrr(JoinPoint point){
        System.out.println("afterrrr : "+point.getSignature().getName());
    }
}
