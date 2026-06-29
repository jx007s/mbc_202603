package aaa.di_p;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestConfig {

    @Bean
    RestClient restClient(){

        //  Http 요청을 보내는 역할 하는 객체
        // Vue의 fetch 나 Axios 의 역할
        return RestClient.create();
    }
}
