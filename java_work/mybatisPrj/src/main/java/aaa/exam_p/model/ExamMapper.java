package aaa.exam_p.model;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExamMapper {

    // #{limit} : pInfo.getLimit() --> PrepareStatement의 ? 와 맵핑 기능을 처리
    @Select("select * from exam order by id desc limit #{limit} offset #{offset}")
    List<ExamDTO> list(PageInfo pInfo);

    @Select("select * from exam where id = #{id}")
    ExamDTO detail(ExamDTO dto);

    // 본 쿼리 실행 전 혹은 후에 쿼리문을 실행하여 매개변수 객체의 멤버변수에 대입
    //keyProperty = "id" 입력할 멤버변수명
    // resultType = Integer.class 입력시킬 값의 자료형
    // before = false  본쿼리 실행 전에 할 것인지 true:실행전, false : 실행후
    // statement = "select max(id) from exam" 실행시킬 쿼리문
    @SelectKey(keyProperty = "id", resultType = Integer.class, before = false, statement = "select max(id) from exam")
    @Insert("insert into exam (hakgi,name, pid, kor, eng, mat,reg_date, upff) values "+
            " (#{hakgi}, #{name},#{pid},#{kor},#{eng},#{mat},#{regDate}, #{upFF})")
    int insert(ExamDTO dto);

    @Delete("delete from exam where id = #{id}")
    int delete(ExamDTO dto);

    @Update("update exam set hakgi = #{hakgi},name =  #{name}, pid = #{pid}, kor = #{kor}, "+
            " eng = #{eng}, mat = #{mat} where id = #{id}")
    int modify(ExamDTO dto);

    @Select("select count(*) as tot from exam")
    int tot();


    /////////-----------동적 쿼리

    @Select("<script> "+
            " select * from exam "+
            " <where> "+
            " <if test='schVal != null'> "+
            " pid like '%'||#{schVal}||'%'  "+

            " </if> "+
            " <if test='nameVal != null'> "+  // else 가 없는 if 문
            " and "+
            " name = #{nameVal}  "+
            " </if> "+
            " </where> "+
            " order by id desc " +
            " </script>")
    List<ExamDTO> listsch(PageInfo pInfo);


    // choose>when, otherwise : if ~ else if ~else 와 같음
    @Select("<script> "+
            " select id , "+
            " <choose> "+
            " <when test='classNo==1'> "+
            " kor as jum "+
            " </when> "+
            " <when test='classNo==2'> "+
            " eng as jum "+
            " </when> "+
            " <otherwise> "+
            " mat as jum "+
            " </otherwise> "+
            " </choose> "+
            " from exam "+
            " </script>")
    List<ExamDTO> list2(PageInfo pInfo);


    //foreach : 반복데이터처리
    // collection='arr' :  List 혹은 Array 인 열거데이터- 보통 DTO를 원소로 한다
    //  item='dd'   :   반복 원소 1개
    //  separator=','  : 반복되어 생성된 문자열 사이 구분글자
    // index='i'   :   반복순서  0,1,2,3 ...
    // for(ExamDTO dd : pInfo.getArr() ) { ... }
    @Insert(
            "<script> "+
            " insert into exam (hakgi,name, pid, kor, eng, mat,reg_date) values "+
            " <foreach collection='arr' item='dd' separator=',' index='i' > "+
            " (#{dd.hakgi}, #{dd.name},#{dd.pid},#{dd.kor},#{dd.eng},#{dd.mat},#{dd.regDate} ) "+
            " </foreach> "+
            " </script>")
    int insertList(PageInfo pInfo);
}
