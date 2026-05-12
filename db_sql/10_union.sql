create table menu_1(
	title "varchar",
	price int,
	cnt int
);

create table menu_2(
	title "varchar",
	price int
);

create table menu_3(
	title "varchar",
	price int,
	cnt int
);

insert into menu_1(title, price, cnt) values
('아메리카노',1900,2),
('아프리카노',2000,1),
('아시아노',2300,3);

insert into menu_2(title, price) values
('김치찌개',7500),
('된장찌개',6000),
('아메리카노',1900),
('아시아노',2500);

insert into menu_3(title, price, cnt) values
('신라면',1500,5),
('고려면',1700,4),
('조선면',1800,6),
('김치찌개',9000,2),
('아프리카노',2000,1),
('아시아노',5000,3);

select * from menu_1;
select * from menu_2;
select * from menu_3;


-- union : 합집합
-- 중복정보 1개만
select title from menu_1
union
select title from menu_2;

-- 모든 컬럼 데이터가 같아야 중복
select title, price from menu_1
union
select title, price from menu_2;

-- 중복허용
select title, price from menu_1
union all
select title, price from menu_2;

-- 컬럼 타입과 컬럼갯수가 같으면 집합 연산 가능
select title, cnt from menu_1
union
select title, price from menu_2;

-- 컬럼 타입이 맞지 않아 에러발생
/*
select cnt, price from menu_1
union
select title, price from menu_2;
*/
-- 컬럼 갯수가 맞지 않아 에러발생
/*
select title,price, cnt from menu_1
union
select title, price from menu_2;
*/

-- 갯수를 맞추기 위해 임의의 값으로 cnt 컬럼을 대체
select title,price, cnt from menu_1
union
select title, price, 100 from menu_2;

-- 2개이상 결합 가능
select title,price, cnt from menu_1
union
select title, price, 100 from menu_2
union
select title,price, cnt from menu_3;

-- intersect : 교집합
select title from menu_1
intersect
select title from menu_2;

select title from menu_1
intersect
select title from menu_2
intersect
select title from menu_3;


-- EXCEPT : 차집합
-- menu_1 - menu_2
select title from menu_1
EXCEPT
select title from menu_2;

-- menu_2 - menu_1
select title from menu_2
EXCEPT
select title from menu_1;

select title from menu_1
union
select title from menu_2  -- 김치찌개,아프리카노,아시아노,아메리카노,된장찌개
EXCEPT
select title from menu_3;  -- "신라면","고려면","조선면","김치찌개","아프리카노","아시아노"

/*
(김치찌개,아프리카노,아시아노,아메리카노,된장찌개) - 
(신라면,고려면,조선면,김치찌개,아프리카노,아시아노)
= 아메리카노,된장찌개
*/

select title from menu_1
union
(select title from menu_2  -- 김치찌개,아프리카노,아시아노,아메리카노,된장찌개
EXCEPT
select title from menu_3);

/*
(아메리카노,아프리카노,아시아노) +
((김치찌개,된장찌개,아메리카노,아시아노)-(신라면,고려면,조선면,김치찌개,아프리카노,아시아노))
------------------------------------
(아메리카노,아프리카노,아시아노) +
(된장찌개,아메리카노)
--------------------------------------
= 아프리카노,아시아노,아메리카노,된장찌개
*/

