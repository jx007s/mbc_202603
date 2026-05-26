package aaa.controll_p;

import aaa.model_p.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic/member")
public class MemberController {

    @GetMapping
    String form(){
        return "basic/memeberForm";
    }

    @PostMapping
    String complete(Member mem){
        return "basic/memeberComplete";
    }
}
