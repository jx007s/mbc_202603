package aaa.di_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class EventInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("EventInterceptor.preHandle() 실행");

        String pid = request.getParameter("pid");

        if(pid.equals("aaa")){
            return true;    //정상접근
        }else{
            //다른 페이지로 접근시킬경우
            response.sendRedirect("/event/fail");
            return false;
        }

    }
}
