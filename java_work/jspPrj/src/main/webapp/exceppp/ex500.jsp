<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex500</title>
</head>
<body>
<h1>ex500</h1>
exception : 예외처리페이지에서 예외처리객체 호출<br/>
exception 내장객체 사용하기 위해서는 
page dircetive 에서 isErrorPage="true" 지정 필수<br/>
<%=exception.getMessage() %><br/>
</body>
</html>