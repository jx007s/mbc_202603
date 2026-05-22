package aop_p.advice_p;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class MyAroundAdvice {

    Object arTest(ProceedingJoinPoint joinPoint){
        Object res = null;
        System.out.println(" >> arTest 진입 : "+joinPoint.toString());
        System.out.println(" >> getSignature() : "+joinPoint.getSignature());
        System.out.println(" >> getSignature().getName() : "+joinPoint.getSignature().getName());//메소드명
        System.out.println(" >> getTarget() : "+joinPoint.getTarget()); //메소드실행 객체
        System.out.println(" >> getArgs() : "+ Arrays.toString(joinPoint.getArgs()) ); //매개변수
        System.out.println(" >> getThis() : "+joinPoint.getThis()); //메소드실행 객체

        try {
            if(joinPoint.getArgs().length==2 && joinPoint.getArgs()[0].equals(100)){
                res = "100원은 싫어";
            }else{
                res = joinPoint.proceed();  // 실제 메소드 실행
            }

            if(res.equals("조철왕")){
                res = "점심고고";
            }

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return res;  // 메소드 실행 후 리턴값 주기
    }
}
