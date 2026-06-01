package aaa.controll_p;

import aaa.exam_p.model.ExamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/ffile")
public class FileController {

    @RequestMapping("down")
    ResponseEntity<InputStreamResource> fileDown(HttpServletRequest request, ExamDTO dto) throws Exception {
        String dirPath = request.getServletContext().getRealPath("fff")+"\\";
        dirPath = "D:\\public\\mbc\\2026_03\\public\\java_work\\mybatisPrj\\src\\main\\resources\\static\\fff\\";

        File ff = new File(dirPath+dto.getUpFF());
        InputStreamResource res = new InputStreamResource(new FileInputStream(ff));
        String fname = URLEncoder.encode(dto.getUpFF(),"utf-8");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename="+fname)
                .contentLength(ff.length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(res);
    }
}
