package anno_main;


import anno_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoCoffeeMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("anno_xml/anno_coffee.xml");

        System.out.println(context.getBean("cc"));



    }
}
/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
AutoCoffeeMain


*/


