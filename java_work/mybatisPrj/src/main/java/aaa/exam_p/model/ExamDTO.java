package aaa.exam_p.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class ExamDTO {
    int id, hakgi, kor, eng, mat , jum;
    String name, pid, upFF;
    LocalDate regDate;
    MultipartFile upFile;
}
