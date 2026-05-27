package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mmm")
public class ModelController {

    // url :  /mmm + / + list
    @GetMapping("list")
    String list(){
        return "mmm/list";
    }
}
