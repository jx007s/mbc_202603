package aop_p.advice_p;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class MyExecAdvice {

    // around -> ProceedingJoinPoint
    // around 이외 -> JoinPoint
    void retString(JoinPoint point){
        System.out.println("retString : "+point.getSignature().getName());
        //point.proceed();  없음
    }

    void retInt(JoinPoint point){
        System.out.println("retInt : "+point.getSignature().getName());
    }
}
