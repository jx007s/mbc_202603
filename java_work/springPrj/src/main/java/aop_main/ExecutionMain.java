package aop_main;


import aop_p.webToon.HiMan;
import aop_p.webToon.JoSuk;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("aop_xml/aop_execution.xml");

        JoSuk joSuk = context.getBean("joSuk", JoSuk.class);
        HiMan hiMan = context.getBean("hiMan", HiMan.class);

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
        rr = hiMan.dog1(11,"장수풍뎅이");
        System.out.println("rr:"+rr);
        rr = hiMan.cat1(22,"장우풍뎅이");
        System.out.println("rr:"+rr);
        rr = hiMan.dog3(33,"장미풍뎅이");
        System.out.println("rr:"+rr);
        rr = hiMan.cat4(44,"장양풍뎅이");
        System.out.println("rr:"+rr);

    }
}



