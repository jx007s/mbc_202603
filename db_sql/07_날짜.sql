-- 현재
select  CURRENT_DATE, CURRENT_TIME, CURRENT_TIMESTAMP, LOCALTIMESTAMP, now();

-- 특정날짜 
-- 문자열 -> 날짜
select 
to_date('2026-05-07','YYYY-MM-DD'),
to_timestamp('2026-05-07 14:26:35','YYYY-MM-DD HH24:MI:SS');

-- 날짜->문자열
-- 날짜
select 
to_char(now(), 'YYYY-MM-DD'),
to_char(now(), 'YYYY'),			--4자리연도 	: 2026
to_char(now(), 'YY'),			--2자리연도	: 26
to_char(now(), 'M'),			--글자 M		: M
to_char(now(), 'MM'),			--월 2자리 	: 05
to_char(now(), 'MON'),			--축약된월	: SEP
to_char(now(), 'MONTH'),		--전체월		: SEPTEMBER
to_char(now(), 'DD'),			-- 일		: 08
to_char(now(), 'D'),			--요일(1:일요일-7:토요일): 6(금요일)
to_char(now(), 'DY'),			--축약된요일	: FRI
to_char(now(), 'DAY'),			--전체요일	: FRIDAY   
to_char(now(), 'WW'),			--주번호(년1-53) : 19
to_char(now(), 'DDD');			--연중일		: 128

-- 시간
select 
to_char(now(), 'HH24'),		--24시간	: 17
to_char(now(), 'HH12'),		--12시간	: 05
to_char(now(), 'MI'),		-- 분	: 27
to_char(now(), 'SS'),		-- 초	: 01
to_char(now(), 'AM'),		--오전오후: PM
to_char(now(), 'MS'),		--밀리초 : 627
to_char(now(), 'US');		--마이크로초:627182




-- 2023-08-09 15:06:45를 2023년 8월 09일 (수) 15:06:45 PM 으로 출력하세요

select now(), 
to_char(now(), 'YYYY년 MM월 DD일 (') ||
substring('일월화수목금토', to_char(now(), 'D')::int,1)  ||
to_char(now(), ') HH24:MI:SS AM') ;


select to_timestamp('2023-08-09 15:06:45','YYYY-MM-DD HH24:MI:SS'),
to_char(to_date('2023-08-09 15:06:45','YYYY-MM-DD HH24:MI:SS'), 'YYYY년 MM월 DD일 (') ||
substring('일월화수목금토', to_char(to_date('2023-08-09 15:06:45','YYYY-MM-DD HH24:MI:SS'), 'D')::int,1)  ||
to_char(to_timestamp('2023-08-09 15:06:45','YYYY-MM-DD HH24:MI:SS'), ') HH24:MI:SS AM') ;


-- 계산
select 
date '2025-05-08' + INTERVAL '7 century', 					-- 100년
date '2025-05-08' + INTERVAL '7 decades', 					-- 10년
date '2025-05-08' + INTERVAL '7 years',		 				-- 년
date '2025-05-08' + INTERVAL '7 months',					-- 월
date '2025-05-08' + INTERVAL '7 weeks',						-- 주
date '2025-05-08' + INTERVAL '7 days',						-- 일
timestamp '2025-05-08 14:12:35' + INTERVAL '7 hours',		-- 시간
timestamp '2025-05-08 14:12:35' + INTERVAL '7 minutes',		-- 분
timestamp '2025-05-08 14:12:35' + INTERVAL '7 seconds',		-- 초
timestamp '2025-05-08 14:12:35' + INTERVAL '7 milliseconds',-- 1/1000초
timestamp '2025-05-08 14:12:35' + INTERVAL '7 microseconds';-- 1/1000000초

