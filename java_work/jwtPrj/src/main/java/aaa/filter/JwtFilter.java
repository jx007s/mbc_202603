package aaa.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


// Bean 이 아님
// JWT 검사
//  OncePerRequestFilter  :: 요청 1번당 1번만 실행
public class JwtFilter extends OncePerRequestFilter {

    // username 추출
    private final JwtUtil jwtUtil;

    public  JwtFilter(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        // 헤더 중 인증 정보인 것만 읽어온다
        // Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWEiLCJp...
        // Bearer 토큰정보
        // Bearer : 토큰정보를 알려줌, Bearer 가 아니면  JWT 인증 수행할 필요 없음
        String auth = request.getHeader("Authorization");

        System.out.println("JwtFilter : "+auth);

        //header 가 인증정보 라면 JWT 인증 시작 --> 사용자 정보 => SecurityContext에 저장
        if(auth != null && auth.startsWith("Bearer")){

            //JWT 만 가지고 온다
            String token = auth.substring(7);

            // 이름획득
            String userName = jwtUtil.getUsername(token);

            //이름->사용자 인증정보를 생성
            UsernamePasswordAuthenticationToken authentication =
            new UsernamePasswordAuthenticationToken(
                    userName,           // 인증 주체
                    null,               // 암호(필요없음)
                    null);              //  권한목록(Roles) 필요없음

            //SecurityContext 에 인증정보 저장  <-- session  저장과 비슷한 작업
            // 컨트롤러나 Spring Security 요청시
            // SecurityContextHolder.getContext().getAuthentication() 으로 등록한 사용자 정보 조회가능
            // 로그인 상태
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        //필터 사용 계속 진행
        filterChain.doFilter(request, response);

    }
}
