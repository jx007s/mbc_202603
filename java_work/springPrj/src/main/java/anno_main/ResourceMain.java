package anno_main;


import anno_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("anno_xml/anno_resource.xml");

        System.out.println("hp1:"+context.getBean("hp1"));

    }
}



