insert into person (pid, pame) values ('u1','일타니');


begin;  --autocommit ON 이어도 명시적 트랜젝션 시작

-- commit 까지 자동반영하지 않음
insert into person (pid, pame) values ('u2','이타니');
insert into person (pid, pame) values ('u3','삼타니');

commit;  -- commit 시점이후로 begin으로 설정한 명시적 트랜젝션 해제
		--  autocommit ON으로 다시 돌아옴

--  autocommit ON으로 자동 반영
insert into person (pid, pame) values ('u4','사타니');
insert into person (pid, pame) values ('u5','오타니');


-- 교수 3명 입력
-- 시험 2개 입력
-- 시험 1개 취소
-- person 1명 입력
-- 교수 2명만 남기고 취소
-- 저장
-- person 3명 입력
-- 1명 취소
-- 저장

begin;
insert into professor (pid, "NAME", "TEL") values ('pf11','덤블도어','136');
insert into professor (pid, "NAME", "TEL") values ('pf12','스네이프','258');
SAVEPOINT s1;
insert into professor (pid, "NAME", "TEL") values ('pf13','헤그리드','369');

insert into exam (id, name, pid, kor, eng, mat) values (17,'semi','u1',68,67,69);
SAVEPOINT s2;
insert into exam (id, name, pid, kor, eng, mat) values (18,'semi','u2',98,97,99);

rollback to SAVEPOINT s2;

insert into person(pid, pame) values ('v1','김케빈');

rollback to SAVEPOINT s1;

insert into person(pid, pame) values ('v2','김라라');
insert into person(pid, pame) values ('v3','김롤롤');
SAVEPOINT s3;
insert into person(pid, pame) values ('v4','기로로');

rollback to SAVEPOINT s3;

commit;

select * from professor;
select * from exam;
select * from person;





