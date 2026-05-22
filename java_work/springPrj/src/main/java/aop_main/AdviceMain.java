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


        Object rr = joSuk.char1();
        System.out.println("rr:"+rr);
        rr = joSuk.char2();
        System.out.println("rr:"+rr);
    }
}



