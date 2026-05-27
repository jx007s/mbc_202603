package aaa.model_p;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
public class Member {
    String pid, pname;
    int age;
    double height;
    LocalDate reg_date;
    MultipartFile pic, resume;

    public String picStr(){
        return pic.getOriginalFilename();
    }

    public String resumeStr(){
        return resume.getOriginalFilename();
    }

    public void setReg_date(LocalDate reg_date) {
        this.reg_date = reg_date;
    }

    public void setReg_date(String reg_date) {
        System.out.println("setReg_date() 실행 : "+reg_date);
        //1. 패턴 정의
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //2. 파싱
        this.reg_date = LocalDate.parse(reg_date, dtf);
    }
}
