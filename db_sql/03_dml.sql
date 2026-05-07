
/*
DML

데이터 삽입 
리턴 - 입력된 레코드 수
insert into 테이블명 (컬럼명1, 컬럼명2, 컬럼명3)
            values ( 값1  ,  값2,  값3);

문자열, 날짜, 시간 : ' ' 안에 표기
*/
insert into person (pid,    pame,  age, height,    birth,       reg_date) 
            values ('aaa','장동건', 58 , 184.3 , '1970-03-15','2025-03-09 09:30:25');


-- 컬럼을 선택하여 입력 가능
-- 현재 ==> CURRENT_TIMESTAMP :날짜시간, CURRENT_DATE:날짜, CURRENT_TIME : 시간
insert into person (age, height,   pid,  reg_date) 
            values (27 , 174.3 , 'aaa', CURRENT_TIMESTAMP);


-- 다중 입력
insert into person ( pid,  pame, age, height,  reg_date) values 
('kkk','장발장',57 , 146.3 , CURRENT_TIMESTAMP),
('mmm','강서건',17 , 178.3 , CURRENT_TIMESTAMP),
('nnn','장동준',37 , 164.3 , CURRENT_TIMESTAMP),
('ooo','최장군',67 , 184.3 , CURRENT_TIMESTAMP),
('ppp','장',25 , 146.3 , CURRENT_TIMESTAMP);


/*
검색
- 리턴은 list 형태
*/


-- * : 테이블의 모든 컬럼
-- SELECT * FROM 테이블명;
select * from person;

-- SELECT 컬럼명1,컬럼명2,컬럼명3 FROM 테이블명;
select  age ,pame, pid,birth from person;


-- as : 검색한 컬럼명을 별칭으로 변경하여 리턴
-- SELECT 컬럼명1,컬럼명2,컬럼명3 as 별칭 FROM 테이블명;
select  age ,pame as per_name, pid,birth as b_day from person;

-- where : 조건절
select * from person 
where age >=30;



/* 수정 
리턴 - 수정된 레코드 수
UPDATE 테이블명 SET 필드명1='필드값1', 필드명2='필드값2' ...
WHERE 검색조건 ;
*/

-- 조건절이 없으므로 모든 레코드의 birth 값이 변경
update person set birth = '2000-06-07';

-- pid가 'aaa' 이면서 pame 이 null 인 레코드를 변경
update person set pid = 'hhh', pame = '저건' 
where pid = 'aaa' and pame is null;

/*
삭제 
리턴 - 삭제된 레코드 수
DELETE FROM  테이블명
WHERE 검색조건 ;
*/

delete from person where pid = 'fff' or pid = 'ggg';


/*
EXAM 테이블을 생성 및 데이터 입력하세요


컬럼명
시번,학기, 종류, 응시생,응시일,국어, 영어, 수학
id,  hakgi, name,  pid, reg_date, kor, eng, mat
숫자 숫자,   문자  문자   날짜     숫자  숫자 숫자

입력내용
학생별
1학기 중간, 기말
2학기 중간, 기말 
을 입력 하세요

학생이 4명 * 시험종류4 = 16개
exam  
id, hakgi, name,  pid, reg_date, kor, eng, mat
1,		1 , semi  ddd 	'2019-5-4' 77 78 71
2,		1 , semi  eee 	'2019-5-4' 87 88 81
3,		1 , final  ddd	 '2019-7-4' 56 65 71
4,		1 , final  fff	 '2019-7-4' 76 65 41
5,		2 , semi  fff 	'2019-10-4' 97 98 91
6,		2 , semi  mmm 	'2019-10-4' 67 68 61
7,		2 , final  rrr	 '2019-12-4' 76 85 91
8,		2 , final  ttt	 '2019-12-4' 66 85 21
...

*/


create table exam(
	id int8,  
	hakgi  int8, 
	name "text",  
	pid "text", 
	reg_date date, 
	kor  int8, 
	eng  int8, 
	mat  int8
);

insert into exam (id, hakgi, name,  pid, reg_date, kor, eng, mat)
values 
(11,1 , 'semi', 'aaa',	'2019-5-4' ,77 ,78, 71),
(12,1 , 'semi', 'bbb',	'2019-5-4' ,87 ,88, 81),
(13,1 , 'final', 'ccc',	 '2019-7-4', 56 ,65 ,71),
(14,1 , 'final', 'aaa',	 '2019-7-4', 76 ,65 ,41),
(15,2 , 'semi', 'bbb',	'2019-10-4', 97 ,98 ,91),
(16,2 , 'semi', 'aaa',	'2019-10-4', 67 ,68 ,61),
(10,2 , 'final', 'bbb',	 '2019-12-4', 76, 85, 91),
(9,	2 , 'final', 'ddd',	 '2019-12-4', 66, 85, 21);


select * from exam;

