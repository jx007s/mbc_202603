package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam/{service}")
public class ExamContoller {

    @RequestMapping
    String view(){
        return "exam/list";
    }
}
