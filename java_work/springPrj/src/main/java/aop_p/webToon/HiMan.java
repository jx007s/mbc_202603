package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class HiMan {
    public String dog1(int aa, String bb){
        System.out.println("HiMan.dog1() 실행:"+aa+","+bb);
        return "진돗개";
    }
    public String cat1(int aa, String bb){
        System.out.println("HiMan.cat1() 실행:"+aa+","+bb);
        return "호랑이";
    }

    public int dog3(int aa, int bb){
        System.out.println("HiMan.dog3() 실행:"+aa+","+bb);
        return 3000;
    }
    public int cat4(int aa, int bb){
        System.out.println("HiMan.cat4() 실행:"+aa+","+bb);
        return 4000;
    }
}
