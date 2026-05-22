package aop_main;


import aop_p.webToon.HiMan;
import aop_p.webToon.JoSuk;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("aop_xml/aop_advice.xml");

        JoSuk joSuk = context.getBean("joSuk", JoSuk.class);


        Object rr = joSuk.dog1(100,"아기상어");
        System.out.println("rr:"+rr);
        rr = joSuk.dog1(200,"엄마상어");
        System.out.println("rr:"+rr);
    }
}



