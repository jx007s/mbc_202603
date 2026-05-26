package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    //@ResponseBody
    String home(){
/*
application.yml

spring :
    mvc :
        view:
            prefix: /views/
            suffix: .jsp

리턴하는 문자열을 결합하여  forwarding  함
return "home";

"/views/" + "home" + ".jsp"

forwarding 하지 않고 리턴값으로 전달시   @ResponseBody

* */
        return "home";
    }
}


/*
testMvcPrj
내이름은 ??? 입니다

*
*
* */
