package aaa.controll_p;

import aaa.model_p.PData;
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
    Object menu(@ModelAttribute("pData") PData pData){ //request.parameter 를 매개변수로 처리
                                                    // 매개변수를 attribute 등록시에도 @ModelAttribute("속성명") 사용
        System.out.println("menu : "+pData);
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
/*
고객센터를 구현하세요
----------------------------------
헤더
----------------------------------
공지사항          |
1:1             |      서비스 (목록,상세,수정,삭제)
자주찾는질문      |
----------------------------------
footer
----------------------------------

* */
