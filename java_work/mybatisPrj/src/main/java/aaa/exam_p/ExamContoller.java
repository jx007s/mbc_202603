package aaa.exam_p;

import aaa.di_p.MyProvider;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam/{service}")
public class ExamContoller {

    @Resource
    MyProvider provider;

    @ModelAttribute("mainData")
    Object mainData(HttpServletRequest request,
                    HttpServletResponse response,
                    PageInfo pInfo,
                    ExamDTO dto){
        Object res = provider.getContext().getBean("exam"+pInfo.getService(), ServiceAction.class)
                .execute(request,response,pInfo,dto);
        return res;
    }

    @RequestMapping
    String view(PageInfo pInfo){
        return "exam/"+pInfo.getService();
    }
}
