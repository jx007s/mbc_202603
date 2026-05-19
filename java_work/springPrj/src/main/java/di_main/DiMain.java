package di_main;

import di_p.Camera;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMain {
    public static void main(String[] args) {
        System.out.println("DiMain 시작 ------");

        Camera cam1 = new Camera();
        cam1.setName("전방카메라");
        cam1.setKind("일반렌즈");

        System.out.println("cam1:"+cam1);

    // xml 파일을 로드하여 bean 설정함
        // 접근 경로 : java 혹은 resources 폴더 이하 위치 (보통  resources 에 위치)
        //           "di_xml/di_1.xml"
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("di_xml/di_1.xml");

        System.out.println("DiMain 끝 ------");
    }
}
