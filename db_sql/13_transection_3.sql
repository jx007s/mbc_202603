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


