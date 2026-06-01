package aaa.exam_p.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamMapper {

    // #{limit} : pInfo.getLimit() --> PrepareStatement의 ? 와 맵핑 기능을 처리
    @Select("select * from exam order by id desc limit #{limit} offset #{offset}")
    List<ExamDTO> list(PageInfo pInfo);

    @Select("select * from exam where id = #{id}")
    ExamDTO detail(ExamDTO dto);

    @Insert("insert into exam (hakgi,name, pid, kor, eng, mat,reg_date) values (#{hakgi}, #{name},#{pid},#{kor},#{eng},#{mat},#{regDate})")
    int insert(ExamDTO dto);
}
