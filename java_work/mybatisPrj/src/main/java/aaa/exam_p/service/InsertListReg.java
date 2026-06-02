package aaa.exam_p.service;

import aaa.exam_p.ServiceAction;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service("examinsertListReg")
public class InsertListReg implements ServiceAction {

    @Resource
    ExamMapper mapper;

    @Override
    public Object execute(HttpServletRequest request,
                          HttpServletResponse response,
                          PageInfo pInfo, ExamDTO dto) {

        int cnt =  mapper.insertList(pInfo);
        System.out.println(cnt);
        pInfo.setMsg("다중등록되었습니다");
        pInfo.setGoURL("/exam/list");
        return dto;
    }
}
