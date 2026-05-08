-- 1. 산술연산자

select 15+7,15-7,15*7,15/7,15%7;

select *, 15+7,15-7,15*7,15/7,15%7 from person;

select * , kor + eng + mat as tot from exam;

-- select '아기상어' + '뚜루루뚜루'; 에러발생

-- 문자열 결합
select '아기상어' || '뚜루루뚜루';


-- 2. 비교연산자
select 15>7,15>=7,15<=7,15<7,15=7, 15!=7, 15<>7;
--                            같다  다르다  다르다

-- 문자열도 크기비교 가능
select 
'정하성'>'정좌성',
'정하성'>='정좌성',
'정하성'<='정좌성',
'정하성'<'정좌성',
'정하성'='정좌성',
'정하성'!='정좌성',
'정하성'<>'정좌성';

select * from person;


select * from person where pame = '장동건';

--3. % 0~n 개의 문자  ,  _ 한 개의 문자
select * from person where pame = '%건';

select * from person where pame like '%건';

select * from person where pame like '장%';
select * from person where pame like '%장%';


select * from person where pame like '_건';



-- 4. 논리 연산자
select TRUE, false;
select TRUE and true, true and false, false and false;
select TRUE or true, true or false, false or false;
-- select TRUE && true, true && false, false && false; && 범위 연산자 임

select 75 >= 70  and 75 < 80;
select 75 BETWEEN 70  and  80;  -- 70 이상 80 이하
select 75 BETWEEN 80  and  70;  -- 80 이상 70 이하


-- 5. in
--  '장동건','장서건','장남건','장북건' 안에 '장남건' 이 존재하는지
select '장남건' in ('장동건','장서건','장남건','장북건');
select '정우성' in ('장동건','장서건','장남건','장북건');

select ('장동건',41) in (
('장동건',23),
('장동건',41),
('장서건',50),
('장남건',36),
('장북건',25));


select ('장동건',36) in (
('장동건',23),
('장동건',41),
('장서건',50),
('장남건',36),
('장북건',25));


-- 6. not
select 15>7,15>=7,15<=7,15<7,15=7, 15!=7, 15<>7;
select not 15>7,not 15>=7,not 15<=7,not 15<7, not 15=7, not 15!=7, not 15<>7;


-- 7. null
--  = , != , <>  비교연산자 처리 불가
-- is null, is not null 로 처리
select * from person where birth = null;  -- 데이터 없음
select * from person where birth != null;  -- 데이터 없음

select * from person where birth is null;
select * from person where birth is not null;

-- select * where birth is null from person ; 명령어 순서에 맞추어야 함

-- 8. order by : 정렬
/*
select 컬럼명 from 테이블명
where : 조건
order by : 정렬
*/


select * from exam;

select * from exam
order by hakgi, name desc, pid;   -- order by 에 작성한 순서대로 정렬기준 임
-- asc : 오름차순(생략가능, 기본값)  , desc : 내림차순
-- 컬럼명 뒤에 정렬방식 기재


-- exam 테이블을 이용하여 학기, 시험이름, 학생, 국어,영어,수학,총점,평균 을 출력하세요
-- 평균이 60점 이상인 학생들만 출력
-- 학기 내림,name 올림, 평균 내림 순으로 정렬하여 출력하세요

