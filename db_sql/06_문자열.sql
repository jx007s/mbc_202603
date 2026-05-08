select 
left('아기상어 뚜루루뚜루',2),
right('아기상어 뚜루루뚜루',2),
substring('아기상어 뚜루루뚜루',3,5); -- 상어 뚜루 : 3부터 5자, 1부터 시작

select 
char_length('아기상어 뚜루루뚜루'),  -- 10 문자열 길이
character_length('아기상어 뚜루루뚜루'),  --10 문자열 길이
length('아기상어 뚜루루뚜루');  --10 문자열 길이

select
upper('aBCd Efg 나는무너'),		--ABCD EFG 나는무너
lower('aBCd Efg 나는무너'),		--abcd efg 나는무너
initcap('aBCd Efg 나는무너');	--Abcd Efg 나는무너 (첫글자대문자나머지소문자)

select
position('BC' in '엠비씨 aBCd Efg 나는무너BC'),	-- 6 : 위치 검색
strpos( '엠비씨 aBCd Efg 나는무너BC', 'BC');	-- 6 : 위치 검색

select 
repeat('MBC',5), 									--MBCMBCMBCMBCMBC : 반복
replace('MBC abcd Efg 나는무너BC','BC','비씨'), 		--M비씨 abcd Efg 나는무너비씨 : 치환
translate('MBC abcd Efg 나는무너BC','BC','비씨'); 	--M비씨 abcd Efg 나는무너비씨 : 치환

select '나는' || '무너' || '꿈을꾸는' || '무너';		-- 합치기 : 나는무너꿈을꾸는무너



select 
btrim('*****MBC 아*카*데*미*****','*'),		--MBC 아*카*데*미
ltrim('*****MBC 아*카*데*미*****','*'),		--MBC 아*카*데*미*****
rtrim('*****MBC 아*카*데*미*****','*'),		--*****MBC 아*카*데*미
trim('*****MBC 아*카*데*미*****','*'),		--MBC 아*카*데*미
trim('     MBC 아*카*데*미     ');			--MBC 아*카*데*미


select 
lpad('MBC it',10, '&'),					-- 10자 맞추기 : &&&&MBC it
lpad('MBC it 아카데미 서면',10, '&'),		-- 10자 맞추기 : MBC it 아카데
rpad('MBC it',10, '&'),					-- 10자 맞추기 : MBC it&&&&
rpad('MBC it 아카데미 서면',10, '&');		-- 10자 맞추기 : MBC it 아카데

-- 1 ==> A학기, 2 ==> B학기 로 바꾸어 출력하세요