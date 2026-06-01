package aaa.controll_p;

import aaa.exam_p.model.ExamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/ffile")
public class FileController {

    @RequestMapping("down")
    ResponseEntity<InputStreamResource> fileDown(HttpServletRequest request, ExamDTO dto){
        String dirPath = request.getServletContext().getRealPath("fff")+"\\";
        dirPath = "D:\\public\\mbc\\2026_03\\public\\java_work\\mybatisPrj\\src\\main\\resources\\static\\fff\\";

        File ff = new File(dirPath+dto.getUpFF());
        return null;
    }
}
