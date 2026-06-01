package aaa.exam_p;

import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.PageInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ServiceAction {

    Object execute(
            HttpServletRequest request,
            HttpServletResponse response,
            PageInfo pInfo,
            ExamDTO dto
    );
}
