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

@Service("examinsertReg")
public class InsertReg implements ServiceAction {

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

            if(!dto.getUpFile().isEmpty()){ //파일 존재시 저장
                Files.copy(
                        dto.getUpFile().getInputStream(),
                        Paths.get(dirPath+dto.getUpFile().getOriginalFilename()),
                        StandardCopyOption.REPLACE_EXISTING
                );

                dto.setUpFF(dto.getUpFile().getOriginalFilename());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        int cnt =  mapper.insert(dto);
        System.out.println(cnt);
        pInfo.setMsg("등록되었습니다");
        pInfo.setGoURL("/exam/detail?id="+dto.getId());
        return dto;
    }
}
