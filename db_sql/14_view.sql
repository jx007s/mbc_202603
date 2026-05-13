/*
view 정의
create view 뷰이름 as
  쿼리문

*/

create view ex_vvv as
select *, kor+eng+mat as tot , (kor+eng+mat)/3 as avg from exam;


select * from ex_vvv;


insert into ex_vvv (id, pid, kor,eng,mat) values
(17,'u1',87,76,65);

/*  tot, avg  ==> 가상의 컬럼이므로(계산식에 의한 컬럼 , 실제 저장할 컬럼이 없음)
    에러발생
insert into ex_vvv (id, pid, kor,eng,mat,tot,avg) values
(26,'u1',20,20,20,60,20);
*/


create view max_exam as
select max(kor) as m_kor, max(eng) as m_eng, max(mat) as m_mat from exam;

select * from max_exam;

insert into max_exam (m_kor, m_eng,m_mat) values
(11,22,33);

/* 같은 이름의 view 가 존재하여 에러발생
create view ex_vvv as
select exam.*, kor+eng+mat as tot , (kor+eng+mat)/3 as avg, pame from exam
left join person
on exam.pid = person.pid;
*/

/* view 정의 또는 수정
정의문 이하 쿼리문을 덮어쓰기 하여 view 변경

create or replace 기존view이름 as
   변경할 쿼리문
*/
create or replace view ex_vvv as
select exam.*, kor+eng+mat as tot , (kor+eng+mat)/3 as avg, pame from exam
left join person
on exam.pid = person.pid;

-- view 이름 변경
--         기존이름          새로운이름
alter view ex_vvv rename to exam_vvv;

-- view 삭제
drop view exam_vvv;

