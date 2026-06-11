package aaa.exam_p.service;

import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    public Object write(ExamDTO dto, HttpServletRequest request){
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

        return dto;
    }
}
