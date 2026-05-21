package anno_main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ConfigMain2 {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("anno_xml/anno_config2.xml");

        // Bean 이름 배열
        String [] names = context.getBeanDefinitionNames();
        System.out.println("names:"+ Arrays.toString(names));

        System.out.println("cam1:"+context.getBean("cam1"));
        System.out.println("sp1:"+context.getBean("sp1"));
        System.out.println("sp2:"+context.getBean("sp2"));
    }
}

/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
CompCoffeeMain


*/



