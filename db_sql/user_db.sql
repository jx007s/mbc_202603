-- 버전확인
select version();

-- 사용자조회
select * from pg_shadow;

-- 유저생성
create user busan_user with PASSWORD '123456' login;

-- database생성
create DATABASE busan_db;

-- 권한부여

