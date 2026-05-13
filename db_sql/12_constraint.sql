create table reservation(
	no serial,		-- 1씩 자동증가
	pname VARCHAR(100)
);

insert into reservation (no, pname) values
(10,'한가인'),
(11,'두가인'),
(12,'세가인'),
(13,'네가인');


insert into reservation (pname) values
('고윤정'),('중윤정'),('초윤정'),('대윤정');


-- no 에 자동증가하여 값 입력 : 1부터 시작
-- 중복 가능 :10,11,12 가 중복됨
insert into reservation (pname) values
('1효리'),('2효리'),('3효리'),('4효리'),('5효리'),('6효리'),('7효리'),('8효리');


create table reservation_pk(
	no serial PRIMARY key,		-- 1씩 자동증가, 기본키
	pname VARCHAR(100)
);

insert into reservation_pk (no, pname) values
(10,'한송이'),
(11,'두송이'),
(12,'세송이'),
(13,'네송이');

insert into reservation_pk (pname) values
('고수'),('중수'),('하수'),('밀수');

-- 에러발생
-- 10번째에서 중복되어 에러발생  : 번호 부여시 기존 번호 있을경우 회피하지 못함
insert into reservation_pk (pname) values
('1주현'),('2주현'),('3주현'),('4주현'),('5주현'),('6주현'),('7주현'),('8주현');


-- Identity 자동증가 , 직접 값 입력 불가
create table reservation_iden(
	no int GENERATED always as Identity,
	pname VARCHAR(100)
);

/*
insert into reservation_iden (no, pname) values
(10,'한송이'),
(11,'두송이'),
(12,'세송이'),
(13,'네송이');
*/

-- no 자동입력
insert into reservation_iden (pname) values
('고수'),('중수'),('하수'),('밀수');


-- 테이블 정의시 제약조건 설정 
create table stud(
	sid text PRIMARY key,		-- 기본키
	pname text not null,		-- null 허용안함
	tel text UNIQUE,			-- 중보
	hobby text
);


-- 테이블 정의후 제약 조건 추가
create table stud2(
	sid text,		
	pname text,		
	tel text,		
	hobby text
);

-- 제약조건 추가
-- PK
alter table stud2 add constraint stud2_sid_pkkk PRIMARY key(sid);

-- unique
alter table stud2 add constraint stud2_tel_unii unique(tel);

-- not null  :: 제약조건 추가가 아닌 column 수정이다
alter table stud2 alter column pname set not null;

-- 외래키 
-- 외래키 : 참조하는 테이블의 기본키를 외래키로 사용
		-- 참조컬럼의 값 or null 가능
		
-- 테이블 정의시 외래키 설정
create table st_exam(
	seid int generated ALWAYS as identity PRIMARY key, --  identity  이면서 PK
	sename text,
	sid text,
	kor int,
	eng int,
	mat int,
	constraint st_exam_sid_fk FOREIGN key(sid) REFERENCES stud(sid)	-- 외래키 설정
	--         제약조건이름     외래키(커럼)                 참조테이블(기본키)
);


-- 테이블 정의후 외래키 추가
create table st2_exam2(
	seid serial PRIMARY key, --  serial 이면서 PK
	sename text,
	sid text,
	kor int,
	eng int,
	mat int
);

alter table st2_exam2 add constraint st2_exam2_sid2_fkkk
FOREIGN key(sid) REFERENCES stud2(sid);

-- 제약조건 조회
select * from pg_constraint;

select 
conname, 	-- 제약조건이름
contype,	-- 제약조건타입
conrelid,				-- 해당 테이블ID
conrelid::regclass		-- 해당 테이블명
from pg_constraint;

-- stud 테이블 제약조건 조회
select 
conname, 	-- 제약조건이름
contype,	-- 제약조건타입
conrelid,				-- 해당 테이블ID
conrelid::regclass		-- 해당 테이블명
from pg_constraint
where conrelid = 'stud'::regclass;

-- stud 테이블 제약조건 조회
select 
conname, 	-- 제약조건이름
contype,	-- 제약조건타입
conrelid,				-- 해당 테이블ID
conrelid::regclass		-- 해당 테이블명
from pg_constraint
where conrelid = 'st_exam'::regclass;

/*
contype
p : PK
f : FK
u : unique
n : not null

*/


-- 제약조건 제거 : 제약조건 이름으로 제거
-- 외래키
alter table st2_exam2 drop constraint st2_exam2_sid2_fkkk;
-- 기본키
alter table stud2 drop constraint stud2_sid_pkkk;

-- alter table stud drop constraint stud_pkey;
-- 외래키로 사용하고 있는 기본키는 제약조건제거 불가

-- unique
alter table stud2 drop constraint stud2_tel_unii ;

-- not null
alter table stud2 alter column pname drop not null;
alter table stud2 alter column sid drop not null;  -- PK 제거후 PK의 not null 도 제거해야함


/*
제약조건 설정
person 
pame : not null
pfid : fk <-- professor(pid) 

exam
pid : fk <--- person(pid)
참조허용 불가 데이터는 null로 변경
*/





