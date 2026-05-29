package aaa.controll_p;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterController {
    @RequestMapping("/myPage/qwer")
    String aa1(){ return "myPage/qwer";}
    @RequestMapping("/myPage")
    String aa2(){ return "myPage";}
    @RequestMapping("/order/{service}")
    String aa3(){ return "order/{service}";}
    @RequestMapping("/order/list")
    String aa4(){ return "order/list";}
    @RequestMapping("/gall")
    String aa5(){ return "gall";}
    @RequestMapping("/gall/list")
    String aa6(){ return "/gall/list";}

}
