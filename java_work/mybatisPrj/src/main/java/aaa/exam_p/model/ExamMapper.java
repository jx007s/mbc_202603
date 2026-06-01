package aaa.exam_p.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamMapper {

    // #{limit} : pInfo.getLimit() --> PrepareStatement의 ? 와 맵핑 기능을 처리
    @Select("select * from exam order by id desc limit #{limit} offset #{offset}")
    List<ExamDTO> list(PageInfo pInfo);
}
