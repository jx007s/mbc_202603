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