package aaa.controll_p;

import aaa.model_p.Exam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic/exam")
public class ExamController {
    @GetMapping
    String form(){
        return "basic/examForm";
    }
/*
    @PostMapping
    @ResponseBody
    Object comp(Exam ex){
        System.out.println("exam_comp"+ex);
        return ex.getStuds();
    }
*/

    @PostMapping
    String comp(Exam ex){
        System.out.println("exam_comp"+ex);
        return "basic/examComp";
    }
}
