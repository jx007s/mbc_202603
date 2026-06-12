package aaa.exam_p.service;

import aaa.exam_p.model.ExamDTO;
import aaa.exam_p.model.ExamMapper;
import aaa.exam_p.model.PageInfo;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.stream.IntStream;

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

    public void write(ExamDTO dto, HttpServletRequest request){
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

        mapper.insert(dto);

    }


    public void delete(HttpServletRequest request,ExamDTO dto){
        //파일 삭제
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
        mapper.delete(dto);
    }

    public void modify(ExamDTO dto){
        mapper.modify(dto);
    }

    public Object pages(PageInfo pInfo){

        pInfo.setTot(mapper.tot());

        Map<String, Object> res = Map.of(
                "arr",IntStream.rangeClosed(pInfo.getStartPage(),pInfo.getEndPage()).toArray(),
                "before", pInfo.getStartPage() <=1 ? false : pInfo.getStartPage()-1,
                "after",pInfo.getEndPage() >= pInfo.getTotalPage() ? false : pInfo.getEndPage()+1
        );


        return res;
    }
}
