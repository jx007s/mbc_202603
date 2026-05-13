insert into person (pid, pame) values
('rrr','나는무너');

select * from person order by pid;

-- 트랜젝션 상태 확인
show TRANSACTION ISOLATION LEVEL;
-- read committed : 커밋된 데이터만 읽음

-- autocommit 확인
-- 결과 -  숫자:autocommit OFF,   null :autocommit ON
select txid_current_if_assigned();

commit;  -- 지금까지 작업한 데이터 반영

insert into person (pid, pame) values
('sss','나는고래');

select * from person order by pid;

rollback;   -- 이전 commit 직전까지 작업내용 취소

select * from person order by pid;

insert into person (pid, pame) values ('t1','티라노');
insert into person (pid, pame) values ('t2','브라키오');

SAVEPOINT A;

insert into person (pid, pame) values ('t3','안킬로');
insert into person (pid, pame) values ('t4','랩터');

SAVEPOINT B;

insert into person (pid, pame) values ('t5','프테라노돈');
insert into person (pid, pame) values ('t6','익룡');

select * from person order by pid;

rollback to SAVEPOINT B; -- SAVEPOINT B 까지 rollback
select * from person order by pid;  -- t1,t2,t3,t4 존재 t5,t6 삭제됨
rollback to SAVEPOINT A; -- SAVEPOINT A 까지 rollback
select * from person order by pid;  -- t1,t2 존재 t3,t4 삭제됨

rollback;		-- 이전 commit 직전까지 작업내용 취소  t1,t2  삭제됨
select * from person order by pid;

/*
transection - insert, update, delete 만 사용할 것

DDL 이나 DCL 에서는 사용금지
create table menu_4(
	title text,
	price int
);

insert into menu_4 values ('미쳤네',1234);

select * from menu_4;
*/

