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
