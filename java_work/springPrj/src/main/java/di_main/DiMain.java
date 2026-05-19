package di_main;

import di_p.Camera;
import di_p.HandPhone;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMain {
    public static void main(String[] args) {
        System.out.println("DiMain 시작 ------");

        Camera cam1 = new Camera();
        cam1.setName("전방카메라");
        cam1.setKind("일반렌즈");
        //cam1.setSize("큰거");

        System.out.println("cam1:"+cam1);

    // xml 파일을 로드하여 bean 설정함
        // 접근 경로 : java 혹은 resources 폴더 이하 위치 (보통  resources 에 위치)
        //           "di_xml/di_1.xml"
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("di_xml/di_1.xml");


        // bean 호출 -- bean 설정 이후 호출이므로 호출마다 생성되지 않는다.
        // bean id 혹은 bean name 으로 호출
        Object oo2 = context.getBean("cam2");
        System.out.println("oo2:"+oo2);
        //Camera.class :  형변환 하여 리턴
        Camera cam2 = context.getBean("cam2", Camera.class);
        System.out.println("cam2:"+cam2);

        HandPhone ph1 = context.getBean("hp1", HandPhone.class);
        System.out.println("hp1:"+ph1);
        System.out.println("DiMain 끝 ------");
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
