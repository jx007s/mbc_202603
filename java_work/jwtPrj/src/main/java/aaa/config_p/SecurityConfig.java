package aaa.config_p;

import aaa.filter.JwtFilter;
import aaa.filter.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class SecurityConfig {

    private final JwtUtil jwtUtil;

    // 생성자 매개변수 JwtUtil jwtUtil는  생성된 Bean 자동 호출
    public  SecurityConfig(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, JwtUtil jwtUtil){

        http.csrf(csrf->csrf.disable())
                //인증없이 접근 허용할 경로
                .authorizeHttpRequests(auth->
                        auth.requestMatchers("/main","/login","/gall/**").permitAll()

                                // 그 외 모든 요청은 인증필요
                                .anyRequest().authenticated()

                );

        //JWT 필터 등록 <-- JWT 검사
        http.addFilterBefore(new JwtFilter(jwtUtil),
                UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }
}
