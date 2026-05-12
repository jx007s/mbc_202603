-- 테이블 레코드 대비 곱형태의 데이터 리턴
select * from exam, person;

-- equal 조인 : 각 테이블에 조건에 적합한 데이터만 리턴
select * from exam, person
where exam.pid = person.pid;

-- outer 조인
-- left outer join :    테이블A  left join 테이블B 
--  왼쪽테이블(테이블A) 데이터는 모두 리턴 , 오른쪽테이블(테이블B)는 해당데이터있을경우 리턴, 없으면 null
 
select * from exam
left join person
on exam.pid = person.pid;


select * from exam
right join person
on exam.pid = person.pid;

select * from person
where pid = friend;

-- 테이블 이름을 새로 주어야 하는 경우 별칭 사용 me, fr
-- 셀프조인
select me.* , fr.pame as fr_name from person me, person fr
where fr.pid = me.friend;


select me.* , fr.pame as fr_name from person me
left join person fr
on fr.pid = me.friend;

/*
교수테이블을 생성하세요
professor - "pid" "NAME", "TEL"

학생테이블에 교수를 추가하시고 각 학생마다 교수를 지정하세요 (pid)

1. 학생별 교수 이름을 출력하세요

2. 교수별 학생중 가장 높은 평균점수를  출력하세요 (group by)

*/


create table professor(
	"pid"  text,
	"NAME" text, 
	"TEL"  text
);


insert into professor("pid", "NAME", "TEL")
values
('pf1','김교수','1234'),
('pf2','이교수','5678'),
('pf3','박교수','9012'),
('pf4','최교수','3456');


-- 1번
select person.*, professor."NAME" from person
left join professor
on pfid = professor.pid;


-- 2번
select  pf_name, max(avgg) from
(select *, (kor+eng+mat)/3 as avgg from exam
left join
(select person.*, professor."NAME" as pf_name from person
left join professor
on pfid = professor.pid) ppf
on exam.pid = ppf.pid)
group by  pf_name;

