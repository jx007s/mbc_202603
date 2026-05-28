package aaa.controll_p;

import aaa.model_p.PData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/center")
public class CenterController {

    // attribute 등록 : 현재 컨트롤러에 접근하는 요청에 모두 전달
    @ModelAttribute("pData")
    Object menu(PData pData){ //request.parameter 를 매개변수로 처리
        // 매개변수를 attribute 등록시에도 @ModelAttribute("속성명") 사용
        System.out.println("menu : "+pData);
        return pData;
    }

    @GetMapping("list")
    String list(Model mm){
        mm.addAttribute("mainURL","list");
        mm.addAttribute("mainData","목록 데이터 이지롱");
        return "mmm/centerTemp";
    }

    @GetMapping("detail")
    String detail(Model mm){
        mm.addAttribute("mainURL","detail");
        mm.addAttribute("mainData","상세 데이터 이지롱");
        return "mmm/centerTemp";
    }

    @GetMapping("modify")
    String modify(Model mm){
        mm.addAttribute("mainURL","modify");
        mm.addAttribute("mainData","수정 데이터 이지롱");
        return "mmm/centerTemp";
    }

    @GetMapping("delete")
    String delete(Model mm){
        mm.addAttribute("mainURL","delete");
        mm.addAttribute("mainData","삭제 데이터 이지롱");
        return "mmm/centerTemp";
    }
}
