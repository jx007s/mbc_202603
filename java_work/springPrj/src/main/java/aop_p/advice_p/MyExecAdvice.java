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

    void claHiMan(JoinPoint point){
        System.out.println("claHiMan : "+point.getSignature().getName());
    }

    void nameDog(JoinPoint point){
        System.out.println("nameDog : "+point.getSignature().getName());
    }

    void argIntStr(JoinPoint point){
        System.out.println("argIntStr : "+point.getSignature().getName());
    }
    void argAllInt(JoinPoint point){
        System.out.println("argAllInt : "+point.getSignature().getName());
    }
    void arg2(JoinPoint point){
        System.out.println("arg2 : "+point.getSignature().getName());
    }
    void argNone(JoinPoint point){
        System.out.println("argNone : "+point.getSignature().getName());
    }
}
