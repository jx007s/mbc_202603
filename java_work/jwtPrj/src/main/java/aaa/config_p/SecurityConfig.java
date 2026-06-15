package aaa.config_p;

import aaa.filter.JwtFilter;
import aaa.filter.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


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
                //CORS 정책 활성화
                .cors(cors->{})
                //인증없이 접근 허용할 경로
                .authorizeHttpRequests(auth->

                        auth
                                // OPTIONS  요청시 인증없이 통과
                                .requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                                .requestMatchers("/main","/login","/gall/**").permitAll()

                                // 그 외 모든 요청은 인증필요  -- 인증 실패시 403 Fobidden 에러 리턴
                                .anyRequest().authenticated()

                );

        //JWT 필터 등록 <-- JWT 검사
        http.addFilterBefore(new JwtFilter(jwtUtil),
                UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }


    // Cors 정책 설정   == @CrossOrigin(origins = "http://200.200.200.2:5173/") 와 같다
    // 따로 분리하는 이유 : 컨트롤러 접근 전에 Cors 정책에 맞도록 진입 허가를 위해서
    @Bean
    public CorsConfigurationSource corsConfigurationSource(){

        CorsConfiguration configuration = new CorsConfiguration();
        //ip와 port 허용
        configuration.addAllowedOrigin("http://200.200.200.2:5173");
        //method 허용
        configuration.addAllowedMethod("*");
        //header 허용
        configuration.addAllowedHeader("*");

        //인증정보 : 쿠키, Authorization 허용
        configuration.setAllowCredentials(true);

        //URL 패턴과 매핑
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //매핑에 대한 위의 CORS 정책허용
        source.registerCorsConfiguration("/**",configuration);

        return source;
    }
}
