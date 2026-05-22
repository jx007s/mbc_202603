package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class JoSuk {
    public String dog1(int aa, String bb){
        System.out.println("JoSuk.dog1() 실행:"+aa+","+bb);
        return "센세이션";
    }

    public String dog2(){
        System.out.println("JoSuk.dog2() 실행");
        return "애봉";
    }

    public int dog3(){
        System.out.println("JoSuk.dog3() 실행");
        return 1234;
    }

    public String dog4(){
        System.out.println("JoSuk.dog4() 실행");
        return "조철왕";
    }

    public String char1(){
        System.out.println("JoSuk.char1() 실행");
        return "조철왕";
    }


    public String char2(){
        System.out.println("JoSuk.char2() 실행");
        int a = 10/0;   //에러발생
        return "서부욱";
    }
}
