package aaa.exam_p.service;

import aaa.exam_p.ServiceAction;
import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service("examdelete")
public class Delete implements ServiceAction {

    @Resource
    ExamMapper mapper;

    @Override
    public Object execute(HttpServletRequest request,
                          HttpServletResponse response,
                          PageInfo pInfo, ExamDTO dto) {

        //파일 저장
        String dirPath = request.getServletContext().getRealPath("fff")+"\\";
        dirPath = "D:\\public\\mbc\\2026_03\\public\\java_work\\mybatisPrj\\src\\main\\resources\\static\\fff\\";
        try {
            ExamDTO delDto = mapper.detail(dto);
            if(delDto.getUpFF()!=null){ //파일 존재시 삭제
                new File(dirPath+delDto.getUpFF()).delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        int cnt =  mapper.delete(dto);
        System.out.println(cnt);
        pInfo.setMsg("삭제되었습니다");
        pInfo.setGoURL("/exam/list");
        return dto;
    }
}
