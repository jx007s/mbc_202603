<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
<h1>modify</h1>
<%

	Cookie coo4 = new Cookie("pid","bbb");
	Cookie coo5 = new Cookie("job","독사");
	
	//클라이언트 응답객체에 쿠키 추가
	response.addCookie(coo4);
	response.addCookie(coo5);
	
%>
</body>
</html>