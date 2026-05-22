package anno_main;


import anno_p.AnnoCoffeeConfig;
import anno_p.AnnoConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ConfigCoffeeMain {
    public static void main(String[] args) {

        ApplicationContext context = new
                AnnotationConfigApplicationContext(AnnoCoffeeConfig.class);

        // Bean 이름 배열
        String [] names = context.getBeanDefinitionNames();
        System.out.println("names:"+ Arrays.toString(names));

        System.out.println("cc:"+context.getBean("cc"));

    }
}

/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
CofigCoffeeMain


*/



