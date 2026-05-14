select * from exam
order by id
limit 5 offset 0; 

select * from exam
order by id
limit 5 offset 5; 

select * from exam
order by id
limit 5 offset 10; 
/*
limit 갯수
offset 가져오는 시작위치 : 0부터 시작


1페이지당 게시물이 10개인 경우
1페이지 : limit 10 offset 0; 
2페이지 : limit 10 offset 10; 
3페이지 : limit 10 offset 20; 
...

1페이지당 게시물이 5개인 경우
1페이지 : limit 5 offset 0; 
2페이지 : limit 5 offset 5; 
3페이지 : limit 5 offset 10; 
...


1페이지당 게시물이 n개인 경우
1페이지 : limit n offset (1-1)*n; 
2페이지 : limit n offset (2-1)*n; 
3페이지 : limit n offset (3-1)*n;
...
공식 :  limit n offset (페이지번호-1)*n;

https://jdbc.postgresql.org/
*/