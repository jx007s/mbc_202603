package aaa.controll_p;

import aaa.model_p.Member;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/file/member")
public class MemberJoinConotrller {

    @GetMapping
    String form(){
        return "file/memberForm";
    }

    @PostMapping
    String comp(Member mm, HttpServletRequest request){

        //현재시각
        mm.setReg_date(LocalDate.now());

        String dst = "file/alert";

        if(!mm.getPic().isEmpty() &&
        Pattern.matches(".{1,}[.](bmp|jpeg|jpg|png|gif)", mm.getPic().getOriginalFilename().toLowerCase() )
        ){ //파일이 존재한다면

            String dirPath = request.getServletContext().getRealPath("fff");
            dirPath= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff";
            try {
                Files.copy(
                        mm.getPic().getInputStream(),
                        Paths.get(dirPath+"\\"+mm.getPic().getOriginalFilename()),
                        StandardCopyOption.REPLACE_EXISTING
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            dst = "file/memberComp";
        }

        return dst;
    }
}
