package aaa.di_p;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Resource
    EventInterceptor eInter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("MyConfig.addInterceptors() 실행");

        //interceptor 적용 - 모든 페이지에 적용
        //registry.addInterceptor(eInter);

        // 적용할 URL 패턴 설정
        registry.addInterceptor(eInter).addPathPatterns("/event/nomal");
    }
}
