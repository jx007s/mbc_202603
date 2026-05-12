-- 테이블

select * from
(select *, kor+eng+mat as tot from exam); -- from 에서 서브쿼리 사용


-- 조건절
select avg(eng) from exam;
select * from exam where eng >= 78.5;

select * from exam 
where eng >= (select avg(eng) from exam);  -- where 에서 서브쿼리 사용

-- 값

-- 나 :  'ddd'
-- 교수지정 : '최교수'  --> 'pf4'

select pid from professor where "NAME" = '최교수';

insert into person (pid,pame, pfid)
values ('eee','한가인','pf4');

insert into person (pid,pame, pfid)
values ('ddd','두가인',(select pid from professor where "NAME" = '최교수'));  
-- value 에서 서브쿼리 사용

-- 시험번호 4 국어점수를 가장 낮은 영어점수 + 10

select min(mat) from exam;

update exam set kor = 21+10 where id = 5;

update exam set kor = (select min(eng) from exam)+10 where id = 4;
-- update 에서 서브쿼리 사용


-- 영어 80점 이상인 학생 이름
select DISTINCT pame from exam, person
where eng >= 80 and exam.pid = person.pid;

select DISTINCT pid from exam where eng >= 80;

/*
-- 다중처리 에러 
select * from person
where pid = ('fff','rrr','bbb','eee','ddd','ttt');
*/

select * from person
where pid in ('fff','rrr','bbb','eee','ddd','ttt');


select * from person
where pid in (select pid from exam where eng >= 80);

select 
78 >= 70,
78 >= 90;
-- select 78 >= (Array[65,82,91,72]); 에러
--select 78 >= in(Array[65,82,91,72]);
select 
78 >= any(Array[65,82,91,72]),		-- 요소 중 1 조건에 맞는 요소가 1개라도 있을경우 true
78 >= all(Array[65,82,91,72]),		-- 모든 요소가 조건에 충족해야 true
78 >= any(Array[65,52,61,72]),		-- 요소 중 1 조건에 맞는 요소가 1개라도 있을경우 true
78 >= all(Array[65,52,61,73])		-- 모든 요소가 조건에 충족해야 true
;


select mat from exam where pid = 'aaa';
--  71 ,41 , 61

select 
65 >= any(select mat from exam where pid = 'aaa'),
65 >= all(select mat from exam where pid = 'aaa'),
30 >= any(select mat from exam where pid = 'aaa'),
30 >= all(select mat from exam where pid = 'aaa'),
80 >= any(select mat from exam where pid = 'aaa'),
80 >= all(select mat from exam where pid = 'aaa');

-- 나이가 40세 이하인 학생중 국어점수가 80점 이하인 학생의 수학점수를 3점 추가하세요
select pid from person where age <= 40;
select * from exam where kor <= 80;

select * from exam where
pid in(select pid from person where age <= 40) and kor <= 80;

update exam set mat = mat + 3 
where pid in 
(select pid from exam where
pid in(select pid from person where age <= 40) and kor <= 80);

