package aaa.exam_p.service;

import aaa.exam_p.ServiceAction;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service("examinsertForm")
public class InsertForm implements ServiceAction {

    @Resource
    ExamMapper mapper;

    @Override
    public Object execute(HttpServletRequest request,
                          HttpServletResponse response,
                          PageInfo pInfo, ExamDTO dto) {

        return null;
    }
}
