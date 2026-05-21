package anno_main;


import anno_p.AnnoConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ConfigMain3 {
    public static void main(String[] args) {

        ApplicationContext context = new
                AnnotationConfigApplicationContext(AnnoConfig3.class);

        // Bean 이름 배열
        String [] names = context.getBeanDefinitionNames();
        System.out.println("names:"+ Arrays.toString(names));

        System.out.println("cam1:"+context.getBean("cam1"));

        System.out.println("sp2:"+context.getBean("sp2"));
    }
}

/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
CompCoffeeMain


*/



