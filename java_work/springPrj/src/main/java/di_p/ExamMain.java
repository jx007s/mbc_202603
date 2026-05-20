package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("di_xml/di_exam.xml");

        ExamData eData = context.getBean("eData", ExamData.class);
        eData.ppp();
    }
}
