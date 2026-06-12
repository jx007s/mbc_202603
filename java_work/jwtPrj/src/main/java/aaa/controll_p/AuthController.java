package aaa.controll_p;

import aaa.filter.JwtUtil;
import aaa.model.LoginDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "gall페이지";
    }

    @GetMapping("/order")
    Object order(){
        return "order 페이지";
    }

    @GetMapping("/login")
    Object login(LoginDTO dto){
        // 매개변수로 받은 uid 으로 토큰생성하여 리턴
       return jwtUtil.createToken(dto.getUid());
    }
}
