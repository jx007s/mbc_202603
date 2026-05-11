select ceil(123.456),ceil(-123.456),ceil(456.789),ceil(-456.789);
select floor(123.456),floor(-123.456),floor(456.789),floor(-456.789);
select round(123.456),round(-123.456),round(456.789),round(-456.789);
select round(123.432,2),round(-123.432,2),round(456.789,2),round(-456.789,2);
select trunc(123.456),trunc(-123.456),trunc(456.789),trunc(-456.789);
select trunc(123.432,2),trunc(-123.432,2),trunc(456.789,2),trunc(-456.789,2);
select abs(123.456),abs(-123.456),abs(456.789),abs(-456.789);

select exp(1), ln(10),log(10), pi();

select sin(30),cos(30),tan(30),atan(1);
select 
sin(30*pi()/180),
cos(30*pi()/180),
tan(30*pi()/180),
atan(1);

--  부호    -1:음수 , 0:0 ,  1:양수
select sign(-10),sign(0),sign(10);

select power(2,4), sqrt(2), cbrt(27), factorial(5);

-- 최대 최소
select GREATEST(20,40,5,30), LEAST(20,40,5,30);

-- 0< r < 1 난수 발생
select random();

-- exam 총점, 평균 을 구하세요 평균은 소숫점 2자리에서 반올림

select *, round(tot::numeric/3,2) as avg from
(select *, kor+eng+mat as tot from exam);

-- COALESCE(값, null일때 대체값) : 1번째 항이 null 이 아니면 1번째항리턴, null 이명 2번째항 리턴
select * , COALESCE(birth,'2010-07-08') from person;





