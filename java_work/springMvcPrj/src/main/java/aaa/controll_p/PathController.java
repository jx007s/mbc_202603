package aaa.controll_p;

import aaa.model_p.PData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path/{cate}")
public class PathController {

    // {} : 변수로 인지하여 사용 --> url의 상수 일치시 접근(변수값은 갯수 맞으면진입)
    // /path/info/hello
    //       cate = info,  service = hello
    // @PathVariable 로 변수 대입 및 attribute 등록
    @RequestMapping("{service}")
    String view1(
            @PathVariable("cate")String cate,
            @PathVariable("service")String service){
        System.out.println("view 1 : "+cate+" , "+service);
        return "path/view1";
    }

    // PathVariable 과 명시화 된 주소 --> 명시화 된 주소가 우선권 가짐
    @RequestMapping("detail")
    String detail(
            @PathVariable("cate")String cate){
        System.out.println("detail : "+cate);
        return "path/view1";
    }


    @RequestMapping("{service}/{nowPage}")
    String view2(PData pd){
        System.out.println("view 2 : "+pd);
        return "path/view2";
    }
}
