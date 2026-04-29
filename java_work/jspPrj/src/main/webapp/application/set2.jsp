<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set2</title>
</head>
<body>
<h1>set2</h1>
<%
	application.setAttribute("pname", List.of(12,34,56,78)); //추가, 변경
	application.setAttribute("marriage",false);
%>
</body>
</html>