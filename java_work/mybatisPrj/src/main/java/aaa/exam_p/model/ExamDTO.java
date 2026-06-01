package aaa.exam_p.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExamDTO {
    int id, hakgi, kor, eng, mat;
    String name, pid;
    LocalDate reg_date;
}
