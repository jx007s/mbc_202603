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


