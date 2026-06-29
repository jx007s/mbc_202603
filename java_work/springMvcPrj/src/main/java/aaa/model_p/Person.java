package aaa.model_p;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Person {
    String pname;
    int age;
    boolean marriage;
    MultipartFile up1, ff;
    MultipartFile [] up2;
}
