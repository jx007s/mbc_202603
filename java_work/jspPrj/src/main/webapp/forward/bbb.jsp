<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbb</title>
</head>
<body>
	<h1>bbb</h1>
	<%-- <br/><%=aa1 %>, <%=aa2 %><br/> --%>
	
	<p>
		<%=request.getAttribute("pname") %>,
		<%=Arrays.toString((int [])request.getAttribute("arr"))%>,
		<%=request.getAttribute("marriage") %>,
		<%=request.getAttribute("st1") %>
	</p>
	
</body>
</html>