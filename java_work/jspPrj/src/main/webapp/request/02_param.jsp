<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_param</title>
</head>
<body>
	<h1>02_param</h1>
	<%
		String pid = request.getParameter("pid");
	%>
	pid : <%=request.getParameter("pid") %>, <%=pid %><br/>
	age : <%=request.getParameter("age") %><br/>
	marriage : <%=request.getParameter("marriage") %><br/>
</body>
</html>