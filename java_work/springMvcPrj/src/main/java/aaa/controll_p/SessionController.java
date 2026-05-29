package aaa.controll_p;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sss")
public class SessionController {

    @GetMapping("make")
    String make(HttpSession session){
        session.setAttribute("pid","aaa");
        return "make : ";
    }

    @GetMapping("view")
    String view(HttpSession session){
        return "view : "+session.getAttribute("pid");
    }

    @GetMapping("modify")
    String modify(HttpSession session){
        session.setAttribute("pid","bbb");
        return "modify : ";
    }

    @GetMapping("delete")
    String delete(HttpSession session){
        session.invalidate();
        return "delete : ";
    }
}
/*
admin 을 구현하세요
회원관리, 제품관리, 마이페이지, 로그인
관리자로 로그인 해야만 접근가능
관리자 : root / 1234
로그인 페이지는 비회원 접근가능
나머지 페이지는 비회원일 경우 메인페이지로 이동
* */
