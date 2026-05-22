package aop_main;


import aop_p.webToon.JoSuk;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AroundMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("aop_xml/aop_around.xml");

        JoSuk joSuk = context.getBean("joSuk", JoSuk.class);
        Object rr = joSuk.dog1(100,"아기상어");
        System.out.println("rr:"+rr);
        rr = joSuk.dog1(200,"엄마상어");
        System.out.println("rr:"+rr);
        rr = joSuk.dog2();
        System.out.println("rr:"+rr);
        rr = joSuk.dog3();
        System.out.println("rr:"+rr);
        rr = joSuk.dog4();
        System.out.println("rr:"+rr);

    }
}



