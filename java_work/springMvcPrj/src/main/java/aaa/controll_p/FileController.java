package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {

    @GetMapping("/file/form")
    String form(){
        return "file/form";
    }
}
