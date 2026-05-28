package aaa.controll_p;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mmm")
public class ModelController {

    // attribute 등록 : 현재 컨트롤러에 접근하는 요청에 모두 전달
    @ModelAttribute("mData")
    Object menu(){
        return "메뉴데이터";
    }


    // url :  /mmm + / + list
    @GetMapping("list")
    String list(Model mm){
        mm.addAttribute("mainData","리스트데이터 이지롱");
        return "mmm/list";
    }

    @GetMapping("detail")
    String detail(Model mm){
        mm.addAttribute("mainData","상세 데이터 이지롱");
        return "mmm/detail";
    }
}
