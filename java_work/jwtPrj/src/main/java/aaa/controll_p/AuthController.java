package aaa.controll_p;

import aaa.filter.JwtUtil;
import aaa.model.LoginDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://200.200.200.2:5173/")
@RestController
public class AuthController {
    @Resource
    JwtUtil jwtUtil;

    @GetMapping("/main")
    Object main(){
        return "main페이지";
    }

    @GetMapping("/gall/{service}")
    Object gall(){
        System.out.println("gall진입");
        return "gall페이지";
    }

    @GetMapping("/order")
    Object order(){
        return "order 페이지";
    }

    @RequestMapping("/login")
    Object login(LoginDTO dto){
        // 매개변수로 받은 uid 으로 토큰생성하여 리턴
        String token = jwtUtil.createToken(dto.getUid());
        System.out.println("로그인 진입"+token);
       return token;
    }
}
