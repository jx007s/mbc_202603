package aaa.exam_p.service;

import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AsyService {

    @Resource
    ExamMapper mapper;

    public Object list(PageInfo pInfo){
        return mapper.list(pInfo);
    }

    public Object detail(ExamDTO dto){
        return mapper.detail(dto);
    }
}
