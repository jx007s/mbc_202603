package aaa.exam_p.service;

import aaa.exam_p.ServiceAction;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service("examdetail")
public class Detail implements ServiceAction {

    @Resource
    ExamMapper mapper;

    @Override
    public Object execute(HttpServletRequest request,
                          HttpServletResponse response,
                          PageInfo pInfo, ExamDTO dto) {
        ExamDTO res =  mapper.detail(dto);
        System.out.println(res);
        return res;
    }
}
