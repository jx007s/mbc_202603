package di_main;

import di_p.CollData;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

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

        CollData cd = context.getBean("cd", CollData.class);
        System.out.println(Arrays.toString(cd.getAa()));
        System.out.println(Arrays.toString(cd.getEe()));
        System.out.println(cd.getBb());
        System.out.println(cd.getCc());
        System.out.println(cd.getDd());
    }
}


/*

ExamMain
학생정보를 가지고 등수를 출력하세요

학생

이름, 국어, 영어, 수학 , 총점, 평균



 */
