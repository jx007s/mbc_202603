package aaa.controll_p;

import aaa.model_p.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParamController {

    @GetMapping("/basic/form")
    String form(){
        return "basic/form";
    }

    @PostMapping("/basic/form")
    String commit1(HttpServletRequest request, Model mm){
        System.out.println(
                request.getParameter("pname")+","+
                request.getParameter("age")+","+
                request.getParameter("marriage")
        );
        Person pp = new Person();
        pp.setPname(request.getParameter("pname"));
        pp.setAge(Integer.parseInt(request.getParameter("age")));
        pp.setMarriage(Boolean.parseBoolean(request.getParameter("marriage")));
        mm.addAttribute("pp",pp);
        return "basic/commit";
    }

    @RequestMapping("/basic/commit2")
    String commit2(
            @RequestParam("pname") String pn,
            @RequestParam("age") int age,
            @RequestParam("marriage") boolean mrg
            , Model mm
    ){
        System.out.println("commit2 진입"+pn+","+age+","+mrg);
        Person pp = new Person();
        pp.setPname(pn);
        pp.setAge(age);
        pp.setMarriage(mrg);
        mm.addAttribute("pp",pp);
        return "basic/commit";
    }


    @RequestMapping("/basic/commit3")
    String commit3(@ModelAttribute("pp")Person per){
        System.out.println("commit3 진입"+per);

        return "basic/commit";
    }

    @RequestMapping("/basic/commit4")
    String commit4(Person per){
        System.out.println("commit4 진입"+per);

        return "basic/commit4";
    }
}
/*
MemberController
pid, pname, age, height, reg_date
가입 및 처리 페이지를 구현하세요
* */
