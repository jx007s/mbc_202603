<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수퍼맨</title>
<style>
img{
	width:200px;
}
</style>
</head>
<body>
<h1>수퍼맨입니다</h1>

<br/>

<% 
for(int i = 0; i<Integer.parseInt(request.getParameter("cnt") );i++){
%>
<img src="../../fff/CZRF0751.JPG" alt="" />
<%} %>
</body>
</html>