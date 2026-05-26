package aaa.model_p;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    String pid, pname, reg_date;
    int age;
    double height;
}
