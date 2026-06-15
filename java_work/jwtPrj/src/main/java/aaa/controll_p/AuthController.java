package aaa.controll_p;

import aaa.filter.JwtUtil;
import aaa.model.LoginDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    Object login(@RequestBody  LoginDTO dto){   // @RequestBody :: json 처리해서 dto에 넣는다
        System.out.println("로그인 진입"+dto);
        // 매개변수로 받은 uid 으로 토큰생성하여 리턴
        String token = jwtUtil.createToken(dto.getUid());

       return Map.of("token",token, "userId", dto.getUid());
    }
}