select 
now() + INTERVAL '7 century', 					-- 100년
now() + INTERVAL '7 decades', 					-- 10년
now() + INTERVAL '7 years',		 				-- 년
now() + INTERVAL '7 months',					-- 월
now() + INTERVAL '7 weeks',						-- 주
now() + INTERVAL '7 days',						-- 일
now() + INTERVAL '7 hours',		-- 시간
now() + INTERVAL '7 minutes',		-- 분
now() + INTERVAL '7 seconds',		-- 초
now() + INTERVAL '7 milliseconds',-- 1/1000초
now() + INTERVAL '7 microseconds';-- 1/1000000초

select 
CURRENT_DATE + INTERVAL '7 century', 					-- 100년
CURRENT_DATE + INTERVAL '7 decades', 					-- 10년
CURRENT_DATE + INTERVAL '7 years',		 				-- 년
CURRENT_DATE + INTERVAL '7 months',					-- 월
CURRENT_DATE + INTERVAL '7 weeks',						-- 주
CURRENT_DATE + INTERVAL '7 days',						-- 일
CURRENT_TIMESTAMP + INTERVAL '7 hours',			-- 시간
CURRENT_TIMESTAMP + INTERVAL '7 minutes',		-- 분
CURRENT_TIMESTAMP + INTERVAL '7 seconds',		-- 초
CURRENT_TIMESTAMP + INTERVAL '7 milliseconds',-- 1/1000초
CURRENT_TIMESTAMP + INTERVAL '7 microseconds';-- 1/1000000초

select now() - date '2026-05-07';	--6 days 22:11:22.243123
select date '2026-05-24' - date '2026-05-07';	--17
select age(now() , date '2026-05-07');	--6 days 22:11:22.243123
select age(date '2026-05-24' , date '2026-05-07');	--17 days


-- 날짜비교
select date '2026-05-08' > date '2025-07-04';
select date '2025-05-08' between date '2026-01-01' and date '2026-12-31';


-- extract : 날짜 --> 특정 필드값 숫자로 추출
select 
EXTRACT(YEAR from now()),		--년
EXTRACT(MONTH from now()),		--월
EXTRACT(DAY from now()),		--일
EXTRACT(HOUR from now()),		--시
EXTRACT(MINUTE from now()),		--분
EXTRACT(SECOND from now()),		--초
EXTRACT(DOW from now()),		--요일
EXTRACT(ISODOW from now()),		--요일(ISO)
EXTRACT(DOY from now()),		--1년중 날짜
EXTRACT(WEEK from now()),		--주차
EXTRACT(QUARTER from now())		--분기
;


-- date_part : 날짜 --> 특정 필드값 숫자로 추출
select 
date_part('year', now()),		--년
date_part('MONTH', now()),		--월
date_part('DAY',now()),			--일
date_part('HOUR', now()),		--시
date_part('MINUTE', now()),		--분
date_part('SECOND', now()),		--초
date_part('DOW', now()),		--요일  일:0 - 토:6
date_part('ISODOW',now()),		--요일(ISO)
date_part('DOY', now()),		--1년중 날짜
date_part('WEEK', now()),		--주차
date_part('QUARTER', now())		--분기
;


-- 타임존
select now();
select 
now() at time ZONE 'UTC',
now() at time ZONE 'Asia/Seoul',
now() at time ZONE 'Asia/Pyongyang',
now() at time ZONE 'Asia/Shanghai',
now() at time ZONE 'Asia/Tokyo',
now() at time ZONE 'America/New_York',
now() at time ZONE 'America/Los_Angeles',
now() at time ZONE 'Europe/London',
now() at time ZONE 'Europe/Paris',
now() at time ZONE 'Africa/Cairo',
now() at time ZONE 'Africa/Algiers',
now() at time ZONE 'Australia/Sydney',
now() at time ZONE 'Australia/Sydney',
now() at time ZONE 'Australia/Brisbane';

select 
now() at time ZONE 'UTC',
now() at time ZONE 'KST',
now() at time ZONE 'PST',
now() at time ZONE 'CET',
now() at time ZONE 'CST';

-- 주민번호를 이용하여 출생일의 요일을 구하세요
select substring('일월화수목금토', extract(DOW from to_date(left('260511-1234567',6),'YYMMDD'))::int+1 ,1) ;
