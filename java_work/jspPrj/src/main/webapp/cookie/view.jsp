<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
<h1>view</h1>
<%
	//클라이언트 요청시 전달된 쿠키 가져오기
	Cookie [] arr = request.getCookies();

	for(Cookie coo: arr){
		out.println(coo.getName()+":"+coo.getValue()+"<br/>");
	}
%>
</body>
</html>