-- 버전확인
select version();

-- 사용자조회
select * from pg_shadow;

-- 유저생성
create user busan_user with PASSWORD '123456' login;

-- database생성
create DATABASE busan_db;

-- 권한부여
alter database busan_db owner to busan_user;

-- 위치 : C:\Program Files\PostgreSQL\18\data\pg_hba.conf

-- 파일 하단에 작성(-- 주석은 제거하세요)
--# 외부 접근 모두 허용
--host    all     all             0.0.0.0/0            scram-sha-256

