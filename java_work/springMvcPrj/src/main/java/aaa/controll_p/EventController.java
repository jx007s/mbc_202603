package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //view 페이지로 forwarding하지 않고 리턴값을 클라이언트에 전달
@RequestMapping("/event")
public class EventController {

    @RequestMapping("/nomal")
    String event(){
        return "이벤트 진행중  ";
    }
}
