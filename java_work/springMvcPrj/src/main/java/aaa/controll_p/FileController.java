package aaa.controll_p;

import aaa.model_p.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class FileController {

    @GetMapping("/file/form")
    String form(){
        return "file/form";
    }

    @PostMapping("/file/form")
    String comp(Person pp){
        System.out.println("comp:"+pp);
        System.out.println("up1:"+
                pp.getUp1().getOriginalFilename()+","+
                pp.getUp1().getSize()+","+
                pp.getUp1().getContentType()+","+
                pp.getUp1().isEmpty()
                );
        System.out.println("up2-----------");
        for (MultipartFile mf : pp.getUp2()){
            System.out.println(
                    mf.getOriginalFilename()+","+
                    mf.getSize()+","+
                    mf.getContentType()+","+
                    mf.isEmpty()
            );
        }

        //up1만 파일 저장
        // 파일 저장위치 (나중 이미지 파일등을 불러오기 위한 위치) - 정적 폴더 위치
        // rewources/static  이하 에 저장  rewources/static/fff/BDJY9060.JPG
        // 접근경로 : 호스트IP:포트/이하주소임
        // localhost/fff/BDJY9060.JPG

        String dirPath= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff";
        if(!pp.getUp1().isEmpty()){ //파일이 존재한다면
            try {
                Files.copy(
                        pp.getUp1().getInputStream(),
                        Paths.get(dirPath+"\\"+pp.getUp1().getOriginalFilename()),
                        StandardCopyOption.REPLACE_EXISTING
                        );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return "file/comp";
    }
}
