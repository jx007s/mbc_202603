-- 현재
select  CURRENT_DATE, CURRENT_TIME, CURRENT_TIMESTAMP, LOCALTIMESTAMP, now();

-- 특정날짜 
-- 문자열 -> 날짜
select 
to_date('2026-05-07','YYYY-MM-DD'),
to_timestamp('2026-05-07 14:26:35','YYYY-MM-DD HH24:MI:SS');

-- 날짜->문자열
select 
to_char(now(), 'YYYY-MM-DD'),
to_char(now(), 'YYYY'),			--4자리연도 	: 2026
to_char(now(), 'YY'),			--2자리연도	: 26
to_char(now(), 'M'),			--글자 M		: M
to_char(now(), 'MM'),			--월 2자리 	: 05
to_char(now(), 'MON'),			--축약된월	: SEP
to_char(now(), 'MONTH'),		--전체월		: SEPTEMBER
to_char(now(), 'DD'),			-- 일		: 08
to_char(now(), 'D'),
to_char(now(), 'YY'),
to_char(now(), 'YY'),
to_char(now(), 'YY'),
to_char(now(), 'YY'),
to_char(now(), 'YY'),
to_char(now(), 'YY'),
to_char(now(), 'YY');
