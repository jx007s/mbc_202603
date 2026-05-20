package di_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollMain {
    public static void main(String[] args) {
        System.out.println("CollMain --------------");

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "di_xml/di_Coll.xml","di_xml/di_Coll2.xml");

        System.out.println(context.getBean("arr1"));
        for (Object oo : context.getBean("arr1", ArrayList.class)){
            System.out.println(oo);
        }

        System.out.println(context.getBean("ss1"));
        for (Object oo : context.getBean("ss1", HashSet.class)){
            System.out.println(oo);
        }

        System.out.println(context.getBean("mm1"));
        for (Object oo : context.getBean("mm1", HashMap.class).entrySet()){
            System.out.println(oo);
        }
    }
}
