package aaa.controll_p;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://200.200.200.2:5173/")
@RestController
@RequestMapping("/asy")
public class AsyncController {

    @RequestMapping("hello")
    Object hello(){
        System.out.println("asy/hello 진입");
        return "헬로상어";
    }
}
