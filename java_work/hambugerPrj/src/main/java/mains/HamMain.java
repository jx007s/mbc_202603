package mains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HamMain {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("ham_xml/haml_di.xml");

        System.out.println("햄버거 결합");
        context.close();
    }
}
