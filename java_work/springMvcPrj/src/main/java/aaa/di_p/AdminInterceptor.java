package aaa.di_p;

import aaa.model_p.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("admin 확인한다");
        HttpSession session = request.getSession();
        Member pid = (Member)session.getAttribute("pid");
        if(pid==null || pid.getGrade()!=1){
            System.out.println("admin이 아니여");
            response.sendRedirect("/center/list?cate=notice");
            return false;
        }
        return true;

    }
}
