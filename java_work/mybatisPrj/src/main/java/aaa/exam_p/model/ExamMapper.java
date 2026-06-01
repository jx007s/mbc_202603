package aaa.exam_p.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamMapper {

    @Select("select * from exam")
    List<ExamDTO> list();
}
