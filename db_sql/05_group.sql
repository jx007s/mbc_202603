select * from exam;

-- 집계함수
-- 해당 항목(컬럼) 을 집계한다
-- count, sum, avg, max, min
select sum(kor), count(kor), sum(eng), avg(kor), max(kor), min(kor) from exam;

-- select pid, sum(kor) from exam;  일반 컬럼과 집계함수 혼용 불가

--group by  ::>  컬럼의 같은 값을 기준으로 그룹화
-- group by로 묶은 컬럼은 조회컬럼으로 사용 가능

select hakgi,name, sum(kor), avg(eng), max(mat) from exam
group by hakgi,name;


select hakgi,name, sum(kor), count(kor), avg(kor), max(kor), min(kor) from exam
where pid != 'aaa'  -- 전체에 대한 필터링
group by hakgi,name
having count(kor)<4  -- 그룹화 후 필터링
order by hakgi,name desc;



