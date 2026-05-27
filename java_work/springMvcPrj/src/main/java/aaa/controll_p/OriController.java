package aaa.controll_p;

import aaa.model_p.Person;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OriController {

    @GetMapping("/file/ori")
    String form(Model mm, HttpServletRequest request){
        List<String> arr = new ArrayList();

        String path = request.getServletContext().getRealPath("ori");
        path= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\ori";

        for(File ff: new File(path).listFiles()){
            if(ff.isFile()){
                arr.add(ff.getName());
            }
        }

        mm.addAttribute("arr",arr);
        return "file/ori";
    }



    ///파일 다운로드 권장
    @GetMapping("/file/oriDown")
    ResponseEntity<InputStreamResource> fileDown3(HttpServletRequest request,
                                                  @RequestParam("fName")String fName
                                                  ) throws Exception {

        String path = request.getServletContext().getRealPath("ori");
        path= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\ori";
        fName = fName.replaceAll(" ","+")
                .replaceAll("\\(","%28")
                .replaceAll("\\)","%29");
        File ff = new File(path+"\\"+fName);
        InputStreamResource res = new InputStreamResource(new FileInputStream(ff));

        String fname = URLEncoder.encode(fName, "utf-8");

        return ResponseEntity.ok()                                      //응답코드 : 200
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename="+fname)       //응답 헤더
                .contentLength(ff.length())                             //응답길이 : 파일길이
                .contentType(MediaType.APPLICATION_OCTET_STREAM)        //응답타입 : 일반파일
                .body(res);                                             //응답내용 : 파일스트림
    }

}

   /*
    회원 정보 :
pid, pname,  age, height;
가입일 - 현재시각 자동처리

사진(이미지파일만), 이력서

 ori.zip 압축해제하고  ori 내 파일들을 다운로드 구현하세요
 * */
