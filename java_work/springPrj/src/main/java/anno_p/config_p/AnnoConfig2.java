package anno_p.config_p;

import anno_p.Camera;
import anno_p.SmartPhone;
import anno_p.comp_p.aaa.Display;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // @Bean 설정과 같은 정보 설정 클래스 로드
public class AnnoConfig2 {

    // 메소드를 실행하여 Bean 생성및 설정
    @Bean  // 컨테이너 실행시점에 Bean을 생성하기 위해 메소드 실행
    Camera cam1(){
        System.out.println("cam1 실행");
        Camera res = new Camera();
        res.setName("과속카메라");
        return res;
    }

    @Bean  // 컨테이너 실행시점에 Bean을 생성하기 위해 메소드 실행
            // 메소드 이름이 bean 이름 : cam2
    Camera cam2(){
        System.out.println("cam2 실행");
        Camera res = new Camera();
        res.setName("키메라");
        return res;
    }

    @Bean(name="sp2")  //bean 이름 : sp2
    SmartPhone fwefewf(Camera cam2, Display qwe){  // 매개변수를 bean에서 가져와 자동결합
        SmartPhone res = new SmartPhone();
        res.setFc(cam2);
        res.setDd(qwe);
        return res;
    }
}
