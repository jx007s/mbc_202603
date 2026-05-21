package anno_main;


import anno_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("anno_xml/anno_autowire.xml");


        HandPhone ph1 = context.getBean("hp1", HandPhone.class);
        System.out.println("hp1:"+ph1);

    }
}
/*
커피 - 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
AutoCoffeeMain


*/


