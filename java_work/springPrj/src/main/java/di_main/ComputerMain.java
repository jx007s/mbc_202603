package di_main;

import di_p.ExamData;
import di_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("di_xml/di_computer.xml");


        System.out.println(context.getBean("ss"));
        System.out.println(context.getBean("dk"));
        System.out.println(context.getBean("nb"));
        System.out.println(context.getBean("tb"));

    }
}

/*
ComputerMain
--  autowire 로 작업 요망

서버  - 본체 1, 모니터 2, 키보드 1, 마우스 1
데스크탑   - 본체 1, 모니터 1, 키보드 1, 마우스 1
노트북    - 본체 1, 마우스 1
테블릿   - 본체 1
* */