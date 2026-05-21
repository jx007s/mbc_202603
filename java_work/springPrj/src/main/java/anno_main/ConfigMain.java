package anno_main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("anno_xml/anno_config.xml");

        System.out.println("cam1:"+context.getBean("cam1"));
        System.out.println("sp1:"+context.getBean("sp1"));
    }
}

/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
CompCoffeeMain


*/



