package anno_p;

import org.springframework.context.annotation.Bean;

public class AnnoConfig {

    // 메소드를 실행하여 Bean 생성및 설정
    @Bean  // 컨테이너 실행시점에 Bean을 생성하기 위해 메소드 실행
    Camera cam1(){
        System.out.println("cam1 실행");
        Camera res = new Camera();
        res.name = "과속카메라";
        return res;
    }

    @Bean  // 컨테이너 실행시점에 Bean을 생성하기 위해 메소드 실행
    Camera cam2(){
        System.out.println("cam2 실행");
        Camera res = new Camera();
        res.name = "키메라";
        return res;
    }
}
