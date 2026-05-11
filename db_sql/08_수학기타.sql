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

/*조건 

case
	when 조건1 then 조건1값
	when 조건2 then 조건2값
	when 조건3 then 조건3값
	else 예외값
end
*/

select
  *,
  case
  	when age >= 60 then '장년'
  	when age >= 40 then '중년'
  	when age >= 20 then '청년'
  	when age >= 10 then '청소년'
	else '응애에요'
  end
from person;

-- 조건집계함수 : filter
select 
	count(*) filter(where age >= 40 and age < 50) as a40,
	count(*) filter(where age >= 30 and age < 40) as a30,
	count(*) filter(where age >= 20 and age < 30) as a20,
	count(*) filter(where age >= 10) as a10					-- else if 형태가 아님
	from person;

-- exam 평균을 계산하고 수우미양가를 출력하세요
select * ,
case ten
	when 10 then '수'
	when 9 then '수'
	when 8 then '우'
	when 7 then '미'
	when 6 then '양'
	else '가'
end as grade
from
(select * , avg/10 as ten from
(select *, tot/3 as avg from
(select *, kor+eng+mat as tot from exam)));


-- 출력한 후 수우미양가 구간별 인원수를 출력하세요
select 
	count(*) filter(where avg >= 90) as "수",
	count(*) filter(where avg >= 80 and avg < 90) as "우",
	count(*) filter(where avg >= 70 and avg < 80) as "미",
	count(*) filter(where avg >= 60 and avg < 70) as "양",
	count(*) filter(where avg < 60) as "가"
	
from
(select tot/3 as avg from
(select *, kor+eng+mat as tot from exam));


-- 암호화(encode())시 pgcrypto 설치 필요
create extension if not exists pgcrypto;

-- 암호화 : 평서문 -> 암호문
select 
encode(			-- 암호화 함수
	encrypt('hello mbc','asdf'::bytea,'aes'),		-- 암호화 방식
	--     평서문      비밀키   암호방식
	--    평서문은 한글인 경우 인코딩 필요
	--    비밀키 : byteArray 방식 bytea 필요
	-- 		암호방식 : aes, aes128, aes192 aes256, bf, des, des3, cast
	'base64'		-- 암호내용(바이너리데이터)을 문자열로 변환
);

-- Looe7+FRhj2MQI/XIRDKYw==

-- 복호화 : 암호문 -> 평서문
select convert_from(
	decrypt(
		decode('Looe7+FRhj2MQI/XIRDKYw==', 'base64'), -- 문자열 -> bytea(바이너리데이터) 변환
		'asdf'::bytea,		-- 비밀키 : byteArray 방식 bytea 필요
		'aes'				-- 암호방식
	),
	'UTF8'					-- 인코딩방식 지정
);
-- hello mbc



-- 평서문이 한글인 경우 인코딩
select 
encode(			-- 암호화 함수
	encrypt(convert_to('아기상어','UTF8'),'asdf'::bytea,'aes'),		-- 암호화 방식
	--     평서문      비밀키   암호방식
	--    평서문은 한글인 경우 인코딩 필요
	--    비밀키 : byteArray 방식 bytea 필요
	-- 		암호방식 : aes, aes128, aes192 aes256, bf, des, des3, cast
	'base64'		-- 암호내용(바이너리데이터)을 문자열로 변환
);

-- '아기상어' -> 'bT7tyQTWrcHj0IdF1dWDjQ=='


select convert_from(
	decrypt(
		decode( 'bT7tyQTWrcHj0IdF1dWDjQ==', 'base64'), -- 문자열 -> bytea(바이너리데이터) 변환
		'asdf'::bytea,		-- 비밀키 : byteArray 방식 bytea 필요
		'aes'				-- 암호방식
	),
	'UTF8'					-- 인코딩방식 지정
);
-- 'bT7tyQTWrcHj0IdF1dWDjQ==' -> '아기상어'

-- 해시 암호화 (단방향으로만 암호화, 복호화 불가)
select digest('1234qawer' ,'sha256');
-- \x40bf40428973fd6db2490d128e3f65227d361ba16549561f8e009bccef601232

insert into person(pid, pame)
values ('qqq', digest('1234qawer' ,'sha256'));


/*
-- 해시함수 암호화 방식
md5(평서문)
digest(평서문 ,'sha1')
digest(평서문 ,'sha224')
digest(평서문 ,'sha256')
digest(평서문 ,'sha384')
digest(평서문 ,'sha512')
*/

-- 일치
select * from person
where pid = 'qqq' and digest('1234qawer' ,'sha256') = pame::bytea;

-- 일치정보 없음
select * from person
where pid = 'qqq' and digest('5678qawer' ,'sha256') = pame::bytea;

/*
member 테이블
pid, pname, pw, zipcode, addr1, addr2, email, tel

email 양방향 암호화
pw    해시 암호화

5명의 데이터를 입력하세요
*/





