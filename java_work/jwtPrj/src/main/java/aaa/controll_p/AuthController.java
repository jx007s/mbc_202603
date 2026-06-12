package controll_p;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/main")
    Object main(){
        return "main페이지";
    }
}
