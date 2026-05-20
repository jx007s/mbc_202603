package di_main;

import di_p.Camera;
import di_p.ExamData;
import di_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("di_xml/di_autowire.xml");


        HandPhone ph1 = context.getBean("hp1", HandPhone.class);
        System.out.println("hp1:"+ph1);

        System.out.println("hp2:"+context.getBean("hp2"));

        ExamData eData = context.getBean("eData", ExamData.class);
        eData.ppp();
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