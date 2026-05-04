<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="basic_p.JoinDTO"%>
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
	session.setAttribute("pid", "asdf");
	session.setAttribute("ss", Set.of("티라노","브라키오","프테라노돈"));
	
%>
</body>
</html>