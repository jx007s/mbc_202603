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

-- % 0~n 개의 문자  ,  _ 한 개의 문자
select * from person where pame = '%건';

select * from person where pame like '%건';

select * from person where pame like '장%';
select * from person where pame like '%장%';


select * from person where pame like '_건';
