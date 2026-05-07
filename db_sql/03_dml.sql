
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
('ccc','장서건',57 , 146.3 , CURRENT_TIMESTAMP),
('ddd','장남건',17 , 178.3 , CURRENT_TIMESTAMP),
('eee','장중건',37 , 164.3 , CURRENT_TIMESTAMP),
('fff','북두신건',67 , 184.3 , CURRENT_TIMESTAMP),
('ggg','이건',25 , 146.3 , CURRENT_TIMESTAMP);


/*
검색
- 리턴은 list 형태
SELECT 컬럼명1,컬럼명2,컬럼명3 FROM 테이블명;

* : 테이블의 모든 컬럼
SELECT * FROM 테이블명;

as : 검색한 컬럼명을 별칭으로 변경하여 리턴
SELECT 컬럼명1,컬럼명2,컬럼명3 as 별칭 FROM 테이블명;

*/

select * from person;

select  age ,pame, pid,birth from person;




