/*
테이블 생성
create table 테이블명(

	컬럼1 자료형,
	컬럼2 자료형,
	컬럼3 자료형,
	...
);

*/

create table member(

	pid varchar(100),
	pname text,
	age int8,
	height numeric(10,2) ,
	birth date,
	reg_date timestamp
);

-- 테이블 이름 변경
alter table member rename to mem;

-- 테이블 컬럼명 변경
alter table mem rename column pname to name;

-- 테이블 컬렴 타입 변경
alter table mem alter column name type varchar(50);


-- 모든 테이블 목록보기
select table_name from information_schema.tables;


-- 현재 테이블 목록보기
select table_name from information_schema.tables
where table_schema = 'public';

-- 테이블 삭제
drop table mem;


/*공대남방 테이블을 정의하세요 shirt  =====================
숫자         문자     실수       날짜,      날짜시간,       정수

옷번호,     제품명,   가격,       출시일,      판매일,      크기(천단위)
*/


create table shirt(
	pno int8,
	title varchar(50),
	price "numeric",
	la_date date,
	sa_date "timestamp",
	size int8
);





