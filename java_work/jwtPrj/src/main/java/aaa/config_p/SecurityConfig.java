package aaa.config_p;

import aaa.filter.JwtFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http){

        http.csrf(csrf->csrf.disable())
                //인증없이 접근 허용할 경로
                .authorizeHttpRequests(auth->
                        auth.requestMatchers("/main","/login","/gall/**").permitAll()

                                // 그 외 모든 요청은 인증필요
                                .anyRequest().authenticated()

                );

        //JWT 필터 등록 <-- JWT 검사
        http.addFilterBefore(new JwtFilter(),
                UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }
}
