package aaa.controll_p;

import aaa.model_p.Member;
import aaa.model_p.PData;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/{cate}/{service}")
public class AdminController {

    List<Member>mems;

    @ModelAttribute("logURL")
    Object logURL(HttpSession session){ //request.parameter 를 매개변수로 처리


        String res = "login";

        if(session.getAttribute("pid")!=null){
            res = "logout";
        }

        return res;
    }

    public AdminController() {
        //1. 관리자, 2.일반회원, 3.블랙리스트
        this.mems = List.of(
                new Member(1,"aaa","1111","배소영"),
                new Member(2, "bbb","2222","오수민"),
                new Member(3, "ccc","1111","김광수"),
                new Member(1,"ddd","4444","서신권"),
                new Member(2,"eee","2222","이학섭")
        );
    }

    Member pid = null;
    @RequestMapping("logReg")
    String logReg(HttpSession session, Member mem, Model mm){
        pid = null;
        String goURL = "/center/list?cate=notice";
        String msg = "로그인실패";
        mems.stream().forEach(m->{
            if(m.logChk(mem)){
                pid = m;
            }
        });

        if (pid != null) {
            goURL = "/admin/member/list";
            msg = pid.getPname()+"로그인성공";
            session.setAttribute("pid",pid);
        }
        mm.addAttribute("goURL",goURL);
        mm.addAttribute("msg",msg);
        return "admin/alert";
    }


    @RequestMapping("logout")
    String logout(HttpSession session, Model mm){
        pid = (Member)session.getAttribute("pid");
        String goURL = "/center/list?cate=notice";
        String msg = pid.getPname()+"로그아웃";

        pid=null;
        session.invalidate();

        mm.addAttribute("goURL",goURL);
        mm.addAttribute("msg",msg);
        return "admin/alert";
    }


    // attribute 등록 : 현재 컨트롤러에 접근하는 요청에 모두 전달
    @ModelAttribute("pData")
    Object menu(PData pData){ //request.parameter 를 매개변수로 처리
        // 매개변수를 attribute 등록시에도 @ModelAttribute("속성명") 사용
        System.out.println("menu : "+pData);
        return pData;
    }



    @GetMapping
    String view(PData pdata, Model mm){

        mm.addAttribute("mainURL",pdata.getService());
        mm.addAttribute("mainData",pdata.getCate()+" 데이터 이지롱");
        return "admin/adminTemp";
    }


}
