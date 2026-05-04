<%@page import="java.util.Set"%>
<%@page import="basic_p.JoinDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
<h1>make</h1>
<%
	session.setAttribute("pid", "zxcv");
	session.setAttribute("arr", new int[]{11,22,33,44});
	session.setAttribute("dto", new JoinDTO("aaa","1111","정우성"));
	
%>
</body>
</html>