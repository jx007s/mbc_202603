package di_main;

import di_p.Camera;
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
    }
}

/*
project: hambugerPrj
햄버거 셋트를 구현해 주세요
햄버거세트 : 햄버거, 음료, 사이드, 이름, 가격
햄버거 : 종류, 이름, 칼로리, 가격
사이드 : 이름, 갯수, 칼로리, 가격
음료 : 핫/아이스, 이름, 크기, 칼로리, 가격
* */
