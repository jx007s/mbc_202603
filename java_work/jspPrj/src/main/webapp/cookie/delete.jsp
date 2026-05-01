<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
<h1>delete</h1>
<%

	Cookie coo4 = new Cookie("pid","");
	coo4.setMaxAge(0);		//쿠키의 유지시간 (초단위) : -1 인경우 브라우저가 지원하는 최대 시간유지
							// 0인경우 바로 삭제
	Cookie coo5 = new Cookie("pname","5초뒤사망");
	coo5.setMaxAge(5);
	
	//클라이언트 응답객체에 쿠키 추가
	response.addCookie(coo4);
	response.addCookie(coo5);
	
%>
</body>
</html>