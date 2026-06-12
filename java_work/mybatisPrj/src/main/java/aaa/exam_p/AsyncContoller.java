package aaa.exam_p;

import aaa.di_p.MyProvider;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.PageInfo;
import aaa.exam_p.service.AsyService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://200.200.200.2:5173/")
@RestController
@RequestMapping("/async")
public class AsyncContoller {

    @Resource
    AsyService service;

    @GetMapping
    Object list(PageInfo pInfo){
        return  service.list(pInfo);
    }

    @GetMapping("{id}")
    Object detail(ExamDTO dto){
        return  service.detail(dto);
    }


    @PostMapping
    Object write(ExamDTO dto,HttpServletRequest request){

        service.write(dto, request);
        System.out.println("write 실행"+dto);
        return dto.getId();
    }

    @DeleteMapping("{id}")
    void delete(HttpServletRequest request,ExamDTO dto){
        service.delete(request, dto);
    }


    @PutMapping
    void update(ExamDTO dto){

        service.modify(dto);
        System.out.println("update 실행"+dto);

    }
}
