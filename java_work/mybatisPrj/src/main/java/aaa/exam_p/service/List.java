package aaa.exam_p.service;

import aaa.exam_p.ServiceAction;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.PageInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
public class List implements ServiceAction {
    @Override
    public Object execute(HttpServletRequest request,
                          HttpServletResponse response,
                          PageInfo pInfo, ExamDTO dto) {
        return null;
    }
}
