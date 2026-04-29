<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remove</title>
</head>
<body>
<h1>remove</h1>
<%
	application.removeAttribute("pname");
	application.removeAttribute("marriage");

%>
</body>
</html>
examForm --> examReg 추가
examView --> 학생보기
examDelete --> 학생제거
